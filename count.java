import java.util.*;
public class count {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        String input = sc.nextLine();
      
        int cc=0,vc =0,nc = 0,spc =0;
        for(int i =0;i<input.length();i++){
           
            char ch = input.charAt(i);
            if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')){
            if(!(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')){
                cc++;
            }
            else{
                    vc++;
            }
        }
        else if(ch>=47&&ch<=58){
                nc++;
        }
        else{
            spc++;
        }

        }
        
        System.out.println( "vowelcount : "+ vc);
        System.out.println("consonant count : "+ cc);
        System.out.println("numeric count: "+ nc);
        System.out.println("special character count: "+ spc);
    }
    }

