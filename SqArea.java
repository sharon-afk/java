public class SqArea
{
    int s;
    void getoutput(int side)
    {
       s=side;
    }
    int CalArea()
    {
        return s*s;
    }
    public static void main(String args[])
    {
        SqArea ob=new SqArea();
        ob.getoutput(12);
        System.out.println("Area of Square="+ob.CalArea());
    }
}
