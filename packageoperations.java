//interface
package pkgOperations;
public interface Calculate
{
    void cal(int x,int y);
}
//Add pkg
package pkgOperations;
public class Add implements Calculate{
    public void cal(int x,int y)
    {
        int sum=x+y;
        System.out.println("Sum of Numbers="+sum);
    }
}
//Subtract pkg
package pkgOperations;
public class Subtract implements Calculate{
    public void cal(int x,int y)
    {
        System.out.println("Difference of Numbers="+(x-y));
    }
}
//Multiplication pkg
package pkgOperations;
public class Multiply implements Calculate{
    public void cal(int x,int y)
    {
        System.out.println("Multiplication of Numbers="+(x*y));
    }
}
//divide.pkg
package pkgOperations;
public class Multiply implements Calculate{
    public void cal(int x,int y)
    {
        System.out.println("Multiplication of Numbers="+(x*y));
    }
}
//main program file
import java.util.Scanner;
import pkgOperations.Add;
import pkgOperations.Subtract;
import pkgOperations.Multiply;
import pkgOperations.Divide;
public class Arithematic
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a=sc.nextInt();
        System.out.println("Enter the second number:");
        int b=sc.nextInt();
        Add obj1=new Add();
        Subtract obj2=new Subtract();
        Multiply obj3=new Multiply();
        Divide obj4=new Divide();
        obj1.cal(a,b);
        obj2.cal(a,b);
        obj3.cal(a,b);
        obj4.cal(a,b);
    }
}
