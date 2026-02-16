import java.util.Scanner;

public class reverse_arr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int[] a = new int[n]; 

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        for (int i = 0; i < n / 2; i++) {
            int temp = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = temp;
        }

        System.out.println("\nArray elements\n");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
        
       
    }
}