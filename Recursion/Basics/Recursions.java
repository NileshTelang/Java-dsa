
import java.util.*;


public class Recursions {
	
	//factorial using for loop
	
	public static void factorialsFor(int n) {
		int factorial = 1;
		System.out.println("Factorial are : ");
		for(int i=n;i>1;i--) {
			System.out.print(i+" * ");
			factorial *= i;
		}
		System.out.println("1 = "+factorial);
	}
	
	//factorial using recursion
	
	public static int factorialsRec(int n) {
		if(n == 0) {
			return 1;
		}
		int fact = n * factorialsRec(n-1);
		return fact;
	}
	
	//fibonacci series using recursion
	
	public static void printFib(int a,int b,int n) {
		if(n == 0){
			return;
		}
		int c = a+b ;
		System.out.print(c+" ");
		printFib(b,c,n-1);
	}

	// public static int fib(int n){
	// 	if(n == 0 || n == 1){
	// 		return n;
	// 	}
	// 	int f1 = fib(n-1);
	// 	int f2 = fib(n-2);
	// 	return f1 + f2;
	// }
	
	//print function for factorials 
	
	public static void prints (int n) {
		//base condition
		
		if(n>5) {
			return ;
		}
		
		System.out.println(n);
		prints(n+1);
	}
	
	//x^n power function
	
	public static int pow(int x,int n) {
		if(n == 0) {
			return 1;
		}
		if(x == 0) {
			return 0;
		}
		
		//stack height = n
//		x = x*pow(x,n-1);
//		return x;
		
		//stack Height = logn
		int hpow = pow(x,n/2);
		if(n % 2 == 0) {
			return hpow * hpow;
		}else {
			return hpow * hpow * x;
		}
	}
	
	//Tower Of Hanoi

	public static void towerOfHanoi(int n ,String src , String hlp , String dsn){
		 if(n == 1){
			System.out.println("Transferred "+n+" From "+src+" To "+dsn);
			return;
		 }
		 towerOfHanoi(n-1,src,dsn,hlp);
		 System.out.println("Transferred "+n+" From "+src+" To "+dsn);
		 towerOfHanoi(n-1, hlp, src, dsn);
	}
	
	//main function

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("Num Printing Using Recursion : 1-5 \n");
		prints(1);
		
		System.out.println("\nFactorial Of A Given Number : ");
		Scanner sc = new Scanner(System.in);
		int fac = sc.nextInt();
		factorialsFor(fac);
		System.out.println("\nFactorial Of A Given Number Using Rec : "+factorialsRec(fac));
		
		System.out.println("Fibonacci Series Of Num :  ");
		int fib = sc.nextInt();
		System.out.print("Fibonacci Series : 0 1 ");
		printFib(0,1,fib-2);
		// System.out.println("- "+fib(fib));
		
		System.out.println("\nPower Function ");
		System.out.println("Num  :  ");
		int x = sc.nextInt();
		System.out.println("Power : ");
		int pow = sc.nextInt();
		System.out.println(pow(x,pow));

		System.out.println("Tower Of Hanoi");
		towerOfHanoi(3,"A","C","B");


	}

}
