import java.util.Scanner;
class Absolute
{
    int n;
    void getn()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        n=sc.nextInt();
    }
    void absn()
    {
        if(n<0)
        {
            n=-n;
        }
    }
    void displayn()
    {
        System.out.println(n);
    }
    public static void main(String args[])
    {
        Absolute a1=new Absolute();
        a1.getn();
        a1.absn();
        a1.displayn();


    }
    
    
}