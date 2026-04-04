import java.util.Scanner;
class Tcs5{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        char b[]=new char[n];
        for(int i=0;i<n;i++){
            b[i]=in.next().charAt(0);
        }
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(b[i]==b[j]){
                    count++;
                }
            }
            if(count%2!=0){
                System.out.print(b[i]);
                return;
            }
        }
        System.out.print("All are even");
    }
}