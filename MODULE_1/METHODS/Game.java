import java.util.Random;

public class Game {
    public static void main(String[] args) {
        Random random = new Random();
        int step = random.nextInt(6) + 1;
        // int step = 9;
        int price = stapAndDice(step);
        if (price == -1){
            System.out.println("Invalid Value");
        } else {
            System.out.println("Step : " + step +" Cash Price Won : " + price);
        }
    }
    public static int stapAndDice(int n) {
        int number = n;
        int sum = 0;
        switch (number) {
            case 6:
                int s6 = 1000;
                sum = sum + s6;
            case 5:
                int s5 = 900;
                sum = sum + s5; 
            case 4:
                int s4 = 800;
                sum = sum + s4;
            case 3:
                int s3 = 700;
                sum = sum + s3;
            case 2:
                int s2 = 600;
                sum = sum + s2;
            case 1:
                int s1 = 500;
                sum = sum + s1;
                break;
            default:
                sum = -1;
        }
        return sum;
    }
}