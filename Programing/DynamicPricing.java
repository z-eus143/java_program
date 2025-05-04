import java.util.Scanner;

public class DynamicPricing {
    public static void main(String[] args) {
        final double BASE_PRICE = 5500.0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the current occupancy percentage of the flight: ");
        double occupancyPercentage = scanner.nextDouble();
        double finalPrice = BASE_PRICE;

        if (occupancyPercentage >= 50 && occupancyPercentage < 75) {
            finalPrice += BASE_PRICE * 0.10;
        } else if (occupancyPercentage >= 75 && occupancyPercentage < 90) {
            finalPrice += BASE_PRICE * 0.20;
        } else if (occupancyPercentage >= 90 && occupancyPercentage < 100) {
            finalPrice += BASE_PRICE * 0.30;
        }
        
        System.out.printf("The final ticket price is: $%.2f%n", finalPrice);
        scanner.close();
    }
}
