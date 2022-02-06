package test;
// 请你实现两个功能：
//1.实现一个单链表删除一个指定节点，其节点数据为value
//2.实现约瑟夫环，从first 结点开始123 报数，每报到3 时当前元素出队，并删除该节点。
public class MyLinkedList {
    private Node first; // head pointer of linkedlist
    private Node last; // tail pointer of linkedlist
    private int size = 0;
    //增加一个新的元素到链表的尾部
    public void addLast(int value) {
        Node node = new Node(value);
        if(first==null) {
            first = last = node;
        }
        else {
            last.next = node;
            last = node;
        }
        size++;
    }
    //设置链表为循环链表
    public void setCycleList()
    {
        last.next = first;
    }
    /*
     * 删除一个指定节点，其节点数据为value
     */
    public boolean delNode(int value) {
        while (first.value!=value){
            first=first.next;
            last=last.next;
        }
        last.next=first.next;
        first=first.next;
        return true;
    }
    /*
     * 实现约瑟夫环，从first 结点开始123 报数，每报到3 时当前元素出队，并删除该节点
     */
    public void printNode() {
        Node a= first;
        for(int i=1;size>0;){
            a=a.next;
            i++;
            if(i%3==0){
                System.out.println(a.value);
                size--;
                delNode(a.value);
            }
        }
    }
    class Node{
        private int value;
        private Node next;
        public Node(int value) {
            super();
            this.value = value;
            this.next = next;
        }
    }
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        for(int i=1; i<=10;i++)
            list.addLast(i);
        list.setCycleList();
        list.printNode();
    }
}
