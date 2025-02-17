public class RectArea
{
    double l,b;
    void getdata(double length,double breadth)
    {
        l=length;
        b=breadth;
    }
    double CalArea()
    {
        return l*b;
    }
    public static void main(String args[])
    {
        RectArea r=new RectArea();
        r.getdata(12,38);
        System.out.println("Area of rectangle="+r.CalArea());
    }
}
