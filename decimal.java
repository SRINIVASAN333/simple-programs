import java.util.Scanner;
class dectohex {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter decimal : ");
        int dec = in.nextInt();
        String hex = "";
        while(dec > 0){
            int rem = dec % 16;
            if (rem < 10)
                hex = rem + hex;
            else if (rem >= 10) {
                hex = (char)((rem - 10) + 'A') + hex;
            }
            dec = dec / 16;

        }
        System.out.println("Hexadecimal : " + hex);
    }
} 