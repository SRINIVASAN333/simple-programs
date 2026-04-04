import java.util.Scanner;
class Vowels {
    public static void main(String[] args) {
        char n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter letter : ");
        n = in.next().charAt(0);
        if(n == 'a'||n =='e'||n == 'i'||n =='o'||n =='u') {
            System.out.println("Vowel");
        }
    }
}