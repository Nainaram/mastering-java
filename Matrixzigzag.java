public class Matrixzigzag {
    public static void main(String[] args) {
        int [][] matrix = {{1,2,3,4},{1,2,3,4,},{1,2,3,4},{1,2,3,4}};

            for(int i=0;i<matrix.length;i++){
                if(i%2==0){

                    for(int j =0;j<matrix[i].length;j++){
                        System.out.print(matrix[i][j]+" ");
                    }
                }else{
                    for(int j=matrix[i].length-1;j>=0;j--){
                        System.out.print(matrix[i][j]+" ");
                    }
                }
                System.out.println();
            }
    }
}
