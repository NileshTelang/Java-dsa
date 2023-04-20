import java.util.*;

public class BinDec {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter The Binary Num : ");
        int binNum = sc.nextInt();

        int decNum = 0;
        int pow = 0;
        if(binNum == 0){
            System.out.print(0);
        }
        
        while(binNum>0){
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2,pow));
            pow++;
            binNum = binNum / 10 ;
        }
        System.out.println("The Decimal Num For given Binary Num Is : "+decNum);
    }
}
