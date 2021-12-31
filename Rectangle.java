import java.util.Scanner;
class Rectangle
{
    double l;
    double b;
    double area;
    double perimeter;
    // this methos is used to taking the inputs
    void takeInput()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the lenght");
        l=sc.nextDouble();
        System.out.println("enter the breadth");
        b=sc.nextDouble();


    }
    //this method is used to calculate the area
    void area()
    {
        area=l*b;
        System.out.println(area);
    }
    void perimeter()
    {
        perimeter= 2*(l+b);
        System.out.println(perimeter);
    }
    public static void main(String args[])
    {
        Rectangle r1=new Rectangle();
        r1.takeInput();
        r1.area();
        r1.perimeter();
    }

}
