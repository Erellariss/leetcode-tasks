package practical.lru;

import java.util.concurrent.locks.ReentrantLock;

public class ConcurrentDll {
    private final ReentrantLock dllLock = new ReentrantLock();
    private final Node head;
    private final Node tail;

    public ConcurrentDll() {
        head = new Node();
        tail = new Node();
        head.state = tail.state = DllState.DEAD;
        head.next = tail;
        tail.prev = head;
    }

    public DllState moveToHead(Node node) {
        if (node == null) {
            return null;
        }
        dllLock.lock();
        try {
            DllState state = node.state;
            if (state == DllState.DEAD) {
                return DllState.DEAD;
            }
            if (state == DllState.LINKED) {
                unlink(node);
            }
            linkAfterHead(node);
            return DllState.LINKED;
        } finally {
            dllLock.unlock();
        }
    }

    public Node removeTail() {
        dllLock.lock();
        try {
            Node prev = tail.prev;
            if (prev == head || prev.state != DllState.LINKED) {
                throw new IllegalStateException();
            }
            unlink(prev);
            prev.state = DllState.DEAD;
            return prev;
        } finally {
            dllLock.unlock();
        }
    }

    private void linkAfterHead(Node node) {
        if (node.state == DllState.DEAD) {
            throw new IllegalStateException();
        }
        Node first = head.next;
        first.prev = node;
        head.next = node;
        node.prev = head;
        node.next = first;
        node.state = DllState.LINKED;
    }

    private void unlink(Node node) {
        if (node.state != DllState.LINKED) {
            throw new IllegalStateException();
        }
        var prev = node.prev;
        var next = node.next;
        prev.next = next;
        next.prev = prev;

        node.next = null;
        node.prev = null;
        node.state = DllState.DETACHED;
    }
}
