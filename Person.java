
class Person
{
    // proprties or variables or data members or instance variables
public static void main(String args[])
    {
        // creating an object to the class

        Person p1=new Person();
        Person p2=new Person();

        p1.getdata();
        p2.getdata();
        p1.putdata();

        p2.putdata();

    }

    String name;
    int age;

// memberfunction behaviour or method user defined 
    void getdata()
    {
        name="akhil";
        age=21;
    }

    // display data

    void putdata()
    {
        System.out.println("The name is "+name);
        System.out.println("The age is "+age);
    }

    

}