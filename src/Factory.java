public class Factory {
    //these are called instance variables because they are made at the top of the class and they have the word publc in them
    //they can be used ANYWHERE IN the code except in the PSVM

    public int yearFounded;
    public boolean isOpen;
    //todo you cannot have a variable with the word public outside the top of the code
    public double earnings;//unit is in millions
    public String Products;


    public static void main(String[] args) {// in a PSVM you CANNOT HAVE A regular method in it other than a constructor method
        System.out.println("Welcome to Ren's Factory" );
        new Factory();






    }
    //this is a constructor, a special type of method THAT DOES NOT HAVE VOID. The name of the constructor matches the name of the class
    public Factory(){//what a constructor does is makes a factory
        System.out.println("we make houses in the factory");
        yearFounded=2025;
        isOpen=true;
        earnings=1.3412;

        Products="houses, cars cows, and meat";
        FactoryInfo();
        System.out.println("Products:"+Products);
        System.out.println("Year founded"+yearFounded);
        System.out.println("Open?"+isOpen);
        System.out.println("Yearly earnings(in millions)"+earnings);
        yearFounded=1999;
        FactoryInfo();
        System.out.println("year founded:"+yearFounded);
        House h1=new House();//this is a variable of type house-- it is MORE COMPLEX than any other variable, it is an OBJECT
        //it is of type house and A VARIABLE FROM THE CLASS WE MADE
        h1.owner="Mr.Kim";
        System.out.println(h1.owner);
        h1.address="12 main street";
        System.out.println(h1.address);
        h1.isOccupied=true;
        h1.walls=10;
        h1.size=200.13;
        System.out.println(h1.size);

    }
    public void FactoryInfo(){
        System.out.println("The factory info");




    }

    //type varName=Value

}
