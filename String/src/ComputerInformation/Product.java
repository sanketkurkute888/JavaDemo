package ComputerInformation;

public class Product {

     protected int product_id;

     protected String ProductName;

     protected int price;

     protected  double weight;


     protected String type;



//     constructor


    public Product() {
        this(0,null,0,0,null);
    }

    public Product(int product_id, String productName, int price, double weight, String type) {
        this.product_id = product_id;
        ProductName = productName;
        this.price = price;
        this.weight = weight;
        this.type = type;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Product{" +
                "product_id=" + product_id +
                ", ProductName='" + ProductName + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", type='" + type + '\'' +
                '}';
    }
}
