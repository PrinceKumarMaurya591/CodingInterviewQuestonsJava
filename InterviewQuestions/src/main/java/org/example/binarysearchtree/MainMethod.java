package org.example.binarysearchtree;

import javax.swing.tree.TreeNode;

public class MainMethod {

    public static void main(String[] args) {
        BST bst = new BST();

     /* 10
       /  \
      5    15
     / \
    3   7 */


        bst.insert(10);
        bst.insert(5);
        bst.insert(15);
        bst.insert(3);
        bst.insert(7);

        System.out.print("In-order traversal: ");
        bst.inOrder();  // Output: 3 5 7 10 15
    

/* 
    After inserting 6, the BST will look like this:
    10
    /  \
   5    15
  / \
 3   7
    /
   6

 */

 // Inserting the new value
 bst.insert(6);  // Insert the new node

 System.out.print("In-order traversal after inserting 6: ");
 bst.inOrder();  // Output: 3 5 6 7 10 15



 int target = 9;
 if (bst.search(target)) {
     System.out.println("Value " + target + " found in the BST.");
 } else {
     System.out.println("Value " + target + " not found in the BST.");
 }


 bst.delete(5);  // Deleting node with value 5

 System.out.print("In-order after deletion: ");
 bst.inOrder();  // Output: 3 7 10 15
System.out.println();


System.out.println("Tree structure after deletion:");
        bst.printTree();


    }




}
