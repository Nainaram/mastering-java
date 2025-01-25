public class largestrepeat 
{
    public static void main(String[] args) 
    {
        int arr[] ={2,3,3,3,4,5,7,7,9,11};
        {
            int count =1;
            for(int i=arr.length-1;i>0;i--)
            {
                if(arr[i]==arr[i-1])
                {
                    count++;
                    System.out.println(arr[i]+" - "+count);
                    break;
                }
            }
        }
    }
}
