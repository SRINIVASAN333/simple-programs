
import java.util.Scanner;

public class smallest_greatest {
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
        int s=c[0][0],l=c[0][0];
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                if(c[i][j]<s){
                    s=c[i][j];
                }
            }
            for(int j=0;j<b;j++){
                if(c[i][j]>l){
                    l=c[i][j];
                }
            }
        }
        System.out.println("Smallest: "+s);
        System.out.println("Largest: "+l);
    }
}
