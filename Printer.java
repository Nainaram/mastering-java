class PrintAnybody implements Runnable{
    @Override
    synchronized public void run(){
        String name = Thread.currentThread().getName();
                System.out.println(name+" is started printing.");
                for(int i=1;i<=3;i++){
                    System.out.println(name + "is printing.");
                    try{
                            Thread.sleep(4000);
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                }
                System.out.println(name+ " Completed Printing");
            
     }
}
public class Printer {
    public static void main(String[] args) {
            PrintAnybody p = new PrintAnybody();
            Thread t1 = new Thread(p);
            Thread t2 = new Thread(p);
            Thread t3 = new Thread(p);
            t1.setName("Men");
            t2.setName("Women");
            t3.setName("child");
            t1.start();

            t2.start();
            t3.start();

    }
}
