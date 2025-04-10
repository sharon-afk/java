package pkg1;
public class College
{
    public void msg()
    {
        System.out.println("Welcome to College!!!");
    }
}
//main program file
import java.util.*;
import pkg1.College;
class PackageDemo
{
    public static void main(String args[])
    {
        College ob=new College();
        ob.msg();
    }
}
