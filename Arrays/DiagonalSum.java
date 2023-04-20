public class DiagonalSum {

    public static void printDiagonalSum(int [][] matrix){
        int sum = 0;
        //O(n^2)
        //primary diagonal sum
        /*for(int i = 0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i==j){
                    sum += matrix[i][j];
                }
                else if(i+j == matrix.length-1){
                    sum += matrix[i][j];
                }
            }
        }*/

        //O(n)
        for(int i = 0;i<matrix.length;i++){
            //pd
            sum += matrix[i][i];
            //sd
            if(i != matrix.length-1-i)
                sum += matrix[i][matrix.length-1-i];
        }

        System.out.println("Diagonal Sum For Matrix Is : "+sum);
    }
    
    public static void main(String[] args) {
        int [][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,17}};
        printDiagonalSum(arr);
    }
}
