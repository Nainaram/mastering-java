public class sumarr {
    public static void main(String[] args) {
        int arrays[] = { 3,4,5,6,4,56,34,34,23,23,34,34,23};
        int sum = 0;
        for(int i : arrays){
            sum+=i;
            System.out.println(sum);
        }
    }
}
