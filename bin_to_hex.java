import java.util.Scanner;

public class bin_to_hex {
    public static void main(String[] args) {
        String bin="101010";
        
        Scanner in=new Scanner(System.in);
        
        int value;
        String hex="";
        while(bin.length()%4!=0){
            bin="0"+bin;
        }
        for(int i=0;i<bin.length();i=i+4){
            value=0;
            value+=(bin.charAt(i)-'0')*8;
            value+=(bin.charAt(i+1)-'0')*4;
            value+=(bin.charAt(i+2)-'0')*2;
            value+=(bin.charAt(i+3)-'0')*1;
            
            if(value<10){
                hex=hex+value;
            }else{
                value=(value-10)+'A';
                hex=hex+(char)value;
            }
            
        }
        System.out.print(hex);
    }
}
