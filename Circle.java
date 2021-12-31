import java.util.Scanner;
class Circle
{
    int r;
    double pi;
    double area;
    double perimeter;

    Scanner sc= new Scanner(System.in);

    void input()
    {
        System.out.println("enter the value of radius");
        r=sc.nextInt();
    }
    void area()
    {
        pi=3.14;
        area=pi*r*r;
        System.out.println(area);

    }
    void perimeter()
    {
        pi=3.14;
        perimeter=2*pi*r;
        System.out.println(perimeter);
    }
    public static void main(String args [])
    {
        Circle c1=new Circle();
        c1.input();
        c1.area();
        c1.perimeter();
    }


}