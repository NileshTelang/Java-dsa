import java.util.Scanner;

public class NQueens { //O(n!)

    public static boolean isSafe(char arr[][], int row, int col) {
        // vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (arr[i][col] == 'Q') {
                return false;
            }
        }

        // diagonally up left
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (arr[i][j] == 'Q') {
                return false;
            }
        }

        // diagonally up right
        for (int i = row - 1, j = col + 1; i >= 0 && j < arr.length; i--, j++) {
            if (arr[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    //count ways
    static int countNQ = 0 ;
    public static void nQueens(char arr[][], int row) {

        // base case
        if (row == arr.length) {
            printChessBoard(arr);
            countNQ ++ ;
            return;
        }

        // recursive backtracking
        for (int j = 0; j < arr.length; j++) {
            if (isSafe(arr, row, j)) {
                arr[row][j] = 'Q';
                nQueens(arr, row + 1);// function call
                arr[row][j] = 'X'; // backtracking
            }
        }

    }

    public static boolean nQueensb(char arr[][], int row) {

        // base case
        if (row == arr.length) {
            countNQ ++ ;
            return true;
        }

        // recursive backtracking
        for (int j = 0; j < arr.length; j++) {
            if (isSafe(arr, row, j)) {
                arr[row][j] = 'Q';
                if(nQueensb(arr, row + 1)){
                    return true;
                }// function call
                arr[row][j] = 'X'; // backtracking
            }
        }

        return false ;

    }

    public static void printChessBoard(char arr[][]) {
        System.out.println("< - - - Chess Board - - - >");
        int row = arr.length;
        int col = arr[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(" " + arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number Of Queens - ");
        int nQ = sc.nextInt();
        char chessboard[][] = new char[nQ][nQ];
        // initialization of chessboard
        for (int i = 0; i < nQ; i++) {
            for (int j = 0; j < nQ; j++) {
                chessboard[i][j] = 'x';
            }
        }
        printChessBoard(chessboard);

        System.out.println("All Solutions - >");
        nQueens(chessboard, 0);
        System.out.println("Number Of Ways Are ->> "+countNQ+"\n\n");

        System.out.println("First/One Solutions - >");
        if(nQueensb(chessboard, 0)){
            printChessBoard(chessboard);
        }else{
            System.out.println("Solution Not POSSIBLE !");
        }
    }
}
