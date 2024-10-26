package org.example.linkedlist;

public class DeletionInLinkedList {

    public static Node deleteANodeAtAGivenPosition(Node head,int position){
        if(head == null || position < 0){
            return head;
        }
        if(position == 0){
            return head.next;
        }
        Node curr=head;
        for(int i=0;i<position;i++){
             curr=curr.next;
        }
        curr.next=curr.next.next;
        return head;
    }

}
