import java.util.*;


public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Nova ⚝ \n");
		
		System.out.println("	JDK - > Software Development Kit Consists : "
				+ "\n		JRE - > Software Package Consists : "
				+ "\n			JVM - > Platform Independent Converts Bytecode To Native Machine Code "
				+ "\n			+ CLASS Libraries"
				+ "\n		+ JavaDoc\n		+ Compilers\n		+ Debuggers\n");
		

	    
//	    VARIABLES + literals
	    
	    System.out.println("Literals - > \n");
	    // binary
	    int binaryNumber = 0b10010; // 0b represents binary
	    // octal 
	    int octalNumber = 027; // 0 represents octal

	    // decimal
	    int decNumber = 34;

	    // hexadecimal 
	    int hexNumber = 0x2F; // 0x represents hexadecimal
	    
	    
	    System.out.println("Binary Num : "+binaryNumber+"\n"
	    		+ "Octal Num : "+octalNumber+"\n"
	    				+ "Decimal Num : "+decNumber+"\n"
	    						+ "Hexadecimal Num : "+hexNumber);
	    
	    double myDouble = 3.4;
	    float myFloat = 3.4F;
	 
	    // 3.445*10^2
	    double myDoubleScientific = 3.445e2;

	    System.out.println("Double Num : "+myDouble);  // prints 3.4
	    System.out.println("Float Num : "+myFloat);    // prints 3.4
	    System.out.println("DoubleScientific Num : "+myDoubleScientific+"\n");   // prints 344.5
	    
//		Primitive Datatypes ->
		
		System.out.println("Primitive DataTypes -> \n");
		System.out.println("Size of byte   : " + (Byte.SIZE/8) + " bytes.");
	    System.out.println("Size of short  : " + (Short.SIZE/8) + " bytes.");
	    System.out.println("Size of int    : " + (Integer.SIZE/8) + " bytes.");
	    System.out.println("Size of long   : " + (Long.SIZE/8) + " bytes.");
	    System.out.println("Size of char   : " + (Character.SIZE/8) + " bytes.");
	    System.out.println("Size of float  : " + (Float.SIZE/8) + " bytes.");
	    System.out.println("Size of double : " + (Double.SIZE/8) + " bytes.\n");
	    
	    float number = -42.3f;		//f is compulsory in Java
	    System.out.println(number);  // prints -42.3
	    
	    char letter = '\u0051';		// unicode for Q
	    System.out.println(letter+"\n");  // prints Q
	    
//	    OPERATORS
	    System.out.println("OPERATORS - >\n");
//	    1.Arithmetic Operators
	    System.out.println("1.Arithmetic Operators : \n");
	    // declare variables
	    int o = 12, p = 5;

	    // addition operator
	    System.out.println("a + b = " + (o + p));

	    // subtraction operator
	    System.out.println("a - b = " + (o - p));

	    // multiplication operator
	    System.out.println("a * b = " + (o * p));

	    // division operator
	    System.out.println("a / b = " + (o / p));

	    // modulo operator
	    System.out.println("a % b = " + (o % p)+"\n");
	    
//	    2.Assignment Operators
	    System.out.println("2.Assignment Operators : \n");
	    int var;

	    // assign value using =
	    var = o;
	    System.out.println("var using  =	: " + var);

	    // assign value using =+
	    var += o;
	    System.out.println("var using +=	: " + var);

	    // assign value using =*
	    var *= o;
	    System.out.println("var using *=	: " + var+"\n");
	    
	    
//	    3.Relational Operators
	    System.out.println("3.Relational Operators : \n");
	    
	    // == operator
	    System.out.println(o == p);  // false

	    // != operator
	    System.out.println(o != p);  // true

	    // > operator
	    System.out.println(o > p);  // false

	    // < operator
	    System.out.println(o < p);  // true

	    // >= operator
	    System.out.println(o >= p);  // false

	    // <= operator
	    System.out.println(o <= p);  // true
	    System.out.println();
	    
	    
