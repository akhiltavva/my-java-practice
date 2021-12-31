
class Book
{   
public static void main(String args[])
    {
       
    

        Book b1=new Book();

        

      b1.getdata(); //instance method
        
        b1.putdata();

    
    }
    String bookname;
    int booknumber;
    double cost;
    String author;

    
    
    //methods
    void getdata()
    {
        bookname="lkalakalaka";
        booknumber=21;
        cost=34.99;
        author="robert";
    }

    

    void putdata()
    {
        System.out.println("The name is "+bookname);
        System.out.println("The booknumber is "+booknumber);
        System.out.println("the cost is "+cost);
        System.out.println("the author is "+author);


    }

    

}