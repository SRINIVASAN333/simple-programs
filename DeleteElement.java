import java.util.Scanner;

class DeleteElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = {10, 20, 30, 40, 50};
        int n = a.length;

        System.out.print("Enter position to delete (0-based): ");
        int pos = sc.nextInt();

        // shifting
        for (int i = pos; i < n - 1; i++) {
            a[i] = a[i + 1];
        }

        // print new array
        System.out.println("Array after deletion:");
        for (int i = 0; i < n - 1; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
