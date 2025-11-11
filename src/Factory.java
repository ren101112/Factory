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
        FactoryInfo();
        Products="houses, cars cows, and meat";
        System.out.println(Products);
        System.out.println(yearFounded);
        System.out.println(isOpen);
        System.out.println(earnings);






    }
    public void FactoryInfo(){
        System.out.println("The factory info");


    }
}
