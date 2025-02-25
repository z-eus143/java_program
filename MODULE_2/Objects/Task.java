public class Task 
{
    static int i = 10; 
    int j = 20; 
    {
        System.out.println("Start of non-static initializer 1");
        System.out.println("i : " + i);
        System.out.println("j : " + j);
        System.out.println("End of non-static initializer 1");
    }
    static{
        System.out.println("Start of static initializer 1");
        System.out.println("i : " + i);
        Task t = new Task(10);
        System.out.println("End of static initializer 1");
    }

    public static int test(int i)
    {
        System.out.println("Start of test(int)");
        System.out.println("End of test(int)");
        return Task.i;
    }
    public static int demo(int j)
    {
        System.out.println("Start of demo(int)");
        System.out.println("End of demo(int)");
        return test(j);
    }

    public Task()
    {
        System.out.println("Start of <init>()");
        this.j = demo(0);
        System.out.println("End of <init>()");
    }

    public static void main(String[] args) 
    {
        System.out.println("Start of main method");
        Task t1 = new Task();
        t1.j = 20000;

        System.out.println("i : " + i);
        System.out.println("j : " + t1.j);
        main1(args);
        // System.out.println(args[2]);
        // System.out.println(args[3]);
        System.out.println("End of main method");

    }

    public static void main1(String[] args)
    {
        System.out.println("Start of main1 method");
        System.out.println("i : " + i);
        System.out.println("End of mani1 method");
    }
    public Task(int j)
    {
        System.out.println("Start of <init>(int)");
        this.j = j;
        System.out.println("End of <init>(int)");
    }

    {
        System.out.println("Start of non-static initializer 2");
        int i = 3000, j = 40;
        System.out.println("i : " + this.i);
        System.out.println("j : " + j);
        System.out.println("End of non-static initializer 2");
    }
    static{
        System.out.println("Start of static initializer 2");
        int j = 2000;
        i = demo(j);
        System.out.println("i : " + i);
        System.out.println("End of static initializer 2");
    }


} 