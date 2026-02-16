
import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Rows: ");
        int r1 = in.nextInt();
        System.out.println("Enter Columns: ");
        int c1 = in.nextInt();
        int[][] a = new int[r1][c1];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = in.nextInt();
            }
        }
        int[][] c=new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                c[i][j] = a[j][i];
            }
        }
        System.out.println("The resultant Matrix is : ");
         for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

    }
}
