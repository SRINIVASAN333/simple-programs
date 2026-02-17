import java.util.Scanner;

public class border_elements {
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
        int add=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<row;j++){
            if(i==0 || i==row -1||j==0||j==column-1){
                {
                    add+=arr[i][j];
                } 
            }
        }
    }
    System.out.println(add);
}
}
