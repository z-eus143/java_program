public class Program7 {
    static int closestNumber(int n, int m) {
        int quotient = n / m;
        int n1 = m * quotient;
        int n2 = (n * m > 0) ? (m * (quotient + 1)) : (m * (quotient - 1));
        
        if (Math.abs(n - n1) < Math.abs(n - n2)) {
            return n1;
        } else {
            return n2;
        }
    }

    public static void main(String[] args) {
        int i = closestNumber(-6, 39);
        System.out.println(i);
    }
}