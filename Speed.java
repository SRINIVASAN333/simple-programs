import java.util.Scanner;

class Speed {
    public static void main(String[] args) {
        float speed;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter speed : ");
        speed = in.nextFloat();

        if (speed <= 60) {
            System.out.print("Fine : No");
        }
        else if (speed >= 61 && speed<=80) {
            System.out.print("Fine : 500");
        }
        else if (speed >= 81 && speed<=100) {
            System.out.print("Fine : 2000");
        }
        else if (speed >= 101 && speed<=120) {
            System.out.print("Fine : 5000");
        }
         else if (speed>=120) {
            System.out.print("Fine : License suspended");
        }
        }
    }
