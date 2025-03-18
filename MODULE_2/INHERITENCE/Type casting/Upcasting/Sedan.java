public class Sedan extends Cab{

    int distance;

    {
        price = 50;
    }

    public Sedan()
    {   }

    public Sedan(int distance)
    {
        this.distance = distance;
    }

    public int fair()
    {
        return distance*price;
    }
}
