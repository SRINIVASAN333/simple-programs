import java.util.Scanner;

public class dec_to_binary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the decimal value: ");
        int dec=in.nextInt();
        String bin="";
        while(dec>0){
            int rem=dec%2;
            bin=rem+bin;
            dec=dec/2;
        }
        System.out.print(bin);
    }
}