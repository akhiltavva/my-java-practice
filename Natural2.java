import java.util.Scanner;
class Natural2
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
        do
        {
            System.out.println(n);
            n--;
        }
        while(n>0);

    }

    public static void main(String args[])
    {
        Natural2 n1=new Natural2();
        n1.input();
        n1.output();
    }
}