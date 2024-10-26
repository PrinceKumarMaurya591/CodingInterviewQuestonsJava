package org.example.doublylinkedlist;

public class InsertAtAGivenPosition {

public static Node  insertAtGivenPosition(Node head, int data, int position) {
    Node newNode = new Node(data);
    
    // Case 1: Inserting at the head (position 0)
    if (position == 0) {
        newNode.next = head;
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
        return head;
    }

    // Traverse to the node just before the target position
    Node current = head;
    for (int i = 0; i < position - 1; i++) {
        if (current == null) {
            System.out.println("Position is out of bounds");
            return head;
        }
        current = current.next;
    }

    // Case 2: Inserting in between or at the end
    newNode.next = current.next;
    if (current.next != null) {
        current.next.prev = newNode;
    }
    current.next = newNode;
    newNode.prev = current;
    return head;
}



}
