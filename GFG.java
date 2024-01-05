class GFG {
    public static void main(String[] args)
    {
        // declares an Array of integers.
        String[] arr;
 
        // allocating memory for 5 integers.
        arr = new String[5];
 
        // initialize the first elements of the array
        arr[0] = "mixture";
 
        // initialize the second elements of the array
        arr[1] ="masala fali";
 
        // so on...
        arr[2] = "bhel";
        arr[3] = "chips";
        arr[4] = "dal";
 
        // accessing the elements of the specified array
        for (int i = 0; i < arr.length; i++)
            System.out.println("Element at index " + i
                               + " : " + arr[i]);
    }
}