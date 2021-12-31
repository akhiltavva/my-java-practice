import java.util.Scanner;
class Movie
{
    String moviename;

    Scanner sc=new Scanner(System.in);

    void input()
    {
        System.out.println("enter the movie name");
        moviename=sc.next();
    }

    void output()
    {
        switch(moviename)
        {
            case "Akhanda":
            System.out.println("Balakrishna");
            break;
            case "RRR":
            System.out.println("NTR");
            break;
            case "Patas":
            System.out.println("Kalyanram");
            break;
            case "Seetaya":
            System.out.println("Harikrishna");
            break;
            case "DanaVeeraSuraKarna":
            System.out.println("Sr.NTR");
            break;

            default:
            System.out.println("not in the database");
            break;
            

        }
    }

    public static void main(String args[])
    {
        Movie m1=new Movie();
        m1.input();
        m1.output();
    }
}