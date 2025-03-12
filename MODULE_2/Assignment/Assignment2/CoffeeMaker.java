// CoffeeMaker.java
public class CoffeeMaker {

    private String brand;
    private String model;
    private int waterCapacity;
    private BrewBasket brewBasket;
    
    // Constructor 
    public CoffeeMaker(String brand, String model, int waterCapacity) {
        this.brand = brand;
        this.model = model;
        this.waterCapacity = waterCapacity;
    }
    
    public void createBrewBasket(int capacity, String material, int brewTime) {
            brewBasket = new BrewBasket(capacity, material, brewTime);
    }

    public void makeCoffee() {
        System.out.println("Starting coffee maker (" + brand + " " + model + ")...");
        brewBasket.brew();
    }

    public void displayCoffeeMaker() {
        System.out.println("Coffee Maker Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Water Capacity: " + waterCapacity + " liters");
        if (brewBasket != null) {
            brewBasket.displayBrewBasket();
        } else {
            System.out.println("No brew basket created.");
        }
    }
    
    public static void main(String[] args) {
        CoffeeMaker myCoffeeMaker = new CoffeeMaker("JavaBrew", "JB-2000", 2);
        myCoffeeMaker.createBrewBasket(4, "stainless steel", 30);
        myCoffeeMaker.displayCoffeeMaker();
        myCoffeeMaker.makeCoffee();
    }
}
