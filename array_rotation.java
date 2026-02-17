import java.util.Scanner;

public class array_rotation {
    public static void left_rotation(int[] row,int k){
            int n=row.length;
            int[] temp=new int[k];
            for(int i=0;i<k;i++){
                temp[i]=row[i];
            }
            for(int i=k;i<n;i++){
                row[i-k]=row[i];
            }
            for(int i=0;i<k;i++){
                row[n-k+i]=temp[i];
            }
        }
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
        for (int i = 0; i < row; i++) {
            
                
                left_rotation(arr[i],i);
            
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0 ;j < column; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
