package practical.lru;

import static practical.lru.DllState.*;

public class Node {
    Integer key;
    Integer value;

    Node prev;
    Node next;
    volatile DllState state = NEW;

    public Node(int key, int value) {
        this.key = key;
        this.value = value;
    }

    public Node() {
    }
}
