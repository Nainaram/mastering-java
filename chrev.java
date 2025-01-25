public class chrev{
    public static void main(String[] args) {
        char ch = 'A';
        int n =5;
        for(int i=1;i<=n;i++)
        {
            if(i%2==0){
                char chrev = (char)(ch+i-1);
                for(int j = 1;j<=i;j++){
                    System.out.print(chrev--);
                    ch++;
    
                }
            }
            else{
            for(int j = 1;j<=i;j++){
                System.out.print(ch++);

            }}
            System.out.println();
        }

    }
}