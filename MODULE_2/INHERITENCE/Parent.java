public class Parent {
    static int a;

    static {
        System.out.println("Static initializer from parent class");
    }

    public Parent(){}
    public Parent(int a){
        this.a = a;
    }

    public void captancy(){
        System.out.println("DHONI");
    }
}

