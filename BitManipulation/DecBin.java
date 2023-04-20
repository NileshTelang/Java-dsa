import java.util.*;

public class DecBin {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter The Decimal Num : ");
        int decNum = sc.nextInt();

        int binNum = 0;
        int pow = 0;

        while(decNum>0){
            int rem = decNum % 2;
            binNum = binNum + (rem * (int)Math.pow(10,pow));
            pow++;
            decNum = decNum / 2 ;
        }
        System.out.println("The Binary Num For given Decimal Num Is : "+binNum);
    }
}
