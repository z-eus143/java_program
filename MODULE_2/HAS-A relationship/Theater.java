public class Theater {
    private String name;
    private String location;
    private int capacity;
    private double rating;
    Screen screen;

    // Constructor
    public Theater(String name, String location, int capacity, double rating,int screenNumber, String screenType, String resolution, String soundSystem, boolean isAvailable) {
        this.name = name;
        this.location = location;
        this.capacity = capacity;
        this.rating = rating;
        this.screen = new Screen(screenNumber,screenType,resolution,soundSystem,isAvailable);
    }

    // Method to check theater availability
    public void checkAvailability() {
        if (screen.isAvailable()) {
            System.out.println("Theater is available for booking.");
        } else {
            System.out.println("No available screens at the moment.");
        }
    }

    // Method to display theater details
    public void showInfo() {
        System.out.println("Theater: " + name);
        System.out.println("Location: " + location);
        System.out.println("Capacity: " + capacity + " seats");
        System.out.println("Rating: " + rating + " stars");
        screen.showScreenDetails();
    }
}
