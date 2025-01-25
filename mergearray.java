import java.util.*;
public class mergearray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        int ar1  [] = new int [n];
        int m = scanner.nextInt();
        int ar2  [] = new int [m];
        int k = scanner.nextInt();
        int ar3  [] = new int [k];
        int i=0;
        int j =0;
        int mergearr [] = new int [ar1.length+ar2.length+ar3.length];
        while(i<mergearr.length){
            if(j<ar1.length){
                mergearr[i++]=ar1[j];
                
            }
            if(j<ar2.length){
                mergearr [i++]=ar2[j];
                
            }
           if(j<ar2.length){
                mergearr [i++]=ar3[j];
           }
                j++;
            
        }
        for(int res =0;res<mergearr.length;res++){
                System.out.print(mergearr[res]+" ");
        }
    }
}
