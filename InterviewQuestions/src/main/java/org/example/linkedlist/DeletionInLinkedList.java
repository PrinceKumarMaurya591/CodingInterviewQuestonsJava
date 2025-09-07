package org.example.linkedlist;

public class DeletionInLinkedList {

// पिछले node (position-1) तक पहुँचना:
// हम curr pointer को head से शुरू करते हैं।
// फिर position-1 तक iterate करते हैं ताकि curr उस node को point करे जो हटाने वाले node से एक position पहले हो।
// इस दौरान अगर curr या curr.next null हो जाए (यानि position list की लंबाई से बड़ी हो), तो मूल list को बिना किसी परिवर्तन के return कर देते हैं।
// Node delete करना:
// यदि curr.next null नहीं है, तो हम उस node (जो delete करनी है) के अगले node को curr.next.next के साथ जोड़ते हैं।
// इसका मतलब curr.next अब उस node को skip कर देता है जिसे हटाना है।
// Updated head return करना:
// अंत में head लौटाते हैं, जो updated linked list की शुरुआत होगी।


   public static Node deleteANodeAtAGivenPosition(Node head, int position) {
    if (head == null || position < 0) {
        return head;
    }
    
    // अगर पहला node डिलीट करना हो
    if (position == 0) {
        return head.next;
    }
    
    Node curr = head;
    for (int i = 0; i < position - 1; i++) {
        if (curr == null || curr.next == null) {
            // position list की length से बाहर है
            return head;
        }
        curr = curr.next;
    }
    
    if (curr.next != null) {
        curr.next = curr.next.next;
    }
    
    return head;
}
