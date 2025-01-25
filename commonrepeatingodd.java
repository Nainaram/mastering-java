public class commonrepeatingodd {
    public static void main(String[] args) {
        int arr [] ={1,2,3,4,5};
        int arr2 [] ={3,4,5,6,7};
            int i =0,j=0;
            while(i<arr.length&&j<arr2.length){
                if(arr[i]==arr2[j]){
                    if(arr[i]%2!=0&&arr2[j]%2!=0){
                        System.out.print(arr[i]+" ");
                    }
                        i++;
                        j++;
                }
                    else if(arr[i]<arr2[j]){
                            i++;
                    }
                    else {
                        j++;
                    }
                }
            }
    }

