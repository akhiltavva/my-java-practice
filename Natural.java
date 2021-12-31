import java.util.Scanner;
class Natural
{
    void printNatural(int n)
    {
        int i=1;
        while(i<=n)
        {
            System.out.print(i+" ");
            i++;
        }
    }
    public static void main(String args[])
    {
Scanner sc=new Scanner(System.in);
System.out.println("enter any number");
int x=sc.nextInt();

Natural n1=new Natural();
n1.printNatural(x);
    }
}