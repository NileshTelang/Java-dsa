import java.util.*;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("1d Array - > \n");
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the Arrays Size : ");
		int s = sc.nextInt();
		
		int [] arr = new int [s]; //Creation
		
		System.out.println("Enter The Ele : ");
		for(int i = 0; i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("The Elements In the Array Are :  ");
		for(int i = 0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

		int [] arrinit = { 1 , 2 , 3 };//InitializaTion 
		
		System.out.println("\n\n2d Array - > \n");
		
		System.out.println("Enter the Arrays Size row & col : ");
		int row = sc.nextInt();
		int col = sc.nextInt();
		
		int [][] arrt = new int [row][col]; //Creation
		
		System.out.println("Enter The Ele : ");
		for(int i = 0; i<row;i++) {
			for (int j=0;j<col;j++) {
				arrt[i][j] = sc.nextInt();
			}
		}
		System.out.println("The Elements In the Array Are :  ");
		for(int i = 0; i<row;i++) {
			for (int j=0;j<col;j++) {
				System.out.print(arrt [i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Enter Num To Find : ");
		int x = sc.nextInt();
		for(int i = 0; i<row;i++) {
			for (int j=0;j<col;j++) {
				if(arrt[i][j]==x) {
					System.out.println("Array["+i+"]["+j+"]");
				}
			}
		}
		
		System.out.println("Multidimensional Array ->");
		
		// create a 2d array
        int[][] a = {
            {1, -2, 3}, 
            {-4, -5, 6, 9}, 
            {7}, 
        };
      
        // first for...each loop access the individual array
        // inside the 2d array
        System.out.println("2D");
        for (int[] innerArray: a) {
            // second for...each loop access each element inside the row
            for(int data: innerArray) {
                System.out.print(data+" ");
            }
        }
        
        System.out.println();
        
        System.out.println("3D");
     // create a 3d array
        int[][][] test = {
            {
              {1, -2, 3}, 
              {2, 3, 4}
            }, 
            { 
              {-4, -5, 6, 9}, 
              {1}, 
              {2, 3}
            } 
        };

        // for..each loop to iterate through elements of 3d array
        for (int[][] array2D: test) {
            for (int[] array1D: array2D) {
                for(int item: array1D) {
                    System.out.print(item+ " ");
                }
            }
        }
        
        System.out.println();
        
	}

}
