public class Currency{
    public static void main(String[] args) {
        inrToEu(106.49);
    }

    public static void inrToEu(double inr){
        double Eu = inr / 106.49;
        System.out.println(Eu + " Pound(Eu)");
    }
}