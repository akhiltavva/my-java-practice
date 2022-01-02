import java.util.Scanner;
class Sarray3
{
    int n;
    int x[];
    int i;
    int sum=0;

    Scanner sc=new Scanner(System.in);
    void input()
    {
        System.out.println("enter the number of valuees to be entered");
        n=sc.nextInt();

         
        System.out.println("enter the elements in the array");
        x=new int[n];

        for(i=0;i<x.length;i++)
        {
            x[i]=sc.nextInt();
        }
    }

    void output()
    {
        for(i=0;i<x.length;i++)
        {
            sum=sum+x[i];

            
        }
        System.out.println(sum);

    }

    public static void main(String args[])
    {
        Sarray3 s1=new Sarray3();
        s1.input();
        s1.output();
    }
}