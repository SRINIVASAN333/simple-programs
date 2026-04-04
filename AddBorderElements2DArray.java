import java.util.Scanner;
class AddBorderElements2DArray{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of matrix: ");
        int n = in.nextInt();
         int [][] a = new int [n][n];
        System.out.println("Enter your matrix: ");
        for(int i = 0; i < n; i ++){
            for(int j = 0; j < n; j ++){
                a[i][j] = in.nextInt();
            }
        }
        int sum = 0;
        for(int i = 0; i < n; i ++){
            for(int j = 0; j < n; j ++){
                if(i == 0 || i == n - 1 || j == 0 || j == n - 1){
                    sum = sum + a[i][j];
                }
            }    
        }
        System.out.println("Sum: " + sum);
    }
}