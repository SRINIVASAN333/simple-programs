import java.util.Scanner;
class Shape{
    Scanner in=new Scanner(System.in);
}
class Square extends Shape{
    int area, side;
    public int area(){
        System.out.println("Enter side: ");
        side=in.nextInt();
        area=side*side;
        System.out.println("Area of square: "+area);
    }
}
class Rectangle extends Shape{
    int breadth,length,area;
    public int area(){
        System.out.println("Enter breadth and length: ");
        breadth=in.nextInt();
        length=in.nextInt();
        area=length*breadth;
        System.out.println("Area of Rectangle: "+area);

    }
}
class Circle extends Shape{
    int r;
    double area;
    public void area(){
        System.out.println("Enter r: ");
        r=in.nextInt();
        area=3.14*r*r;
        System.out.println("Area of circle: "+area);
    }
}
class Main{
    public static void main(String[] args) {
        Square obj=new Square();
        obj.area();
        Rectangle obj=new Rectangle();
        obj.area();
        Circle obj=new Circle();
        obj.area(); 
    }
}