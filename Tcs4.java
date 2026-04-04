import java.util.Scanner;
class Tcs4{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        int E[]=new int[t];
        int L[]=new int[t];
        for(int i=0;i<t;i++){
            E[i]=in.nextInt();
        }
        for(int i=0;i<t;i++){
            L[i]=in.nextInt();
        }
        int current=0;
        int max=0;
        for(int i=0;i<t;i++){
            current=current+E[i]-L[i];
            if(current>max){
                max=current;
            }
        }
        System.out.println(max);
    }
}