package MyLinkedList;

public class MyLinkedList
    {
        @Override
        public String toString() {
            return "MyLinkedList{" +
                    "head=" + head.val +
                    ", tail=" + tail.val +
                    '}';
        }
        public static void printList(ListNode head) {
            ListNode cur = head;
            while (cur != null) {
                System.out.println(cur.val);
                cur = cur.next;
            }
        }
        public ListNode head=null;//头结点
        private ListNode tail=null;//尾节点
        private int length=0;//记录链表长度
        //头插
        public void addFirst(int val){
            ListNode newNode=new ListNode(val);//为val创建新节点
            //链表为空时，将新节点赋给头尾结点并返回
            if(head==null){
                head=newNode;
                tail=newNode;
                length++;
                return;
            }
            //链表不为空时。头插新节点
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
            length++;
        }
        //尾插
        public void addLast(int val){
            ListNode newNode=new ListNode(val);//为val创建新节点
            //链表为空时，将新节点赋给头尾结点并返回
            if(tail==null){
                head=newNode;
                tail=newNode;
                length++;
                return;
            }
            //链表不为空时，尾插新节点
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;//更新尾结点
        }
        //指定位置插入
        public void add(int index,int val){
            ListNode newNode=new ListNode(val);//为val创建新节点
            //当下标输入错误时
            if(index<0||index>length){
                System.out.print("位置输入错误");
                return;
            }
            //下标等于0，直接调用头插操作
            if(index==0){
                addFirst(val);
                return;
            }
            //下标等于长度，调用尾插操作
            if(index==length){
                addLast(val);
                return;
            }

            ListNode curNode=getNode(index);//调用按位置获取结点方法获取index下标位置的结点
            ListNode preNode=curNode.prev;//要插入位置的前一个结点
            //插入新节点
            preNode.next=newNode;
            newNode.prev=preNode;

            newNode.next=curNode;
            curNode.prev=newNode;

            length++;
        }
        //头删
        public void removeFirst(){
            //链表为空
            if(head==null){
                return;
            }
            //链表只有一个节点
            if(head.next==null){
                head=null;
                tail=null;
                length=0;
                return;
            }
            head.next.prev=null;//删除头结点
            head=head.next;//更新头结点
            length--;
        }
        //尾删
        public void removeLast(){
            //链表为空
            if(head==null){
                return;
            }
            //链表只有一个节点
            if(head.next==null){
                head=null;
                tail=null;
                length=0;
                return;
            }
            tail.prev.next=null;//删除尾结点
            tail=tail.prev;//更新尾结点
            length--;
        }
        public int size(){
            return length;
        }
        //按照下标删除
        public void removeByIndex(int index){
            //输入的下标不合法时
            if(index<0||index>=length){
                return;
            }
            //下标为0，调用头删操作
            if(index==0){
                removeFirst();
                return;
            }
            //下标为尾结点，调用尾删操作
            if(index==length-1){
                removeLast();
                return;
            }

            ListNode cur=getNode(index);//调用按位置获取结点方法得到下标的结点
            //删除当前结点
            cur.prev.next=cur.next;
            cur.next.prev=cur.prev;
            length--;
        }
        //按给定值值删除
        public void removeByVal(int value){
            int index=getIndex(value);//获取当前值对应的下标
            //下标不合法时
            if(index==-1){
                return;
            }
            removeByIndex(index);//调用按照位置删除的操作
        }

        //按值获取下标
        public int getIndex(int value){
            ListNode cur=head;
            //循环遍历，找对应值
            for(int i=0;i<length;i++){
                //当找到对应值的，返回对应下标
                if(cur.val==value){
                    return i;
                }
                    cur=cur.next;
            }
            return -1;
        }
        //按位置获取结点
        public ListNode getNode(int index){
            ListNode cur=head;
            //当位置输入有误
            if(index<0||index>=length){
                return null;
            }
            //通过for循环遍历到当前结点
            for(int i=0;i<index;i++){
                cur=cur.next;
            }
            return cur;
        }
        public int get(int index){
            if(index<0||index>=length){
                return -1;
            }
            return getNode(index).val;
        }
        public void set(int index,int value){
            if(index<0||index>=length){
                return;
            }
            getNode(index).val=value;
        }

    }


