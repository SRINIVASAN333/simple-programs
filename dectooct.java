import java.util.Scanner;
class dectooct {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter decimal : ");
        int dec = in.nextInt();
        String oct = "";
        while(dec > 0){
            int rem = dec % 8;
                oct = rem + oct;
            dec = dec / 8;

        }
        System.out.println("Octal : " + oct);
    }
}