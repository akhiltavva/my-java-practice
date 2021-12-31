import java.util.Scanner;
class Age
{
    int date;
    int month;
    int year;
    int bd;
    int bm;
    int by;
    int cd;
    int cm;
    int cy;

    Scanner sc=new Scanner(System.in);

    void input()
    {
        System.out.println("enter the birth date");
        bd=sc.nextInt();
        System.out.println("enter the birth month");
        bm=sc.nextInt();
        System.out.println("enter the birth year");
        by=sc.nextInt();
        System.out.println("enter the cd");
        cd=sc.nextInt();
        System.out.println("enter the cm");
        cm=sc.nextInt();
        System.out.println("enter the today cy");
       cy=sc.nextInt();
        
    }

    void calculateAge()
    {
        year=cy-by;
        month=cm-bm;
        date=cd-bd;
        if(date<0)
        {
            date=date+30;
            month=month-1;

        }
        if(month<0)
        {
            month=month+12;
            year=year-1;
        }

    }
    void display()
    {
        System.out.println(year+"years"+month+"months"+date+"days");
    }
    public static void main(String args[])
    {
        Age a1=new Age();

        a1.input();
        a1.calculateAge();
        a1.display();
    }
}