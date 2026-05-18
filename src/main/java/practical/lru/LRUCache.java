package practical.lru;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

public class LRUCache {

    private final ConcurrentHashMap<Integer, Node> lru;
    private final ConcurrentDll dll = new ConcurrentDll();
    private final AtomicInteger size = new AtomicInteger();
    private final ReentrantLock evictionLock = new ReentrantLock();

    private final int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        lru = new ConcurrentHashMap<>(this.capacity + 1, 1.0f);
    }

    public void put(int key, int value) {
        lru.compute(key, (integer, node) -> {
            boolean isNewNode = false;
            if (node == null) {
                node = new Node(key, value);
                isNewNode = true;
            }
            DllState dllState = dll.moveToHead(node);
            if (isNewNode && dllState == DllState.LINKED) {
                size.incrementAndGet();
            }
            if (dllState != DllState.LINKED) {
                lru.remove(key, node);
                return null;
            }
            if (size.get() > capacity) {
                evictionLock.lock();
                try {
                    if (size.get() > capacity) {
                        Node removedTail = dll.removeTail();
                        lru.remove(removedTail.key, removedTail);
                        size.decrementAndGet();
                    }
                } finally {
                    evictionLock.unlock();
                }
            }
            return node;
        });
    }

    public int get(int key) {
        var node = lru.get(key);
        if (node == null || dll.moveToHead(node) == DllState.DEAD) {
            return -1;
        }
        return node.value;
    }
}