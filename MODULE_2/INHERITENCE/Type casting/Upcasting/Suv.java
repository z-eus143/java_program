public class SUV extends Cab{

    int distance;

    {
        price = 100;
    }

    public SUV()
    {   }

    public SUV(int distance)
    {
        this.distance = distance;
    }

    public int fair()
    {
        return distance*price;
    }
}
