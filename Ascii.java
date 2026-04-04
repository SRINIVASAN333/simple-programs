import java.util.Scanner;
class Ascii {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Ascii value: ");
        for(int i=0; i<4; i++) {
            int num = in.nextInt();
        if(num >= 0 && num<=127){
            char ch = (char) num;
            System.out.print(ch);
        }
        else {
            System.out.print("Invalid input");
        }
    }
}
}