import java.util.Scanner;

class hash {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n value: ");
        n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        in.close();
    }
}
