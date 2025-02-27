public class Screen {
    private int screenNumber;
    private String screenType; // e.g., IMAX, 3D, Standard
    private String resolution; // e.g., 4K, 8K
    private String soundSystem; // e.g., Dolby Atmos, DTS
    private boolean isAvailable; // Availability status

    // Constructor
    public Screen(int screenNumber, String screenType, String resolution, String soundSystem, boolean isAvailable) {
        this.screenNumber = screenNumber;
        this.screenType = screenType;
        this.resolution = resolution;
        this.soundSystem = soundSystem;
        this.isAvailable = isAvailable;
    }

    // Method to toggle screen availability
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
