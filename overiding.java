
// THIS IS THE CODE FOR THE OVERIDING , WHICH CREATES NEW MEMORY EVERY TIME WE DECLARE THE NEW OBJ. AND ALSO IT IS TEH RUNTIME POLYMORPHISM.
class A {
    public void show(){
        System.out.println("show in A.");
    }
}
class B extends A {
    public void show(){
        System.out.println("show in B.");
    }
}
class C extends B {
    public void show(){
        System.out.println("show in C.");
    }
}
public class overiding {
public static void main(String[] args) {
    A obj = new A();
    obj.show();
    obj =new B();
    obj.show();
    obj=new C();
    obj.show();
}
    
} 