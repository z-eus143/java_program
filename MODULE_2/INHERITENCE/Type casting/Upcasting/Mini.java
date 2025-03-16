public class Mini extends Cab {

    public Mini (int price,int distance) {
        super(price);
        super.distance = distance;
    }

    @Override
    public int fare(){
        return distance * price;
    } 

}
