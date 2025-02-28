class Stud {
    int rno;
    String name;

    Stud(int r, String n) {
        rno = r;
        name = n;
    }

    void display() {
        System.out.println("Student Details");
        System.out.println("----------------------");
        System.out.println("Name:" + name);
        System.out.println("Rollno:" + rno);
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        Stud ob = new Stud(12, "Sharon");
        ob.display();
    }
}
