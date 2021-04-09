package MapAndSet;

/*
LeetCode138
复制带随机指针的链表*/
import java.util.HashMap;
import java.util.Map;


public class CopyRandomList {

    public static void main(String[] args) {

    }
    static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
    public static Node copyRandomList(Node head) {
        Map<Node,Node> map=new HashMap<>();
        for(Node cur=head;cur!=null;cur=cur.next) {
            map.put(cur,new Node(cur.val));
        }
        for(Node cur=head;cur!=null;cur=cur.next){
            Node newCur=map.get(cur);
            Node curNext=map.get(cur.next);
            Node newRandom=map.get(cur.random);
            newCur.next=curNext;
            newCur.random=newRandom;
        }
        return map.get(head);

    }
}
