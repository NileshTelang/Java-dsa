import java.util.Scanner;

public class stairCaseSearch {

    public static boolean stairCaseSearch(int key,int matrix [][]){
        //O(n+m)
        int row = 0 ; int col =matrix[0].length-1;
        while(row < matrix.length && col >= 0){
            if(key == matrix[row][col]){
                System.out.println("Key Element Fount at position - [ "+(row+1)+" ] [ "+(col+1)+" ]");
                return true;
            }
            else if(key < matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("Key Element Not Found !");
        return false;   
    }
    
    public static void main(String[] args) {
        int [][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,17}};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key element  : ");
        int key = sc.nextInt();
        stairCaseSearch(key,arr);
    }
}
