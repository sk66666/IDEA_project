package test;

import javax.swing.*;

public class 栈 {
    class Node{
        private int data;
        private Node next;
    }
    private Node head;
    栈(){
      head=null;
    }
    public void push(int data){
        if(head ==null){
            head = new Node();
            head.data=data;
            head.next=null;
        }else {
            Node temp=head;
            head = new Node();
            head.data=data;
            head.next=temp;
        }
    }

    public int pop(){
        int data=head.data;
        head=head.next;
        return data;
    }
    public boolean isEmpty(){
        return head==null;
    }
}


