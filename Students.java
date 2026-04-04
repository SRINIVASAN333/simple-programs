
import java.util.Scanner;

class Students {
    public static void main(String[] args) {
        float n, a;
            Scanner in = new Scanner(System.in);
            System.out.println("Enter student performance : ");
             n = in.nextFloat();
            System.out.print("Enter the attendance : ");
            a = in.nextFloat();
            if(n>=85 && a>=90)
                System.out.print("Distiction");
            else if(n>=70 && a>=80)
                System.out.print("First class");
            else if(n>=60 && a>=75)
                System.out.print("Second class");
            else if(n>=50 && a>=75)
                System.out.print("Pass");
            else
                System.out.print("Fail");
        }
    }

