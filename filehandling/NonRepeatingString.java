public class NonRepeatingString{
    public static void main(String[] args) {
        String str = "tapacademy";
        System.out.println(" longest substring without repeating characters: " + nonReapeaString(str)+ " length: "+nonReapeaString(str).length());
    }
    public static String nonReapeaString(String s) {
        int n = s.length();
        String res="";
        for(int i=0;i<n;i++){
            String temp = "";
          for(int j=i+1;j<n;j++){
              if(temp.indexOf(s.charAt(j))==-1){
                temp = temp+s.charAt(j);
              }
              else{
                break;
              }
          }
          if(temp.length()>res.length()){
              res = temp;
          }
      }
      return res;
    }
}