import java.util.Scanner;
class Debit {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        if (n > 1000)
            System.out.print("Debit 500");
        else
            System.out.print("Debit 50");
    }
}