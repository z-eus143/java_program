public class Screen {
    private int screenNumber;
    private String screenType; 
    private String resolution;
    private String soundSystem; 
    private boolean isAvailable;

    // Constructor
    public Screen(int screenNumber, String screenType, String resolution, String soundSystem, boolean isAvailable) {
        this.screenNumber = screenNumber;
        this.screenType = screenType;
        this.resolution = resolution;
        this.soundSystem = soundSystem;
        this.isAvailable = isAvailable;
    }

    // Method to check screen availability
    public void toggleAvailability() {
        System.out.println("Screen " + screenNumber + " is now " + (isAvailable ? "Available" : "Not Available"));
    }

    // Method to display screen details
    public void showScreenDetails() {
        System.out.println("Screen " + screenNumber + " Details:");
        System.out.println("Type: " + screenType + ", Resolution: " + resolution + ", Sound System: " + soundSystem);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}
