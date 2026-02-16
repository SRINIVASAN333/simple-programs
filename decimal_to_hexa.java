
import java.util.Scanner;

public class decimal_to_hexa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the decimal value: ");
        int dec,rem=0;
        dec=in.nextInt();
        String hex="";
        while (dec>0) { 
            rem=dec%16;
            if(rem<10){
                hex=rem+hex;
            }else{
                rem=(rem-10)+'A';
                hex=(char)rem+hex;
            }
            dec=dec/10;
        }
        System.out.println(hex);

    }
}
