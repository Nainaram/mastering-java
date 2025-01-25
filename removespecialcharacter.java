import java.util.*;
public class removespecialcharacter {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        String input = sc.nextLine();
        String newstring = "";
        int numeric =0;
        // int cc=0,vc =0,nc = 0,spc =0;
        for(int i =0;i<input.length();i++){
           
            char ch = input.charAt(i);
            if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')){
                
                    newstring +=ch;
            }
            else if (ch>=47&&ch<=58){
                    numeric+=(ch-'0');
                }

            }
           
        
        System.out.println(newstring+numeric);
       
    }
    }

