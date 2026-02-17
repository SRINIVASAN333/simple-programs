
import java.util.Scanner;

public class array_2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr= new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0 ;j < 2; j++){
                int a=in.nextInt();
                arr[i][j]=a;
            }
        }
        int[][] arr2= new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0 ;j < 2; j++){
                int a=in.nextInt();
                arr2[i][j]=a;
            }
        }
        for (int i = 0; i < 2; i++) {
            for(int j=0;j<2;j++)
            System.out.print(arr[i][j]+arr2[i][j]+" ");
        }

    }
}
