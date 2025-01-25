public class fibonacci {
    public static void main(String[] args) {
        int first =0;
        int second = 1;
        int next =0;
        int n = 10;
        System.out.print(first +" ");
        System.out.print(second+" ");
        for(int  i =3;i<=n;i++){
                next = first+second;
                first = second;
                second = next;
                System.out.print(next+" ");

        }
    }
}
