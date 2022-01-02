import java.util.Scanner;
class Even
{
    int n;
    int i;

    Scanner sc=new Scanner(System.in);

    void input()
    {
        System.out.println("enter the number");
        n=sc.nextInt();
    }
    void output()
    {
        for(i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }
    }

    public static void main(String args[])
    {
        Even e1=new Even();
        e1.input();
        e1.output();
    }
}