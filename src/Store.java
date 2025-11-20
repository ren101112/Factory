public class Store {

    public int stock;
    public boolean registerOpen;
    public String cashier;


    public Store(){
        stock=1392;
        registerOpen=true;
        cashier="Niam";

    }
    public Store(int pstock,boolean pregisterOpen,String pcashier){
        stock=pstock;
        registerOpen=pregisterOpen;
        cashier=pcashier;



    }

    public void printInfo(){
        System.out.println("# items in stock: "+stock);
        System.out.println("is register open? "+registerOpen);
        System.out.println("cashier: "+cashier);


    }




}
