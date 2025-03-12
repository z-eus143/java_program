public class GrandChild extends Child{
    int c;

    public GrandChild(){}

    public GrandChild(int b,int a,int c){
        super(b, a);
        this.c = c;
    }

    @Override
    public void captancy(){
        System.out.println("Rohit");
    }
}
