import java.util.Scanner;
public class Tcs6{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int N=10;
        int K=5;
        int jar=N;
        int order=in.nextInt();
        if(order>jar){
            System.out.print("Invalid input");
        }
        else{
            jar=jar-order;
            System.out.print("No of candies sold: "+order);
            System.out.print("No of candies left: "+jar);
        }
    }
}