import java.util.Scanner;
class Student
{
    int m1;
    int m2;
    int m3;
Scanner sc=new Scanner(System.in);

void input()
{
    System.out.println("enter the marks of m1");
    m1=sc.nextInt();
    System.out.println("enter the marks of m2");
    m2=sc.nextInt();
    System.out.println("enter the marks of m3");
    m3=sc.nextInt();
}

String calculateScore()
{
    if(m1>=35 && m2>=35 &&m3>=35)
    {
        return("the student passed the exam");
    }
    else
    {
        return("the student failed the exam");
    }
}

void display()
{
    System.out.println(calculateScore());
}
public static void main(String args[])
{
Student s1=new Student();
s1.input();
s1.display();
}

}