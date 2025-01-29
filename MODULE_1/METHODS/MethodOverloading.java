public class MethodOverloading {
    public static void main(String[] args) {
        m1(130, (byte)130); // [int,int]
        m1(130,130); //[int,int]
        // m1('A','B'); CTE (reference to m1 is ambiguous)
        m1(5.3,3.5); //[double,double]
        m1('a',3.5); //[int,double]
        m1('a',127); //[char,int]
    }

    public static void m1(int a, int b){
        System.out.println("[int,int]");
    }

    public static void m1(byte a,byte b){
        System.out.println("[byte,byte]");
    }

    public static void m1(int a,char b){
        System.out.println("[int,char]");
    }

    public static void m1(char a,int b){
        System.out.println("[char,int]");
    }

    public static void m1(int a,double b){
        System.out.println("[int,double]");
    }

    public static void m1(double a,double b){
        System.out.println("[double,double]");
    }
}