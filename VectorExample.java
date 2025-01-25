import java.util.Vector;
// we are gonna save the vector in the key value pair we can access any element in the vector using the either key or value of the key  
public class VectorExample {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");
        
        System.out.println("Vector: " + vector);
        
        // Adding an element at a specific position
        vector.add(1, "Blueberry");
        System.out.println("After adding element: " + vector);
        
        // Removing an element
        vector.remove(1);
        System.out.println("After removal: " + vector);
    }
}
