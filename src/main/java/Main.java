import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Necklace> products = new ArrayList<Necklace>();
        Necklace exclusiveNecklace = new Necklace(1500.0, "Biggest Bling", 1234, "09/09/2020");
        Store jBandzStore = new Store("Jbandz Store","Jbandz",products);

        //adding specific necklace to sell to test sell method
        products.add(exclusiveNecklace);
        //checking to see if specific necklace is in array list
        System.out.println(products);


        //selling specific necklace
        jBandzStore.sell(1234);
        //restocking so that there is 20 necklaces in array list(store)
        jBandzStore.restock();
        //printing out array list to check if previous item has been sold and store has been restocked
        System.out.println(products);

    }

}
