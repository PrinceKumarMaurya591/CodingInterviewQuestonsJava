package org.example.binarytree;

public class BinaryTree {

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




        System.out.println("Printing Inorder: ");
        printInorder(root);
        System.out.println("\n");
        System.out.println("Printing preorder: ");
        preorder(root);
        System.out.println("\n");
        System.out.println("Printing postorder: ");
        postorder(root);
        System.out.println("\n");
        System.out.println("Printing heightOfBinaryTree: "+heightOfBinaryTree(root)+"\n"); 
        System.out.println("Printing sizeOfBinaryTree: "+sizeOfBinaryTree(root)+"\n");
        System.out.println("Printing maxInBinaryTree: "+maxInBinaryTree(root)+"\n");
        System.out.println("Nodes at distance " + 2 + ":");
        printNodesAtKDistance(root,3);
    }

    public static void  printInorder(Node root) {
        if (root != null) {
            printInorder(root.left);
            System.out.print(root.data + " ");
            printInorder(root.right);

        }
    }

    public static void  preorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);

        }
    }


    public static void  postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");

        }
    }

/*     For the given sample tree:
    1
    / \
   2   3
  / \   \
 4   5   6

 The output will be:

Height of the binary tree: 3 */

    public static int heightOfBinaryTree(Node root){
        if(root == null){
            return 0;
            }
            else{
                int leftHeight = heightOfBinaryTree(root.left);
                int rightHeight = heightOfBinaryTree(root.right);
                    return Math.max(leftHeight, rightHeight) + 1;
            }
    }


  public static int sizeOfBinaryTree(Node root){
    if(root == null){
        return 0;
        }
        else{
            int leftSize = sizeOfBinaryTree(root.left);
            int  rightSize = sizeOfBinaryTree(root.right);
            return leftSize + rightSize + 1;
        }
    }
  public static int  maxInBinaryTree(Node root){
        if(root == null){
            return Integer.MIN_VALUE;
            }
            else{
                int leftMax = maxInBinaryTree(root.left);
                int rightMax = maxInBinaryTree(root.right);
                return Math.max(root.data, Math.max(leftMax, rightMax));
                }
            }



/*             For the given binary tree:

                1
            /       \
         2            3
       /   \        /    \
     4      5      6      7
    / \    / \    / \    / 
   8   9  10 11  12 13  14
Nodes at distance 
𝐾=2
K=2 would be: 4 5 6 7. */


   // Method to print all nodes at distance K from the root
   public static void printNodesAtKDistance(Node root, int k) {
    if (root == null) {
        return;
    }
    if (k == 0) {
        // If K is 0, print the current node's data
        System.out.print(root.data + " ");
        return;
    }

    // Recursively call for left and right subtrees with k-1
    printNodesAtKDistance(root.left, k - 1);
    printNodesAtKDistance(root.right, k - 1);
}
}
