public class House {
    public int walls;
    public double size;
    public String owner;
    public String address;
    public boolean isOccupied;



    public House(){//this is the default constructor that java creates when you call a method in the FACOTRY code
        walls=4;
        size=3200.7;
        owner="bobby";
        address="362 centre st";
        isOccupied=true;//todo make a printinfo method that prints all the house instance variables



    }
    public House(double psize, int pwalls, String powner){//your parameter can not have the same name of your parameter and your variabale
        size=psize;//this is the order that it needs to be put in CANNOT BE DIFFERENT
        walls=pwalls;
        owner=powner;


    }
    public void printInfo(){
        System.out.println("there are"+walls+"walls");
        System.out.println("the size is"+size+"square feet");
        System.out.println("the owner of the house is"+owner);
        System.out.println("the adress is"+address);
        System.out.println("is the house occupied?"+isOccupied);



    }





}