//	    4.Logical Operators
	    System.out.println("4.Logical Operators : \n");
	    
	    // && operator
	    System.out.println((5 > 3) && (8 > 5));  // true
	    System.out.println((5 > 3) && (8 < 5));  // false

	    // || operator
	    System.out.println((5 < 3) || (8 > 5));  // true
	    System.out.println((5 > 3) || (8 < 5));  // true
	    System.out.println((5 < 3) || (8 < 5));  // false

	    // ! operator
	    System.out.println(!(5 == 3));  // true
	    System.out.println(!(5 > 3));  // false
	    System.out.println();
	    
	    
//	    5.Unary Operators
	    System.out.println("5.Unary Operators : \n");
	 // increment operator
	    int result1 = ++o;
	    System.out.println("After increment: " + result1);
	    
	    System.out.println();
	    
//	    6.BitWise Operators
//	    Operator	Description
//	    ~	Bitwise Complement
//	    <<	Left Shift
//	    >>	Right Shift
//	    >>>	Unsigned Right Shift
//	    &	Bitwise AND
//	    ^	Bitwise exclusive OR
//	    These operators are not generally used in Java.
	    
//	    instanceof Operator
	    System.out.println("instanceof Operator - \n");
	    String str = "Programiz";
	    boolean result;
	    result = str instanceof String;
	    System.out.println("Is str an object of String? " + result+"\n");
	    

//	    ternary operator
	    System.out.println("ternary Operator - \n");
	    int februaryDays = 29;
	    String results;
	    results = (februaryDays == 28) ? "Not a leap year" : "Leap year";
	    System.out.println(results+"\n");
	    
	    
//	    Scanner Class - Input ->
	    
	    Scanner sc = new Scanner (System.in);
	    System.out.println("Enter Num");
	    int a = sc.nextInt();
	    System.out.println(a+"\n");
	    System.out.println("Enter Word");
	    String b = sc.next();
	    System.out.println(b+"\n");
	    System.out.println("Enter Sentence");
	    sc.nextLine(); //buffer
	    String c = sc.nextLine();
	    System.out.println(c+"\n");
	    
//	 	expression
//	    number = 10
//	   	statement
//	    number = 10;
		
//		Conditional Statements ->
		
	    System.out.println("Enter num to know it's type : ");
		int x = sc.nextInt();
		
		if(x%2==0 && x!=0) 
			System.out.println("Even"); //Work without {} bcz it's of only one-line execution 
		else if(x==0) 
			System.out.println("Zero");
		else {
			System.out.println("Odd");
			
		}
		
//		switch statement to check size
		String size;
	    switch (x) {

	      case 29:
	        size = "Small";
	        break;

	      case 42:
	        size = "Medium";
	        break;

	      // match the value of week
	      case 44:
	        size = "Large";
	        break;

	      case 48:
	        size = "Extra Large";
	        break;
	      
	      default:
	        size = "Unknown";
	        break;

	    }
	    System.out.println("Size: " + size+"\n");	
		    
	    
    
//			Loops
	    
