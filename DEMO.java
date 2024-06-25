package TELUSKO;
// in this it is learned that the in the static method , non-static variables cannot be used , instead we can use the 
// object reference to do so and it will work through processing the obj to the method and getting the obj from it .
class Mobile{
    String brand;
    int price;
     static String name;
     static {
        name="phone";
        System.out.println("static");
     }
     public Mobile(){
        brand = " suzuki";
        price = 200;
        System.out.println("constructor");
     }
    public static void show(Mobile obj){
        System.out.println("The Mobile " + obj.brand + " with price of "+ obj.price+ " and name is " + obj.name);
    }
}

public class DEMO{
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "apple";
        obj1.price = 100000;
        Mobile.name = "smartphone";
        Mobile obj2 = new Mobile();
         obj2.show(obj1);
        
      
    }
}
