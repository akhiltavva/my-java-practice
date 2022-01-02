import java.util.Scanner;
class Prime2 
{
    int n;
    int i;
    int j;


    Scanner sc=new Scanner(System.in);

    void input()
    {
        System.out.println("enter the value of n");
        n=sc.nextInt();

    }
    void output()
    {
      
        for(i=2;i<=n;i++)
    
        {
            int count=0;
            for(j=1;j<=i;j++)
            {
                if(i%j==0)
                count++;
            }
            if(count==2 )
            {
            System.out.println(i);
            }
        }
    }
    

    public static void main(String args[])
    {
        Prime2 p1=new Prime2();
        p1.input();
        p1.output();
    }
}