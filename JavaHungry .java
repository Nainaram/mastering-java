import java.util.Date; 
 
public class JavaHungry {
    public static void main(String args[]) {
      try
      {
        System.out.println("Start of delay: "+ new Date());
        // Delay for 7 seonds
        Thread.sleep(7000);   
        System.out.println("End of delay: "+ new Date());
      }
      catch(InterruptedException ex)
      {
          ex.printStackTrace();
      }
    }
}