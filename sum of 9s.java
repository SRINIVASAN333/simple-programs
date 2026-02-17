import java.util.Scanner;
class sumof9{
    public static void main(String[] args){
        int n;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter n value: ");
        n=in.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            int num=0;
            for(int j=1;j<=i;j++){
                num=num*10;
                num=num+9;
            }
            sum=sum+num;
        }
        System.out.println(sum);
    }
}