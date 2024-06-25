package TELUSKO;
class Calc{
    public int add(int a,int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }
    public void show(){
        System.out.println("this is the CALC");
    }
}
class AdvCalc extends Calc{
    public int mul(int a,int b){
        return a*b;
    }
    public int div(int a,int b){
        return a/b;
    }
    public void show()
{
    System.out.println("this is the ADVCALC");
}    
}
public class Inheritance {
    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();
       System.out.println( obj.add(4, 5));
       System.out.println(obj.sub(40, 5));
       System.out.println( obj.mul(4, 5));
      System.out.println(obj.div(40, 5));
       

        
    }
    
}
