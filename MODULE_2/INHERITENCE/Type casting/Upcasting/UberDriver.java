import java.util.Scanner;

public class UberDriver {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the type of cab (1 for Mini, 2 for Sedan, 3 for Suv): ");
            int choice = scanner.nextInt();
            System.out.println("Enter distance");
            int distance = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    Cab mini = new Mini(10,distance);
                    Uber uberMini = new Uber(mini);
                    uberMini.tripDetails();
                }
                case 2 -> {
                    Cab sedan = new Sedan(50,distance);
                    Uber uberSedan = new Uber(sedan);
                    uberSedan.tripDetails();
                }
                case 3 -> {
                    Cab suv = new Suv(100,distance);
                    Uber uberSuv = new Uber(suv);
                    uberSuv.tripDetails();
                }
                default -> System.out.println("Enter proper details");
            }
        }

    }
}