import java.util.Scanner;

public class interchange_rows {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter rows and columns:");
        int a = in.nextInt();
        int b = in.nextInt();
        
        int[][] c = new int[a][b];
        System.out.println("Enter elements");
        for(int i = 0; i < a; i++){
            for(int j = 0; j < b; j++){
                c[i][j] = in.nextInt();
            }
        }

        for(int k=0;k<a;k++) {
            int temp = c[k][0];
            c[k][0] = c[k][a-1];
            c[k][a-1] = temp;
        }

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}