//interface
package graphics;
public interface Area_cal
{
    void area();
}
//Circle pkg
package graphics;
import java.util.Scanner;
public class Circle implements Area_cal
{
    double radius;
    public void area()
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Input radius");
    radius=sc.nextDouble();
    System.out.println("Area of circle:"+(3.14*radius*radius));
}
}
//Rectangle pkg
package graphics;
import java.util.Scanner;
public class Rectangle implements Area_cal{
    int l,b;
    public void area()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input length:");
        l=sc.nextInt();
        System.out.println("Input breadth:");
        b=sc.nextInt();
        System.out.println("Area of rectangle:"+(l*b));
    }
}
//Square pkg
package graphics;
import java.util.Scanner;
public class Square implements Area_cal{
    int a;
    public void area()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input side length:");
        a=sc.nextInt();
        System.out.println("Area of square:"+(a*a));
    }
}
//Triangle pkg
package graphics;
import java.util.Scanner;
public class Triangle implements Area_cal{
    int b,h;
    public void area()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input breadth:");
        b=sc.nextInt();
        System.out.println("Input height:");
        h=sc.nextInt();
        System.out.println("Area of triangle:"+(0.5*b*h));
    }
}
//main program file
import graphics.Circle;
import graphics.Rectangle;
import graphics.Square;
import graphics.Triangle;
import java.util.Scanner;
public class GraphicsDemo
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int choice;
        Circle obj1=new Circle();
        Rectangle obj2=new Rectangle();
        Square obj3=new Square();
        Triangle obj4=new Triangle();
        while(true)
        {
            System.out.println("\n1)Circle\n2)Rectangle\n3)Square\n4)Triangle");
            System.out.println("Enter your choice(1-5):");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    obj1.area();
                    break;

                case 2:
                    obj2.area();
                    break;

                case 3:
                    obj3.area();
                    break;

                case 4:
                    obj4.area();
                    break;

                case 5:
                    System.out.println("Exiting!!");
                    System.exit(0);
                    default:
                        break;        

            }
        }

    }
}
