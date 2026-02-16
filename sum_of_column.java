
import java.util.Scanner;

public class sum_of_column {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int r1 = in.nextInt();
        int c1 = in.nextInt();
        int[][] a = new int[r1][c1];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = in.nextInt();
            }
        }
        
        for (int i = 0; i < r1; i++) {
            int sum=0;
            for(int j=0;j<c1;j++){
            sum+=a[j][i];
            }
        System.out.print(sum+ " ");
        }
        System.out.println();
    }
}
