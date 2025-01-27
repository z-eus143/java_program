public class Currency{
    public static void main(String[] args) {
        inrToEu(100000);
    }

    public static void inrToEu(double inr){
        double Eu = inr / 106.49;
        System.out.println((int)Eu + " Pound(Eu)");
    }
}