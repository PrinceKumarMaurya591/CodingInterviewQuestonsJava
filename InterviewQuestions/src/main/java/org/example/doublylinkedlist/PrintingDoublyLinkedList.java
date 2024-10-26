package org.example.doublylinkedlist;

public class PrintingDoublyLinkedList {

    public static void main(String[] args) {
        
        Node head=new Node(10);
        Node second=new Node(20);
        Node third=new Node(30);
        Node fourth=new Node(40);
        Node fifth=new Node(50);
        

        head.next=second;
        head.prev=null;
        second.next=third;
        second.prev=head;
        third.next=fourth;
        third.prev=second;
        fourth.next=fifth;
        fourth.prev=third;
        fifth.prev=fourth;
        fifth.next=null;

        printingDoublyLinkedList(head);



        InsertAtAGivenPosition.insertAtGivenPosition(head, 90, 3);
        printingDoublyLinkedList(head);

        DeleteAtAGivenPositionOfDLLNode.deleteANodeAtAGivenPosition(head,4);
        System.out.println("After deletion Node at position 4: ");

        printingDoublyLinkedList(head);

    }

    private static void printingDoublyLinkedList(Node head) {
    Node curr=head;
    while(curr!=null){
        System.out.print(curr.data+" ");
        curr=curr.next;
        }
    
    }



}
