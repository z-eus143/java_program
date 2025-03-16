public class Suv extends Cab {
    
    public Suv (int price,int distance) {
        super(price);
        super.distance = distance;
    }

    @Override
    public int fare(){
        return distance * price;
    } 

}
