import java.util.Scanner;
class Odd
{
    int n;
    int i;

    Scanner sc=new Scanner(System.in);

    void input()
    {
        System.out.println("enter the value of n");
        n=sc.nextInt();
    }

    void output()
    {
        for(i=1;i<=n;i++)
        {
            if(i%2!=0)
            System.out.println(i);
            
        }
    }
    public static void main(String args[])
    {
        Odd o1=new Odd();
        o1.input();
        o1.output();
    }
}