class Em
{
    int emno;
    String name;
    Em(int no,String n)
    {
        emno=no;
        name=n;
    }
    void display()
    {
        System.out.println("Employee Details");
        System.out.println("---------------------");
        System.out.println("name:"+name);
        System.out.println("emno:"+emno);
    }
}
public class ConstructorDemo2{
    public static void main(String[]args)
    {
        Em ob=new Em(14,"Anu");
        ob.display();
    }
}
