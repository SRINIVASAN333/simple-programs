import java.util.Scanner;

public class interchange_rows_v1 {
    public static void main(String[] args) {
        int a,b;
        Scanner in=new Scanner (System.in);
        System.out.println("Enter rows and columns:");
        a=in.nextInt();
        b=in.nextInt();
        int [][]c=new int[a][b];
        System.out.println("Enter elements");
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                c[i][j]=in.nextInt();
            }
        }
        int [][]d=new int[a][b];
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                if(i==0){
                    d[i][j]=c[a-1][j];
                }else if(i==a-1){
                    d[i][j]=c[0][j];
                }else{
                    d[i][j]=c[i][j];
                }
            }
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(d[i][j] + " ");
            }
            System.out.println();
        }

    }
}