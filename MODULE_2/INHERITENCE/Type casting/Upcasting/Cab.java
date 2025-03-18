public class Cab {

    int price;

    public Cab()
    {   }

    public Cab(int price)
    {
        this.price = price;
    }

    public void booking(){
        System.out.println("\t============ Booking Details ============");
    }

    public void dispalyCab(Cab cab)
    {
        if (cab instanceof Mini) {
            Mini m = (Mini) cab;
            System.out.println("\tFare for Mini: " + m.fair() + " for distance " + m.distance);
        } else if (cab instanceof Sedan) {
            Sedan s = (Sedan) cab;
            System.out.println("\tFare for Sedan: " + s.fair() + " for distance " + s.distance);
        } else if (cab instanceof SUV) {
            SUV suv = (SUV) cab;
            System.out.println("\tFare for SUV: " + suv.fair() + " for distance " + suv.distance);
        }
    }
}
