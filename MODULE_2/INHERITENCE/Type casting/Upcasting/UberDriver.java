
import java.util.Scanner;

public class UberDriver {
    
    public static void main(String[] args) {

        try (Scanner s = new Scanner(System.in)) {
            System.out.println("\t============ Wellcome to Uber ============");
            System.out.println("\tEnter 1 for Mini");
            System.out.println("\tEnter 2 for Sedan");
            System.out.println("\tEnter 3 for Cab");

            int choice = s.nextInt();

            switch (choice) {
                case 1 -> {
                    Cab c1 = new Mini(20);
                    Uber u = new Uber(c1);
                    u.tripDetails();
                }
                case 2 -> {
                    Cab c2 = new Sedan(20);
                    Uber u = new Uber(c2);
                    u.tripDetails();
                }
                case 3 -> {
                    Cab c3 = new SUV(20);
                    Uber u = new Uber(c3);
                    u.tripDetails();
                }
                default -> {
                    System.out.println("Enter valid details");
                }
            }
        }
    }
}
