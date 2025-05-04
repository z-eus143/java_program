
import java.util.Scanner;

public class DiscountCalculator {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the day of week between 1 - 7");
        int day = s.nextInt();
        System.out.println("Enter the amount of purchase");
        float amount = s.nextFloat();

        if(day <= 5){
            System.out.println("Day Of Week " + day);
            System.out.println("Amount " + amount);
            System.out.println("Discount " + (amount < 100 ? (amount*0.05) : (amount*0.1) ));
        } else {
            System.out.println("Day Of Week " + day);
            System.out.println("Amount " + amount);
            System.out.println("Discount " + amount * 0.15);
        }
    }
}
