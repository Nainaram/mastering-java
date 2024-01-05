public class chatCenter{
	public static void main (String [] args){
		Boolean Customer = true;
		System.out.println("Customer..calling");
		if( Customer =  true){
		System.out.println("welcome");
		System.out.println(" Hello everybody !!!!");
		System .out.println(" I would like to make you feel much more comportable and mismerised  of the wonder chat , called special BHEL!!");}
		else
		{System.out.println("no thanks");}
	
		
		System .out. println(" What would you like to prefer for..");
		System .out.println(" HERE IS THE MENU CARD$");
		String foodvariety[] = {"mixture"," bhel","sweets","chips","snacks"};
		for ( int i = 0; i <foodvariety.length;i++){
			System.out.println(foodvariety[i]);
			Thread.sleep(2);
		}
	}
}