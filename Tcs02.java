import java.util.Scanner;
class Tcs02{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
         int k=in.nextInt();
          int j=in.nextInt();
           int m=in.nextInt();
            int p=in.nextInt();
            int bananamonkeys=m/k;
            int peanutmonkeys=p/j;
            int total=bananamonkeys+peanutmonkeys;
            int left=n-total;
            if(left<0)
                left=0;
            System.out.print("No of monkeys left in tree = "+left);
    }
}