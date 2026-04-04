import java.util.Scanner;

public class SimpleLinkedListArray {
    static int[] arr = new int[100]; 
    static int n = 0;
    static void insertAtBeginning(int value) {
        for (int i = n; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = value;
        n++;
    }
    static void insertAtEnd(int value) {
        arr[n] = value;
        n++;
    }

    // Insert at position (0-based)
    static void insertAtPosition(int value, int pos) {
        if (pos < 0 || pos > n) {
            System.out.println("Invalid position!");
            return;
        }
        for (int i = n; i > pos; i--) {
            arr[i] = arr[i - 1];
        }
        arr[pos] = value;
        n++;
    }

    // Delete by value
    static void delete(int value) {
        int i;
        for (i = 0; i < n; i++) {
            if (arr[i] == value) break;
        }
        if (i == n) {
            System.out.println("Value not found!");
            return;
        }
        for (int j = i; j < n - 1; j++) {
            arr[j] = arr[j + 1];
        }
        n--;
        System.out.println("Deleted: " + value);
    }

    // Display list
    static void display() {
        if (n == 0) {
            System.out.println("List is empty!");
            return;
        }
        System.out.print("List: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " -> ");
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        insertAtBeginning(10);
        insertAtBeginning(5);
        insertAtEnd(20);
        insertAtPosition(15, 2);

        display(); // 5 -> 10 -> 15 -> 20 -> null

        delete(10);
        display(); // 5 -> 15 -> 20 -> null

        delete(100); // Value not found

        sc.close();
    }
}