public class Shipping {

    public static void main(String[] args) {
        System.out.println("Total shipping cost : " + Math.round(scmt(5, 'B')));
    }

    public static double scmt(int weight , char zone){
        char z = zone;
        int w = weight;
        double Price = 0;
        switch (z) {
            case 'A':
                Price = cost(5.00, w);
                break;
            case 'B':
                Price = cost(7.00, w);
                break;
            case 'C':
                Price = cost(10.00, w);
                break;
            default:
                System.out.println("Invalid zone");
                break;
        }
        return Price;
    }

    public static double cost(double price , int weight){
        double result = 0;
        double p = price;
        int w = weight;
        if(w < 10){
            result = w * p * 0.90;
        } else if ( w > 11 && w < 20){
            result = w * p * 0.85;
        } else if ( w > 20){
            result = w * p * 0.80;
        }
        return result;
    }
}