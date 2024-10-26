package org.example.linkedlist;

public class InsertInLinkedList {
   
    public static Node insertNodeAtBegning(Node head,int data){
        Node temp=new Node(data);
        temp.next=head;
        head=temp;
        return head;
    }

    public static Node insertAtPosition(Node head, int positon, int data){
        Node temp = new Node(data);
        Node curr=head;
        for(int i=0;i<positon-1;i++){
            curr=curr.next;
        }
        temp.next=curr.next;
        curr.next=temp;
        return head;
    }


}
