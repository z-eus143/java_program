public class Sedan extends Cab {

    public Sedan (int price,int distance) {
        super(price);
        super.distance = distance;
    }

    @Override
    public int fare(){
        return distance * price;
    } 

}
