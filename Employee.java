import java.util.Scanner;
class Employee
{
    int enumber;
    String ename;
        double esalary;
        int eage;
        String edate;
        void accept()
        {
            Scanner sc=new Scanner(System.in); //system.in-keyboard(values given by the keyboard)
            System.out.println("enter the employee number");
            enumber=sc.nextInt();
            System.out.println("enter the employee name");
            ename=sc.next();

            System.out.println("enter the employee salary"); esalary=sc.nextDouble();
            System.out.println("enter the employee age");
            eage=sc.nextInt();
            System.out.println("enter the employee date");
            edate=sc.next();
            


        }
        void display()
        {
            System.out.println("employee number is "+ enumber);
            System.out.println("employee salary is "+esalary);
            System.out.println("employee name"+ename);
            System.out.println(" employee age is "+eage);
            System.out.println(" employee satrted date"+edate);
        }
    public static void main(String args[])
{
Employee e1=new Employee();
Employee e2=new Employee();
e1.accept();
e2.accept();
e1.display();
e2.display();
}
        

    
}

