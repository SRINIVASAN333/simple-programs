class Sum{
    private int a,b,c;
    public void setter(int a,int b){
        this.a=a;
        this.b=b;
    }
    public int get_a(){
        return a;
    }
    public int get_b(){
        return b;
    }
    public void disp(){
        c=a+b;
        System.out.print(c);
    }
}
class SetterEx{
    public static void main(String s[]){
        Sum obj=new Sum();
        obj.setter(5,10);
        System.out.println("a = "+obj.get_a());
        System.out.println("b = "+obj.get_b());
        obj.disp();
    }
}