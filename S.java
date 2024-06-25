package TELUSKO;
class A{
    public A(){
        super();
        System.out.println("IN A");
    }
    public A(int n){
        super();
        System.out.println("IN A with int n");
    }
}
class B extends A{
    public B(){
        super();
        System.out.println("IN B");
    }
    public B(int n){
        this();
        System.out.println("IN B with int n");
    }
}
public class S {
    public static void main(String[] args) {
        B obj = new B(5);
    }
    
}
