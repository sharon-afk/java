import java.util.Scanner;
public class Faculty
{
    int age;
    String fname;
    void getdata()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("\n\nEnter Faculty Name:");
        fname=scan.nextLine();
        System.out.println("\n\nEnter Faculty age");
        age=scan.nextInt();

    }
    void display()
    {
        System.out.println("Faculty Name:"+fname);
        System.out.println("Faculty age:"+age);

    }
    public static void main(String args[])
    {
        Faculty f= new Faculty();
        f.getdata();
        System.out.println("\n\nFaculty Details\n");
        System.out.println("\n\n===========================\n");
        f.display();
    }
}
