import java.util.PriorityQueue;

public  class Priority{
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
            pq.add(45);
            pq.add(12);
            pq.add(423);
            pq.add(4556);
            pq.add(45);
            pq.add(9);
            System.out.println(pq);
            pq.add(33);
            System.out.println(pq.remove());
            System.out.println(pq);
            System.out.println(pq.peek());
    }
}