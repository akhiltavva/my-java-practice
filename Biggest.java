import java.util.Scanner;
class Biggest
{
    int a;
    int b;
    int c;
    

    Scanner sc=new Scanner(System.in);

    void input()
    {
        System.out.println("enter the value of a");
        a=sc.nextInt();
        System.out.println("enter the value of b");
        b=sc.nextInt();
        c=a;
    }

    void output()
    {
        if(c<b)
        {
            c=b;
           
            
        }
         System.out.println(c);

    }
    public static void main(String args[])
    {
        Biggest b1=new Biggest();
        b1.input();
        b1.output();
    }



}