package LinkedArray;


public class Node {
    int val;
    String sval;
    Node next;

    public Node(int val) {
        this.val = val;
    }

    public Node(String sval) {
        this.sval = sval;
    }

    @Override
    public String toString() {
        return "[" + val +"]";
    }
}
