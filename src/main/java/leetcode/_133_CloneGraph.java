package leetcode;

import leetcode.utils.Node;

public class _133_CloneGraph {

    public Node cloneGraph(Node root) {
        if (root == null) {
            return null;
        }
        Node[] map = new Node[101];
        return traverse(root, map);
    }

    private Node traverse(Node original, Node[] cloneMap) {
        Node clone = cloneMap[original.val];
        if (clone != null) {
            return clone;
        }
        clone = cloneMap[original.val] = new Node(original.val);
        for (Node neighbor : original.neighbors) {
            clone.neighbors.add(traverse(neighbor, cloneMap));
        }
        return clone;
    }
}
