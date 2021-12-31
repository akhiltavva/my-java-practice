import java.util.Scanner;
class Triangle
{
    int b;
    int h;
    double area;
    double half;
Scanner sc= new Scanner(System.in);

    void input()
    {
        System.out.println("enter the value of height");
        h=sc.nextInt();
        System.out.println("enter the value of breadth");
        b=sc.nextInt();
    }
    void area()
    {
        half=0.5;
        area=half*h*b;
        System.out.println(area);
    }
    public static void main(String args[])
    {
        Triangle t1= new Triangle();
        t1.input();
        t1.area();
    }
}