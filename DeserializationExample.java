import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;

 class Person implements Serializable {
    private static final long serialVersionUID = 1L; // To ensure version compatibility
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}
// public class SerializationExample {
//     public static void main(String[] args) {
//         Person person = new Person("Alice", 30);

//         try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser"))) {
//             oos.writeObject(person);
//             System.out.println("Object serialized successfully.");
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//     }
// }
public class DeserializationExample {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.ser"))) {
            Person person = (Person) ois.readObject();
            System.out.println("Object deserialized successfully: " + person);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
