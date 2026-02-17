import java.util.Scanner;
class pyramid{
    public static void main(String[] args){
        int n;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter n value: ");
        n=in.nextInt();
        
        for(int i=1;i<=n;i++){
            int num=0;
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i)-1;k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        
    }
}