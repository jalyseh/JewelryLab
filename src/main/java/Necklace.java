public class Necklace {

    double price;
    String name;
    int itemId;
    String date_created;

    public Necklace(){

    }

    public Necklace(double price, String name, int itemId, String date_created) {
        this.price = price;
        this.name = name;
        this.itemId = itemId;
        this.date_created = date_created;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getDate_created() {
        return date_created;
    }

    public void setDate_created(String date_created) {
        this.date_created = date_created;
    }

    @Override
    public String toString() {
        return "Necklace{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", itemId=" + itemId +
                ", date_created='" + date_created + '\'' +
                '}';
    }
}


