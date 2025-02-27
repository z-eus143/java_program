// Main class
public class TheaterDriver {
    public static void main(String[] args) {
        Theater theater = new Theater("Grand Cinema", "Downtown, NY", 300, 4.8,1, "IMAX", "4K", "Dolby Atmos", true);
        theater.showInfo();
        theater.checkAvailability();
        theater.screen.toggleAvailability();

        Theater theater1 = new Theater("Ashok Anil", "Norway, NY", 300, 4.8,1, "IMAX", "4K", "Dolby Atmos", false);
        theater1.showInfo();
        theater1.checkAvailability();
        theater1.screen.toggleAvailability();
    }
}
