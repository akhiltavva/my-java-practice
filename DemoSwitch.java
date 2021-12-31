import java.util.Scanner;
class DemoSwitch
{
    int ch;

    Scanner sc=new Scanner(System.in);

    void input()
    {
        System.out.println("enter your choice from 1-5");
        ch=sc.nextInt();
    }

    void output()
    {
        switch(ch)
        {
            case 1:
            System.out.println("one");
            break;
            case 2:
            System.out.println("two");
            break;
            case 3:
            System.out.println("three");
            break;
            case 4:
            System.out.println("four");
            break;
            case 5:
            System.out.println("five");
            break;

            default:
            System.out.println("not in the list");
            break;

        }
    }

    public static void main(String args[])
    {

    
    DemoSwitch d1=new DemoSwitch();
    d1.input();
    d1.output();
    } 


}
