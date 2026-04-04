import java.util.Scanner;
class dectobin {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter decimal : ");
        int dec = in.nextInt();
        String bin = "";
        while(dec > 0){
            int rem = dec % 2;
                bin = rem + bin;
            dec = dec / 2;

        }
        System.out.println("Binary : " + bin);
    }
}