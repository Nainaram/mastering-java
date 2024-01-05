public class foreachoverloading{
	static int sum(int ...arr){
			result += arr;
		for(int a:arr){
		result += a;} 
		return result;}
	public static void main(String[] args){
		
	System.out.println(" SUM OF THE ARRAY:" + sum());
	}
}