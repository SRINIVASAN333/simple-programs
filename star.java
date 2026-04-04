import java.util.Scanner;

class star {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the num : ");
        int n = in.nextInt();

        // 🔺 Upper pyramid
        for(int i = 1; i <= n; i++){
            for(int j = i; j < n; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= (2 * i) - 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        // 🔻 Lower pyramid
        for(int i = n - 1; i >= 1; i--){
            for(int j = n; j > i; j--){
                System.out.print(" ");
            }
            for(int k = 1; k <= (2 * i) - 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
