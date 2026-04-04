import java.util.Scanner;
class SumRow{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter num of rows : ");
        int r=in.nextInt();
        int[][] A=new int[r][];
        
        for(int i=0;i<r;i++){
            System.out.println("Enter num of columns: ");
            int c=in.nextInt();
            A[i]=new int[c];
            int sum=0;
            System.out.println("Enter values: ");
            for(int j=0;j<c;j++){
                A[i][j]=in.nextInt();
                sum = sum + A[i][j];
            }
            System.out.println("Sum: "+ sum); 
        }
               
        }
    }
