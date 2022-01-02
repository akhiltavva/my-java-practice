import java.util.Scanner;
class Sarray2
{
    int x[];
    int n;

    Scanner sc =new Scanner(System.in);

    void input()
    {
        System.out.println("enter the number");
        n=sc.nextInt();

        x=new int[n];
        System.out.println("enter the elements in the array");

        for(int i=0; i<x.length;i++)
        {
            x[i]=sc.nextInt();
        }
    }

    void output()
    {
        for(int i=0;i<x.length;i++)
        {
        System.out.println(x[i]);
    }
    }

    public static void main(String args[])
    {
        Sarray2 s1=new Sarray2();
        s1.input();
        s1.output();
    }
    
}