import java.util.Scanner;
class PalindromArrayWithoutLib{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your string:");
        String str=in.nextLine();
        char[] original=str.toCharArray();
        char[] reversed=new char[original.length];
        for(int i=0;i<original.length;i++){
        reversed[i]=original[original.length-1-i];
    }
        boolean isPalindrome=true;
        for(int i=0;i<original.length;i++){
        if(original[i]!=reversed[i]){
        isPalindrome=false;
        break;
    }
}
        if(isPalindrome){
        System.out.println("Palindrome");
    }
        else{
            System.out.print("NOt a palindrome");
}
            in.close();
    }
}    