import java.util.Scanner;
class Sarray1
{
    int x[]={11,06,20,25,03};

 
    void output()
    {
        for(int i=0; i<x.length;i++)

        {
            System.out.println(x[i]);
        }
    } 
    public static void main(String args[])
    {
        Sarray1 s1=new Sarray1();
        s1.output();
    }
}