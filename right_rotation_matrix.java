import java.util.Scanner;

public class right_rotation_matrix {
    public static void left_rotation(int[] row,int k){
            int n=row.length;
            
            int[] temp=new int[k];
            for(int i=0;i<k;i++){
                temp[i]=row[n-k+i];
            }
            for(int i=n-1;i>=k;i--){
                row[i]=row[i-k];
            }
            for(int i=0;i<k;i++){
                row[i]=temp[i];
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
