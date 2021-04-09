package LeetCode;
/*复制带随机指针的链表*/
import java.util.HashMap;
import java.util.Map;


class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
public class LeetCode_138 {
    public static void main(String[] args) {

    }
    public Node copyRandomList(Node head) {
        Map<Node,Node> map=new HashMap<>();
        for(Node cur=head;cur!=null;cur=cur.next)
        {
            map.put(cur,new Node(cur.val));
        }
        for(Node cur=head;cur!=null;cur=cur.next){
            Node newCur=map.get(cur);
            Node curNext=map.get(cur.next);
            newCur.next=curNext;
            Node newRandom=map.get(cur.random);
            newCur.random=newRandom;
        }
        return map.get(head);

    }
}
