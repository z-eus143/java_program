public class Mini extends Cab{

    int distance;

    {
        price = 10;
    }

    public Mini()
    {   }

    public Mini(int distance)
    {
        this.distance = distance;
    }

    public int fair()
    {
        return distance*price;
    }

}
