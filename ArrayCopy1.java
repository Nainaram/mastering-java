
class ArrayCopy1{
	public static void main (String[] args)
	{
		char [] copyFrom = { 'j','a','v','a',' ','i','s','f','u','n'};
	char[] copyTo = new char[15];
		copyTo[0] ='e';
		copyTo[1] ='n';
		copyTo[2] ='j';
		copyTo[3] ='o';
		copyTo[4] ='y';
		
		
		System.arraycopy(copyFrom,7,copyTo,5,8);
		System.out.println(copyTo);
	}
}