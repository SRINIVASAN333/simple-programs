
import java.util.Scanner;

public class diagnol_0 {
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
            for (int j = 0; j < c1; j++) {
                if(i==j){
                    break;
                }else{
                    a[i][j]=0;
                }
            }
        }
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }


    }
}
