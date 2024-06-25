
abstract class Car{
    public abstract void drive();
    public  void playmusic(){
        System.out.println("Playing music!!!");
    }
    public abstract void fly();
}
abstract class WygonR extends Car{
    @Override
    public void drive() {
        System.out.println("WygonR drives at high speed!!");
    }
    public void fly(){
        System.out.println(" car is flying over apartments.");
    }
}
class UpdatedWygnoR extends WygonR{ 

}


public class Abstracts {
    public static void main(String[] args) {
        UpdatedWygnoR cr = new  UpdatedWygnoR();
        cr.drive();
        cr.playmusic();
        cr.fly();
    }
    
}
