import java.util.Scanner;
class SpiralTraversal2DArray{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter num of rows: ");
        int n = in.nextInt();
        System.out.println("Enter num of columns: ");
        int m = in.nextInt();
        int[][] arr = new int[n][m];
        for(int i =0; i < n; i ++){
            for(int j = 0; j < m; j ++){
                arr[i][j] = in.nextInt();
            }
        }
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = m - 1;
        System.out.println("Spiral traversal: ");
        while(top <= bottom && left <= right){
            for(int i = left; i <= right; i ++){
                System.out.print(arr[top][i] + " ");
            }
            top ++;
            for(int i = top; i <= bottom; i++){
                System.out.print(arr[i][right] + " ");
            }
            right--;
            if(top <= bottom){
                for(int i = right; i >= left; i --){
                    System.out.print(arr[bottom][i] + " ");
                }bottom --;
            }
            if(left <= right){
                for(int i = bottom; i >= top; i --){
                    System.out.print(arr[i][left] + " ");
                }left ++;
            }
        }
    }
}