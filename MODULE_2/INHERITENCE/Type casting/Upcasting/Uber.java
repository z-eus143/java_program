public class Uber {
    Cab cab;

    public Uber(){}

    public Uber(Cab cab){
        this.cab = cab;
    }

    public void tripDetails(){
        cab.booking();
        cab.display(cab);
    }
}
