class Family implements Runnable {
        String resource1 ="play Station";
        String resource2 = "Controller";
        @Override
        public void run(){
            String name = Thread.currentThread().getName();
            if(name.equals("Rohit")){
                rohitAccquiredResources();
            }
            else{
                vijayAccquiredResources();
            }

        }
        public void rohitAccquiredResources(){
            try{
                synchronized (resource2){
                    System.out.println("Rohit got the Controller");
                    Thread.sleep(1000);
                    synchronized (resource1){
                        System.out.println("Rohit got the PlayStation");
                        Thread.sleep(1000);
                    }
                }
            }catch(InterruptedException e){
                System.out.println("Rohit Failed!");
            }
        }
        public void vijayAccquiredResources(){
            try{
                synchronized (resource1){
                    System.out.println("vijay got the Playstation");
                    Thread.sleep(1000);
                    synchronized (resource2){
                        System.out.println("vijay got the Controller");
                        Thread.sleep(1000);
                    }
                }
            }catch(InterruptedException e){
                System.out.println("Vijay Failed!");
            }
        }

}
public class DeadLock  {
    public static void main(String[] args) throws InterruptedException{
        Family f = new Family();
        Thread t1 = new Thread(f);
        Thread t2 = new Thread(f);
            t1.setName("Rohit");
            t2.setName("Vijay");
            t1.start();
           t1.join();
            t2.start();

    }
}
