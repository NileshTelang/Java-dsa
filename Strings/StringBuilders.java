import java.util.*;


public class StringBuilders {

	public static void touppercase(String tuc){
		StringBuilder tu = new StringBuilder("");

		//first char
  		char ch = Character.toUpperCase(tuc.charAt(0));
		tu.append(ch);

		for(int i = 1 ;i<tuc.length();i++){
			//first char after space
			if(tuc.charAt(i) == ' ' && i < tuc.length()-1){
				tu.append(tuc.charAt(i));
				i++;
				tu.append(Character.toUpperCase(tuc.charAt(i)));
			}
			//remaining char
			else {
				tu.append(tuc.charAt(i));
			}
		}

		System.out.println("The upperCase String Is - "+tu.toString());
	}

	public static void stringCompress(String str){
		StringBuilder exa = new StringBuilder("");
		Integer count = 1; //Integer (object) ..later to convert toString()
		for(int i = 0;i<str.length();i++){
			//multiple
			while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
				count++;
				i++;
			}
			//single or last in multiple
			exa.append(str.charAt(i));
			if(count>1){
				exa.append(count.toString());
			}
			count = 1;
		}
		System.out.println("\nThe Compressed String Is - "+exa);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		String s = "Nilesh Telang";
		System.out.println(s);
		
//		?Strings Are Immutable -> Created String can't be modified New string is created for each modification
//		To overcome this we use string Builders
		
		System.out.println("String Builders : Reduces Time & Space Complexity \n");
		
		StringBuilder sb = new StringBuilder("Pony");
	    System.out.println(sb);

	    System.out.println(sb.charAt(0));
	    
	    sb.setCharAt(0, 'T');
	    System.out.println(sb);
	    
	    sb.insert(0, 'S');
	    System.out.println(sb);
	    
	    sb.delete(0, 1);
	    System.out.println(sb);
	    
	    sb.append(" Stark");
	    System.out.println(sb);
	    
	    System.out.println(sb.length());
	    
	    System.out.println("\nReverse ?	t/f : ");
	    boolean res = sc.nextBoolean();
	    if(res == true) {
	    	for(int i=sb.length()-1;i>=0;i--) {
	    		System.out.print(sb.charAt(i));
	    	}
	    }
	    else {
    		System.out.println("O H K !");
    	}

		System.out.print("\n\nEnter String - ");
		String pop = "nilesh telang is a , smart bOy know .";
		touppercase(pop);

		String compres = "AAAAAABBBCCCCCCDDE";
		stringCompress(compres);

	}

}
