public class StaticInitializers 
{
    static int i;
    static int j = 20;  //0x1

    static {    //0x2
        System.out.println(StaticInitializers.i);
        System.out.println("static initializer - 1");
        i = 10;
    }

    public static void main(String[] args) //0x3
    {
        System.out.println("start of main");

        System.out.println("i : " + StaticInitializers.i);
        System.out.println("j : " + j );

        System.out.println("end of main");
        
    }

    static {    //0x4
        System.out.println(StaticInitializers.j);
        System.out.println("static initializer - 2");
        j = 200;
    }

    static {    //0x5
        i = 10000;
        j = 20000;
        System.out.println("static initializer - 3");
    }
    
}