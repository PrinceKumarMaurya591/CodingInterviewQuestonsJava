package org.example.binarysearchtree;

import javax.swing.tree.TreeNode;

public class BST {

    Node  root;
    // Insert a new value into the BST
    void insert(int value) {
        root = insertRec(root, value);
    }

     // Recursive function to insert a new value
    Node insertRec(Node node, int value) {
        // If the tree is empty, return a new node
        if (node == null) {
            node = new Node(value);
            return node;
        }

        // Otherwise, recur down the tree
        if (value < node.value) {
            node.left = insertRec(node.left, value);
        } else if (value > node.value) { // Ignore duplicates
            node.right = insertRec(node.right, value);
        }
  // Return the (unchanged) node pointer
  return node;
    }

     // In-order traversal to print the tree
     void inOrder() {
        inOrderRec(root);
    }

    void inOrderRec(Node node) {
        if (node != null) {
            inOrderRec(node.left);
            System.out.print(node.value + " ");
            inOrderRec(node.right);
        }
    }



 // Search for a value in the BST
    boolean search(int value) {
        return searchRec(root, value);
    }

    // Recursive function to search for a value
    boolean searchRec(Node node, int value) {
        // Base case: node is null or value is found
        if (node == null) {
            return false; // Value not found
        }
        if (node.value == value) {
            return true; // Value found
        }

        // Decide to go left or right
        if (value < node.value) {
            return searchRec(node.left, value);
        } else {
            return searchRec(node.right, value);
        }
    }


// Delete a node from the BST
Node delete(int value) {
    return deleteRec(root, value);
}

// Recursive function to delete a value
Node deleteRec(Node node, int value) {
    if (node == null) {
        return null; // Value not found
    }

    // Recur down the tree
    if (value < node.value) {
        node.left = deleteRec(node.left, value);
    } else if (value > node.value) {
        node.right = deleteRec(node.right, value);
    } else {
        // Node with only one child or no child
        if (node.left == null) {
            return node.right;
        } else if (node.right == null) {
            return node.left;
        }

        // Node with two children: Get the inorder successor (smallest in the right subtree)
        node.value = minValue(node.right);

        // Delete the inorder successor
        node.right = deleteRec(node.right, node.value);
    }

    return node;
}

// Utility function to find the minimum value in a tree
int minValue(Node node) {
    int minValue = node.value;
    while (node.left != null) {
        minValue = node.left.value;
        node = node.left;
    }
    return minValue;
}



 // Print the tree structure
 void printTree() {
    printTreeRec(root, 0);
}

void printTreeRec(Node node, int space) {
    if (node == null) {
        return;
    }

    space += 10; // Increase distance between levels

    // Process right child first
    printTreeRec(node.right, space);

    // Print current node after space
    System.out.print("\n");
    for (int i = 10; i < space; i++) {
        System.out.print(" ");
    }
    System.out.print(node.value);

    // Process left child
    printTreeRec(node.left, space);
}


}
