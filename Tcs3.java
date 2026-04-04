import java.util.Scanner;
public class Tcs3{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int R=in.nextInt();
        int C=in.nextInt();
        int arr[][]=new int[R][C];
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                arr[i][j]=in.nextInt();
            }
        }
        int maxcount=0;
        int rowindex=0;
        for(int i=0;i<R;i++){
            int count=0;
            for(int j=0;j<C;j++){
                if(arr[i][j]==1){
                count++;
            }
        }
        if(count>maxcount){
            maxcount=count;
            rowindex=i+1;
        }
        }
        System.out.println(rowindex);
    }
}