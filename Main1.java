class Animal{
  public void makeSound(){
    System.out.println(" Animal makes sound");
  
  }
}
 class Cat extends Animal{
  public void makeSound(){
    System.out.println(" the cat meow meow");
    
  }
}
public  class Main1{
  public static void main (String[] args ){
  Animal a1= new Animal();
  Cat c2 = new Cat();
  a1.makeSound();
  c2.makeSound();
  }
}