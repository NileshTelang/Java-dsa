import java.util.Scanner;

public class Strings {

    public static boolean isPalindrome(String pald){
        int n = pald.length();
        for(int i=0;i<=n/2;i++){
            if(pald.charAt(i)!=pald.charAt(n-1-i))
                return false;
        }
        return true;
    }

    public static float ShortestPath(String path){
        int x = 0,y = 0;

        for(int i = 0;i<path.length();i++){
            char dir = path.charAt(i);
            //north
            if(dir == 'N'){
                y++;
            }
            //south
            else if(dir == 'S'){
                y--;
            }
            //east
            else if(dir == 'E'){
                x++;
            }
            //west
            else if(dir == 'W'){
                x--;
            }
        }
        
        int X2 = x * x ;
        int Y2 = y * y ;
        return (float) Math.sqrt(X2+Y2);
    }

    public static void stringComp(){
        String s1 = "Stark"; //s1 - > stark.0 object
        String s2 = "Stark"; //s2 - > stark.0 object
        String s3 = new String("Stark"); //s3 - > stark.1 object

        if(s1 == s2 ){
            System.out.println("\nStrings Are Equal as Same Object . !");
        }else {
            System.out.println("Not Equal !");
        }

        if(s1 == s3){
            System.out.println("Strings equal !");
        }
        else{
            System.out.println("\nNot Equal as New Obj created for S3 !");
        }
        // == operator not useful as it compares the same objects 

        //To compare the values , .equals() 
        if(s1.equals(s3)){
            System.out.println("\nEqual !");
        }
    }
    
    public static String largestString(String [] fruits){
        //O(X x N)
        String largest = fruits[0];
        for(int i = 1;i<fruits.length;i++){
            if((largest.compareTo(fruits[i])) < 0){
                largest = fruits[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //IsPalindrome
        System.out.println("Enter The String To Check IsPalindrome : ");
        String pald = sc.nextLine();
        System.out.println("IsPalindrome - "+isPalindrome(pald));

        //shortestPath
        System.out.println("Enter The Path : ");
        String path = sc.nextLine();
        System.out.println("Shortest Path Is - "+ShortestPath(path));

        // . equals() function
        stringComp();
        
        // . substring() funcion
        String s1 = "STARK";
        System.out.println("\n"+s1.substring(2, s1.length()));

        // . compareTo() function
        String fruits[] = {"Apple","Banana","Srawberry"};
        System.out.println("The largest string Is - "+largestString(fruits));

        System.out.println("String Are Immutable - They can't be modified !");
        String name = "Nilesh Telang"; //var name - > Obj 1 = "Nilesh Telang"
        name = "Tony Stark";           //var name - > Obj 2 = "Tony Stark"
        System.out.println(name);      //reference changes value doesn't change in object

    }
}
