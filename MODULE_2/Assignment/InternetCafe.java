
public final class InternetCafe {

    // Attributes
    private String name;
    private String location;
    private int totalComputers;
    private boolean gamingAvailable;
    private boolean printingAvailable;
    private boolean refreshmentsAvailable;
    private double hourlyRate;
    private Computer[] computers; 


    // constructor

    public InternetCafe(){}

    public InternetCafe(String name, String location, int totalComputers, boolean gamingAvailable,
            boolean printingAvailable, boolean refreshmentsAvailable, double hourlyRate) {
        setName(name);
        setLocation(location);
        setTotalComputers(totalComputers);
        setGamingAvailable(gamingAvailable);
        setPrintingAvailable(printingAvailable);
        setRefreshmentsAvailable(refreshmentsAvailable);
        setHourlyRate(hourlyRate);
        computers = new Computer[totalComputers];
        for (int i = 0; i < computers.length; i++) {
            computers[i] = new Computer(i, "i7", 16, 512, true);
        }
    }

    // getters

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getTotalComputers() {
        return totalComputers;
    }

    public boolean getGamingAvailable() {
        return gamingAvailable;
    }

    public boolean getPrintingAvailable() {
        return printingAvailable;
    }

    public boolean getRefreshmentsAvailable() {
        return refreshmentsAvailable;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    // setters

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setTotalComputers(int totalComputers) {
        this.totalComputers = totalComputers;
    }

    public void setGamingAvailable(boolean gamingAvailable) {
        this.gamingAvailable = gamingAvailable;
    }

    public void setPrintingAvailable(boolean printingAvailable) {
        this.printingAvailable = printingAvailable;
    }

    public void setRefreshmentsAvailable(boolean refreshmentsAvailable) {
        this.refreshmentsAvailable = refreshmentsAvailable;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public void displayInternetCafe(){
        System.out.println("");
        System.out.println("--------Internet Cafe : Details -------");
        System.out.println("Name : " + getName());
        System.out.println("Location : " + getLocation());
        System.out.println("Total Computers : " + getTotalComputers());
        System.out.println("Gaming : " + (getGamingAvailable() ? "Available" : "Not Available"));
        System.out.println("Printing : " + (getPrintingAvailable() ? "Available" : "Not Available"));
        System.out.println("Refreshment : " + (getRefreshmentsAvailable() ? "Available" : "Not Available"));
        System.out.println("Hourly Rate : " + getHourlyRate());

        for (int i = 0;i<computers.length;i++){
            System.out.println("--------Computer : "+ (i+1) +" Details -------");
            computers[i].displayComputer();
            System.out.println("------------------------------------");
        }
    }
}