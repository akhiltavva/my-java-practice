import java.util.Scanner;
class Big
{
    int a;
    int b;

    Scanner sc=new Scanner(System.in);

    void input()
    {
        System.out.println("enter the value of a");
        a=sc.nextInt();
        System.out.println("enter the value of b");
        b=sc.nextInt();
    }
    void output()
    {
        if(a>b)
        {
            System.out.println(a);
        }
        else{
            System.out.println(b);
        }
    }

    public static void main(String args[])
    {
        Big b1=new Big();
        b1.input();
        b1.output();
    }
}