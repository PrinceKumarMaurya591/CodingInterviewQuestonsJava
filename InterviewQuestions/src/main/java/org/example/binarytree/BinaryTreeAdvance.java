package org.example.binarytree;
import java.util.*;


public class BinaryTreeAdvance {

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.left.left.left = new Node(8);
        root.left.left.right = new Node(9);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(19);
        root.right.left.left = new Node(12);
        root.right.left.right = new Node(13);
        root.right.right.left = new Node(14);

      /*   Binary Tree Structure:
            1
        /       \
     2            3
   /   \        /    \
 4      5      6      7
/ \    / \    / \    / 
8   9  10 11  12 13  14 */

System.out.println("Printing levelOrderTraversal: ");
levelOrderTraversal(root);
System.out.println("\n"+"Printing printLeftViewUtil: ");
printLeftViewUtil(root, 1, new int[]{0});

    }
public static void levelOrderTraversal(Node root){
    if(root == null) return;
    
     // Queue for holding nodes at each level
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            // Remove the front node from the queue and print it
            Node current = queue.poll();
            System.out.print(current.data + " ");

            // Enqueue left child if it exists
            if (current.left != null) {
                queue.add(current.left);
            }

            // Enqueue right child if it exists
            if (current.right != null) {
                queue.add(current.right);
            }
        }
    }


    // Utility function to print the left view using recursion
    private static void printLeftViewUtil(Node node, int level, int[] maxLevel) {
        if (node == null) {
            return;
        }

        // If this is the first node of this level, then print it
        if (maxLevel[0] < level) {
            System.out.print(node.data + " ");
            maxLevel[0] = level;
        }

        // Recur for the left subtree first, then for the right subtree
        printLeftViewUtil(node.left, level + 1, maxLevel);
        printLeftViewUtil(node.right, level + 1, maxLevel);
    }


}
