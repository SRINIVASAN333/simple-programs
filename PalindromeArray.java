import java.util.Arrays;
import java.util.Scanner;
class PalindromeArray{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=in.nextLine();
        char[] original=str.toCharArray();
        char[] reversed=Arrays.copyOf(original,original.length);
        for(int i=0;i<reversed.length-1;i++){
            char temp=reversed[i];
            reversed[i]=reversed[reversed.length-1-i];
            reversed[reversed.length-1-i]=temp;
        }
        if(Arrays.equals(original,reversed)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
        in.close();
    }
}