public class Operators1 
{
    public static void main(String[] args) 
    {
        int a = 'z';
        char b = 'A';
        double c = 10.5;

        calculateResult1(a, b, c);
        
    }
    
    public static void calculateResult1(int a, char b, double c)
    {
        double result = ++a + ++b + b++ + c++ + a/b++ + --a + ++c + (int)a/b + (int)c;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(result);
    }

    public static void calculateResult2(int a, char b, double c)
    {
        double result = ++a + --c + --a/--b + ++c + --c + (int)(++c/b++) + (int)c/a - --a*2 ;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(result);
    }
}