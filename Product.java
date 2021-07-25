public class Product {
    private  String name;
    private  String variant;
    private  float price;
    int quantity;

    public Product() {

    }

    public Product(String name, String variant, float price, int quantity) {
        this.name = name;
        this.variant = variant;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVariant() {
        return variant;
    }

    public void setVariant(String variant) {
        this.variant = variant;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return
                "Variant='" + variant + '\'' +
                ", price=" + price +
                ", quantity=" + quantity ;
    }


}
