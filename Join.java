class Demo1  extends Thread{
    @Override
    public void run(){
        for(int i =1;i<=5;i++){
            try {
                System.out.println("JAVA");
                Thread.sleep(2000);
            } catch (Exception e) {
               e.printStackTrace();
            }
        }
    }
}
public class Join {
    public static void main(String[] args)  throws InterruptedException{
        System.out.println("Main tread started");
        Demo1 d = new Demo1();
        d.start();
        d.join();
        System.out.println("main THread ended");
    }
}
