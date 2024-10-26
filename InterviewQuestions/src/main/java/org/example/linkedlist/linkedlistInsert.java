package org.example.linkedlist;

public class linkedlistInsert {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
        Node fifth = new Node(50);

        head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        printNode(head);

        // Insert a new node at the beginning using InsertAtBeginning class
        head = InsertInLinkedList.insertNodeAtBegning(head, 5);

        // Print updated list
        System.out.println("Updated List after inserting 5 at the beginning:");
        printNode(head);


         // Insert a new node at a specific position using InsertAtPosition class
         head = InsertInLinkedList.insertAtPosition(head, 3, 25);

         // Print updated list
         System.out.println("Updated List after inserting 25 at position 3:");
         printNode(head);


         // Delete a node at a specific position using DeleteAtPosition class
         head = DeletionInLinkedList.deleteANodeAtAGivenPosition(head, 3);

        // Print updated list after deletion
        System.out.println("Updated List after deleting node at position 3:");
        printNode(head);

      
    }
    public static void printNode(Node  head) {

        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
