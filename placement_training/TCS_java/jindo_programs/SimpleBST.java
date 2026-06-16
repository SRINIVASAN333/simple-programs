/*
Algorithm:
1. Start with empty root.
2. Insert values one by one: if value < node.data go left, else go right.
3. Search by comparing key with node.data and moving left/right until found or null.

Sample output:
BST inorder: 20 30 40 50 60 70 80
Search 60: Found
Search 25: Not found
*/

public class SimpleBST {
    static class Node {
        int data;
        Node left, right;
        Node(int d) { data = d; }
    }

    static Node insert(Node root, int val) {
        if (root == null) return new Node(val);
        if (val < root.data) root.left = insert(root.left, val);
        else if (val > root.data) root.right = insert(root.right, val);
        return root;
    }

    static boolean search(Node root, int key) {
        if (root == null) return false;
        if (root.data == key) return true;
        if (key < root.data) return search(root.left, key);
        return search(root.right, key);
    }

    static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        Node root = null;
        int[] vals = {50, 30, 70, 20, 40, 60, 80};
        for (int v : vals) root = insert(root, v);

        System.out.print("BST inorder: ");
        inorder(root);
        System.out.println();

        int s1 = 60;
        int s2 = 25;
        System.out.println("Search " + s1 + ": " + (search(root, s1) ? "Found" : "Not found"));
        System.out.println("Search " + s2 + ": " + (search(root, s2) ? "Found" : "Not found"));
    }
}
