/*
Algorithm:
1. Manually create nodes and link them to form a binary tree.
2. Use inorder traversal (left, node, right) recursively to print values.

Sample output:
Inorder: 1 2 3 4 5 6
*/

public class BeginnerBinaryTree {
    static class Node {
        int data;
        Node left, right;
        Node(int d) { data = d; }
    }

    static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(6);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.left = new Node(5);

        System.out.print("Inorder: ");
        inorder(root);
        System.out.println();
    }
}
