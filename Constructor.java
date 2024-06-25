// this is the  code to explain the how the constructor working  and also what is the 'this' keyword uses

 class Human{
    int age;
    String name;
    public Human(){
        age = 23;
        name = "pyscho";
    }
}
public class Constructor {
    public static void main(String[] args) {
        Human  obj = new Human();
        System.out.println(obj);
    }
}
