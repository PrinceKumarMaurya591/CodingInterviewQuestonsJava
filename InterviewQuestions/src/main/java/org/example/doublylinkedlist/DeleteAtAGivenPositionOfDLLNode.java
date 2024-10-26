package org.example.doublylinkedlist;

public class DeleteAtAGivenPositionOfDLLNode {

    public static Node deleteANodeAtAGivenPosition(Node head,int position){
            if(head == null || position < 1){
                System.out.println("Invalid position");
                return  head;
                }
                if(position == 1){
                    return head.next;
                    }
                    Node current = head;
                    for(int i=0;i<position-1;i++){
                        current = current.next;
                    }
                    current.next = current.next.next;
                    return head;
                    



    }

}
