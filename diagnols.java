import java.util.Scanner;

public class diagnols {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Row: ");
        int row=in.nextInt();
        System.out.println("Enter Column: ");
        int column=in.nextInt();
        int[][] arr= new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0 ;j < column; j++){
                int a=in.nextInt();
                arr[i][j]=a;
            }
        }
        for(int d=0;d<=row+column-2;d++){
        for (int i = 0; i < row; i++) {
            for (int j = 0 ;j < column; j++){
                if(i+j==d){
                    System.out.print(arr[i][j]+" ");
                }
            }
            
        }
        System.out.println();
    }  
        
    }
}
