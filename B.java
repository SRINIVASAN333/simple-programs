import java.util.Scanner;
class A{
    int a;
    A(){
        a=0;
    }
    public void get(){
        Scanner in=new Scanner(System.in);
        a=in.nextInt();
    }
}
class B extends A{
    int b;
    B(){
        super();
        b=0;
    }
    public void get(){
        super.get();
        Scanner in=new Scanner(System.in);
        b=in.nextInt();
    }
    public static void main(String[] args){
        B obj=new B();
        obj.get();
    }
}