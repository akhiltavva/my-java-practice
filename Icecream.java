class Icecream
{
    public static void main(String args[])
    {
        Icecream i1=new Icecream();
        Icecream i2=new Icecream();
        i1.recdata1();
        i1.sendata1();
        i2.recdata2();
        i2.senddata2();
    }
    String name1,name2;
    String flavour1,flavour2;
    int cost1,cost2;
    String country1,country2;

    void recdata1()
    {
        name1="ibaco";
        flavour1="chocolate";
        cost1=30;
        country1="india";


    }
    void recdata2()
    {
        name2="kwality";
        flavour2="vanilla";
        cost2=25;
        country2="USA";


    }

    void sendata1()
    {
        System.out.println("the name of the icecream is "+name1);
        System.out.println("the flavour of the icecream is "+flavour1);
        System.out.println("the cost of the icecream is "+cost1);
        System.out.println("the country of the icecream is "+country1);
    }
    void senddata2()
    {
        System.out.println("the name of the icecream is "+name2);
        System.out.println("the flavour of the icecream is "+flavour2);
        System.out.println("the cost of the icecream is "+cost2);
        System.out.println("the country of the icecream is "+country2);
    }
}