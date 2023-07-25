import java.util.Scanner;

public class Fibonacci {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num  : ");
        int num = sc.nextInt();

        fibonacciSeries(num);
        
    }
    public static void fibonacciSeries(int fs) {
	      
		int a = 0, b = 1;
	          
	    System.out.print(a+" ");
	      
	    if(fs > 1) {
	        //find nth term
	        for(int i=1; i<fs; i++) {
	            System.out.print(b+" ");
	            //the concept below is called swapping
	            int temp = b;
	            b = a + b;
	            a = temp;
	        }
	 
	        System.out.println();
	   }
	    else {
	    	System.out.println(0);
	    }
	    
	}
}
