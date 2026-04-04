import java.util.Scanner;
class SumElementsMatrix{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int[][] A=new int[3][3];
        System.out.println("Enter values of Matrix: ");
        int sum = 0;
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                A[i][j]=in.nextInt();
                sum = A[i][j] + sum;
            }
            
        }
        System.out.print("Sum: "+sum);
                
        }
    }
