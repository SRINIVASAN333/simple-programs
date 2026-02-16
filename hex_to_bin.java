import java.util.Scanner;

public class hex_to_bin {
 public static void main(String[] args) {
        String hex="0A";
        
        Scanner in=new Scanner(System.in);
        
        char value;
        String oct="";
        String bin="";
        int num=0;
        for(int i=0;i<hex.length();i=i+1){
            value=hex.charAt(i);
            if(value>='0' && value<='9') num=value;
            else num=(value-'A')+10;
            while(num>0){
            int rem=num%2;
            bin=rem+bin;
            num=num/2;
        }
    }
        System.out.print(bin);
        }
          
}
