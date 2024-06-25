package TELUSKO;
// this is code for the hashcode and equals method .

class Laptop{
    String model;
    int price;
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }
    
    public void show(){
        System.out.println("in laptop");
    }
}
public class OBJHASH {
    public static void main(String[] args) {
        Laptop obj1 = new Laptop();
        Laptop obj2= new Laptop();
        obj1.model = "asus";
        obj1.price = 255555;
        obj2.model = "asusa";
        obj2.price = 255555;
        boolean result = obj1.equals(obj2);
        System.out.println(result);
    }

    
}
