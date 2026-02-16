
import java.util.Scanner;

public class bin_to_octal {
    public static void main(String[] args) {
        String bin="1010111";
        
        Scanner in=new Scanner(System.in);
        
        int value;
        String oct="";
        while(bin.length()%3!=0){
            bin="0"+bin;
        }
        for(int i=0;i<bin.length();i=i+3){
            value=0;
            value+=(bin.charAt(i)-'0')*4;
            value+=(bin.charAt(i+1)-'0')*2;
            value+=(bin.charAt(i+2)-'0')*1;
            oct=oct+value;
        }
        System.out.print(oct);
    }
   
}