//	    for-each-loop
	    
	    System.out.println("For-Each-Loop");
 	   	char[] vowels = {'a', 'e', 'i', 'o', 'u'};
 	  
 	   	// iterating through an array using the for-each loop
 	   	for (char item: vowels) {
 	   		System.out.println(item);
 	   	}
 	   	System.out.println();
 	   	
		System.out.println("Enter The Element For Pattern : ");
	    int n = sc.nextInt();
	    for(int i = 0;i<n;i++){
			for(int j=0;j<n-1-i;j++){
				System.out.print("  ");
			}
			if(i%2==0) {
				for(int k=0;k<i;k++) {
					System.out.print(" # ");
				}
				
			}else {
				for(int k=0;k<i;k++){
					System.out.print(" @ ");
				}
			}
			System.out.println();
		}
	    
	    System.out.println("Enter The Num To Get Sum : ");
	    int num = sc.nextInt();
	    int sum=0;
	    for(int i=0;i<=num;i++) {
	    	sum += i ;
	    }
	    System.out.println(sum);
	    
	    
	    System.out.println("Enter i and j for hollow rectangle : ");
	    int row = sc.nextInt();
	    int col = sc.nextInt();
	    
	    for(int i=0;i<row;i++) {
	    	for(int j=0;j<col;j++) {
	    		if(i == 0 || i == row-1 || j == 0 || j == col-1) {
	    			System.out.print(" % ");
	    		}else {
	    			System.out.print("   ");
	    		}
	    	}
	    	System.out.println();
	    }
	    
	    
		System.out.println("Enter The Element For Num Pattern : ");
	    int no = sc.nextInt();
	    int xe =0;
	    for(int i = 0;i<no;i++){
			for(int j=0;j<no-1-i;j++){
				System.out.print("	");
			}
			for(int k=0;k<i;k++) {
				System.out.print("	"+xe+"	");
				xe++;
			}
			System.out.println();
		}
	    
	    
	    System.out.println("0-1 Triangle	: ");
	    int zt = sc.nextInt();
	    for(int i=0;i<zt;i++) {
	    	for(int j=0;j<i;j++) {
	    		if( (i+j) % 2 == 0) {
	    			System.out.print(" 0 ");
	    		}else {
	    			System.out.print(" 1 ");
	    		}
	    	}
	    	System.out.println();
	    }
	    
	    
	    System.out.println("Butterfly Pattern : ");
	    int bfly = sc.nextInt();
	    for(int i=1;i<=bfly;i++) {
	    	for(int j=1;j<=i;j++) {
	    		System.out.print("	🦋	");
	    	}
	    	for(int k=1;k<=2*(bfly-i);k++) {
	    		System.out.print("		");
	    	}
	    	for(int j=1;j<=i;j++) {
	    		System.out.print("	🦋 	");
	    	}
	    	System.out.println();
	    	System.out.println();
	    	System.out.println();
	    	
	    }
	    for(int i=bfly;i>0;i--) {
	    	for(int j=1;j<=i;j++) {
	    		System.out.print("	🦋	");
	    	}
	    	for(int k=1;k<=2*(bfly-i);k++) {
	    		System.out.print("		");
	    	}
	    	for(int j=1;j<=i;j++) {
	    		System.out.print("	🦋	");
	    	}
	    	System.out.println();
	    	System.out.println();
	    	System.out.println();
	    	
	    }
	   
	    
	    System.out.println("Palindromic Pattern : ");
	    int palp = sc.nextInt();
	    for(int i=1;i<=palp;i++) {
	    	for(int j=1;j<=palp-i;j++) {
	    		System.out.print("   ");
	    	}
	    	for(int k=i;k>0;k--) {
	    		System.out.print(" "+k+" ");
	    	}
	    	for(int l=2;l<=i;l++) {
	    		System.out.print(" "+l+" ");
	    	}
	    	System.out.println();
	    }
	    for(int i=palp-1;i>0;i--) {
	    	for(int j=1;j<=palp-i;j++) {
	    		System.out.print("   ");
	    	}
	    	for(int k=i;k>0;k--) {
	    		System.out.print(" "+k+" ");
	    	}
	    	for(int l=2;l<=i;l++) {
	    		System.out.print(" "+l+" ");
	    	}
	    	System.out.println();
	    }

	    
//	    Factorial
	    System.out.println("Factorial Of A Num : ");
	    int fac = sc.nextInt();
	    System.out.println("The Factorial Of Given Num Is : " + factorialOfNum(fac)); //function 
	    
//	    Fibonacci Series
	    System.out.println("Fibonacci Series : ");
	    int fs = sc.nextInt();
	    fibonacciSeries(fs);
	    
	    
	    sc.close();//closing scanner object
	    
	       
	   
	}
	
	//factorial function
	public static int factorialOfNum(int a) {
		int fac = 1;
		for(int i=a;i>0;i--) {	
			fac*=a;
		}
		return fac;
	}
	
	
	//fibonacciseries function
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
