public class Product {

    static  String brand;
    private int id;
    private String name;
    private double price;

    // Constructor
    public Product() {
    }

    public Product(int id, String name, double price) {
        setId(id);
        setName(name);
        setPrice(price);
    }

    // GETTER
    public int getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public double getPrice() {
        return this.price;
    }

    // SETTER
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPrice(double price){
        this.price = price;
    }

    // Display Method
    public static void displayProduct(Product product) {
        System.out.println("Brand : " + Product.brand);
        System.out.println("Product ID : " + product.getId());
        System.out.println("Product Name : " + product.getName());
        System.out.println("Product Price : " + product.getPrice());
    }
}