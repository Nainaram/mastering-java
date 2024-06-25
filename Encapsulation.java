package TELUSKO;
// you cannot the access the private variables from the outside the class or from the other class instead , you have to use the 
// setter and getter method to access and the private variables through its own method of the class  only and  also you can dynamically set the varibles using the setter method()
class Human{
    private int age;
    private String name;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Human  obj = new Human();
        obj.setAge(25);
        obj.setName("wildheart");
        System.out.println(obj.getName());
        System.out.println(obj.getAge());
    }
    
}
