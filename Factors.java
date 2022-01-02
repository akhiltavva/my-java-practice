import java.util.Scanner;
class Factors
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
        for(i=1;i<=n;i++)
    
        {
            if(n%i==0 )
            System.out.println(i);
        }
    }

    public static void main(String args[])
    {
        Factors p1=new Factors();
        p1.input();
        p1.output();
    }
}
