import java.util.ArrayDeque;
import java.util.Queue;

public class qq {
    public static void main(String[] args) {
            Queue<Integer> q = new ArrayDeque<Integer>(); 
                    q.add(34);
                    q.add(33);
                    q.add(36);
                    q.add(38);
                    q.add(399);
                    q.add(30);
                    System.out.println(q);
                    q.remove();
                    
                    System.out.println(q);
                    System.out.println(q.offer(88));
                    System.out.println(q);
                    System.out.println(q.offer(88));
                    System.out.println(q.element());
                    q.poll();
                    System.out.println(q);
            
    }
}
