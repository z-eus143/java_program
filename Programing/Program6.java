public class  Program6 {

        // Recursive method to calculate factorial
        public static int factorial(int n) {
            // Base case: factorial of 0 or 1 is 1
            if (n <= 1) {
                return 1;
            } else {
                // Recursive call: multiply n by the factorial of (n - 1)
                return n * factorial(n - 1);
            }
        }
    
        public static void main(String[] args) {
            int number = 5;
            int result = factorial(number);
            System.out.println("Factorial of " + number + " is " + result);
        }
}    
