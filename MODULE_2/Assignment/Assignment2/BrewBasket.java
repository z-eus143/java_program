public class BrewBasket {
    private int capacity;      
    private String material;    
    private int brewTime;       

    // Constructor
    public BrewBasket(int capacity, String material, int brewTime) {
        this.capacity = capacity;
        this.material = material;
        this.brewTime = brewTime;
    }
    
    public void brew() {
        System.out.println("Brewing coffee using a " + material + " basket with capacity of " 
                           + capacity + " cups for " + brewTime + " seconds...");
    }
    
    public void displayBrewBasket() {
        System.out.println("BrewBasket Details:");
        System.out.println("Capacity: " + capacity + " cups");
        System.out.println("Material: " + material);
        System.out.println("Brew Time: " + brewTime + " seconds");
    }
}
