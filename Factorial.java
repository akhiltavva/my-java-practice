import java.util.Scanner;
class Factorial
{
    int n;
    


    Scanner sc=new Scanner(System.in);

    void input()
    {
        System.out.println("enter the number");
        n=sc.nextInt();

    }

    void output()
    {
        int i=1;
        long fact=1;
        while (i<=n)
        {
       
            fact=fact*i;
            i++;
            
        }
        System.out.println(fact);
    }
    public static void main(String args[])
    {
        Factorial f1=new Factorial();
        f1.input();
        f1.output();
    }
}