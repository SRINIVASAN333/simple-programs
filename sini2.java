import java.util.Scanner;
class sini {
    public static void main(String[] args) {
        double a,b;
        double c,d,e,f;
        Scanner in=new Scanner (System.in);
        System.out.println("Enter fuel capcity: ");
        a=in.nextInt();
        System.out.println("Enter distance covered: ");
        b=in.nextInt();
        if(a<0 || b<0) System.out.println("Invalid input");
        else{
        c=a/b*100;
        System.out.println("(Litres/100KM)\n"+c);
        d=a*0.2642;
        e=b*0.6214;
        f=e/d;
        System.out.println("(Miles/Gallon)\n"+f);
}    }
}