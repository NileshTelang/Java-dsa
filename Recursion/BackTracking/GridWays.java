import java.util.Scanner;

public class GridWays {

    public static int findGridWays(int i , int j , int m , int n){
        
        //base case
        if(i == m && j == n){
            return 1;
        }else if (i == m + 1 || j == n + 1){
            return 0;
        }

        //recursion
        return findGridWays(i+1 , j , m , n ) + findGridWays( i , j+1 , m , n ) ;
    }
    
    public static void main(String[] args) { //O(2 ^ (m+n))
        
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter the elements OF GRID \nrows - ");
        int row  = sc.nextInt();
        System.out.print("Col - ");
        int col = sc.nextInt();

        System.out.println("The gridWays are - "+ findGridWays(1 , 1 ,row,col));
    }
}
