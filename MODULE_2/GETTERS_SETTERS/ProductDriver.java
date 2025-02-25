public class ProductDriver {
    public static void main(String[] args) {
        Product p = new Product(1, "mouse", 650);
        Product.brand = "Razer";
        Product.displayProduct(p);
        Product p2 = new Product(2, "airbuds", 2000);
        Product.brand = "Boat";
        Product.displayProduct(p2);
    }
}
