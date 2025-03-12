public class Computer {
    // Attributes
    private int id;
    private String processor;
    private int ram; 
    private int storage; 
    private boolean available;

    // constructor
    public Computer(){
        
    }
    
    public Computer(int id, String processor, int ram, int storage, boolean available) {
        this.id = id;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.available = available;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public boolean getAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    // Display method
    public void displayComputer() {
        System.out.println("Computer ID: " + getId());
        System.out.println("Processor: " + getProcessor());
        System.out.println("RAM: " + getRam() + " GB");
        System.out.println("Storage: " + getStorage() + " GB");
        System.out.println("Is Available: " + (getAvailable() ? "Yes" : "No"));
    }
    
    public boolean toggleAvailable(){
        return !available;
    }
}
