import java.util.ArrayList;

public class Arraylist{
    public static void main(String[] args) {
        
            ArrayList<String> cars = new ArrayList<String>();
            cars.add("Volvo");
            cars.add("BMW");
            cars.add("Ford");
            cars.add("Mazda");
            System.out.println(cars);
            System.out.println(cars.get(0));
            cars.set(0, "Opel");
            System.out.println(cars);
            cars.remove(0);
            System.out.println(cars);
            for(String i : cars){
                System.out.println(i);
            }
    }
}