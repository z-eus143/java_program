public class Cab {
    
    int price;
    int distance;

    public Cab(){}

    public Cab(int price){
        this.price = price;
    }

    public int fare(){
        return 0;
    }

    public void booking(){
        System.out.println("Cab booked successfully.");
    }

    public void display(Cab cab){
        System.out.println("Fare: " + cab.fare() + " for "+ distance +" km");
    }
}
