import java.util.Scanner;

public class dec_to_hex {
    public static void main(String[] args) {
        int n,r=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number: ");
        n=in.nextInt();
        
        String hex="";
        for(int i=0;n>0;i++){
             r=n%16;
            if(r<10){
                hex=r+hex;
            }else {
                r=(r-10)+'A';
                hex=(char)r+hex;
            }
            n=n/16;
                    
        }
        
        System.out.println(hex);


    }
}
                                    