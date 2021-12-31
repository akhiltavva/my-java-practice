import java.util.Scanner;
class Range
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
        if(1<=n<=10)
        {
            System.out.println("it is in the range of 1-10");
        }
        else if(11<=n<=20)
        {
            System.out.println("it is in the range of 11-20");

        }
        else if(21<=n<=30)
        {
            System.out.println("it is in the range of 21-30");
        }
        else if(31<=n<=40)
        {
            System.out.println("it is in the range of 31-40");
        }
        else 
        {
            System.out.println("it is in the range more than 40");
        }
    }
    public static void main (String args[])
    {
        Range r1=new Range();
        r1.input();
        r1.output();
    }

}