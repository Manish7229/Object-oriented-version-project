import java.util.Scanner;

abstract class Shape {
    float area;

    abstract public void acceptInput();
    abstract public void compute();

    public void disp()
    {
        System.out.println("The area is : " + area);

    }

}

class Square extends Shape
{
    private float length;
    
    public void acceptInput()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of square : ");
        length = scan.nextFloat();
    }

    public void compute()
    {
        area = length * length;
    }
}

class Rectangle extends Shape
{
    float length;
    float breadth;

    public void acceptInput()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of rectangle : ");
        length = scan.nextFloat();
        System.out.println("Enter the breadth of rectangle : ");
        breadth = scan.nextFloat();
    }

    public void compute()
    {
        area = length * breadth;
    }
}

class Circle extends Shape
{
    float radius;

    public void acceptInput()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius of circle : ");
        radius = scan.nextFloat();
    }

    public void compute()
    {
        area = (float) (3.14*radius*radius);
    }
}

class Geometry 
{
    public void permit(Shape ref)
    {
        ref.acceptInput();
        ref.compute();
        ref.disp();
    }
}

class Project2 {
    public static void main(String[] args)
    {
        Square s = new Square();
        Rectangle r = new Rectangle();
        Circle c = new Circle();

        Geometry g = new Geometry();
        
        g.permit(s);
        g.permit(r);
        g.permit(c);
    }

}
