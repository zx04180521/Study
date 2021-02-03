package LinkedArray;


public class Node {
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "[" + val +"]";
    }
}
