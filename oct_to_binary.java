import java.util.Scanner;

public class oct_to_binary {
    public static void main(String[] args) {
        String oct="7";
        
        Scanner in=new Scanner(System.in);
        
        char value;
        
        String bin="";
        int num=0;
        for(int i=0;i<oct.length();i=i+1){
            value=oct.charAt(i);
            if(value>='0' && value<='7') num=value;
            
            while(num>0){
            int rem=num%2;
            bin=rem+bin;
            num=num/2;
        }
    }
        System.out.print(bin);
        }
}
