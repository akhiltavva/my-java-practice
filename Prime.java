import java.util.Scanner;
class Prime 
{
    int n;
    int i;
    int j;


    Scanner sc=new Scanner(System.in);

    void input()
    {
        System.out.println("enter the value of n");
        n=sc.nextInt();

    }
    void output()
    {
        int count=0;
        for(i=2;i<=n/2;i++)
    
        {
            if(n%i==0 )
            {
            count++;
            }
        }
    
        if(count==0)
        {
            System.out.println("it is a prime number");
        }
        else
        {
            System.out.println("it is not a prime number");
        }
    }

    public static void main(String args[])
    {
        Prime p1=new Prime();
        p1.input();
        p1.output();
    }
}