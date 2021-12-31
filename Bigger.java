import java.util.Scanner;
class Bigger
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
        System.out.println("enter the value of c");
        c=sc.nextInt();
    }

    void output()
    {
        if(a>b)
        {
           if(a>c)
        
            System.out.println(a);
        
        else
        
            System.out.println(c);
        }
        else
        {
            if(b>c)
            
                System.out.println(b);

            
            else
                System.out.println(c);
            
        }
        
        
    }
   public static void main(String args [])
    {
        Bigger b1=new Bigger();
        b1.input();
        b1.output();
    }
}