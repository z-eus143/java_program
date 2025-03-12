public class Child extends Parent {
    int b;
    static {
        System.out.println("Static initializer from child class");
    }

    public Child(){}
    public Child(int b,int a){
        super(a);
        this.b = b;
    }

    @Override
    public void captancy(){
        System.out.println("KHOLI");
    }
}
