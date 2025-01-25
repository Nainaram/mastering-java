public class MatrixBoudary {
    public static void main(String[] args) {
        int [][] matrix = {{1,2,3,4},
                            {5,6,7,8},
                            {9,10,11,12},
                            {13,14,15,16}};
       int target=10;
        System.out.println(foundTarget(matrix, target));
        

    }
    public static boolean foundTarget(int matrix [] [], int target){
        int i =0;
        int j= matrix[0].length-1;
        while(i<matrix.length && j>=0){
            if(matrix[i][j]==target){
                    System.out.println("found at: ( "+ i +" , "+ j+" )");
                    return true;
            }
            else if(target<matrix[i][j]){
                    j--;
            }
            else{
                i++;
            }
        }
        return false;
    }
}
