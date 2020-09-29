
import java.util.ArrayList;
import java.util.Random;

public class Store {

    private String name;
    private String owner_name;
    private ArrayList<Necklace> products;

    public Store(String name, String owner_name, ArrayList<Necklace> products) {
        this.name = name;
        this.owner_name = owner_name;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public String getOwner_name() {
        return owner_name;
    }

    public ArrayList<Necklace> getProducts() {
        return products;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }

    public void setProducts(ArrayList<Necklace> products) {
        this.products = products;
    }

    public void sell(int itemId) {


       for(int item = 0; item < products.size(); item++) {
            if (products.get(item).getItemId() == itemId) {

                products.remove(item);


            }
        }
    }

    public void restock() {

        while (products.size() < 20) {

            Random rand = new Random();

            products.add(new Necklace(250.00, "Bling Bling", rand.nextInt(2000), "03/09/2020"));
        }

    }

}