import java.util.Scanner;

public class BitManipulation{

    public static void IsOddEven(int key){
        int bitmask = 1;
        if((key & bitmask) == 0){
            System.out.println("Element "+key+" Is Even");
        }
        else {
            System.out.println("Element "+key+" Is Odd");
        }
    }

    public static int GetIthBit(int key,int ith){
        int bitmask = 1 << ith;
        if((key & bitmask << ith) == 0){
            return 0;
        }else
            return 1;
    }

    public static int SetIthBit(int key,int ith){
        int bitmask = 1 << ith;
        return key | bitmask ;
    }

    public static int ClearIthBit(int key,int ith){
        int bitmask = ~(1 << ith);
        return key & bitmask ;
    }

    public static int UpdateIthBit(int key,int ith,int bit){
        // if(bit == 0){
        //     return ClearIthBit(key, ith);
        // }else{
        //     return SetIthBit(key, ith);
        // }

        ClearIthBit(key, ith);
        int newBit = bit << ith ; //or with 0 already cleared o/p , or with 1 will set the bit 
        return newBit | key ;
    }

    public static int clearIBits(int key , int ith){
        int bitMask = (-1)<<ith;
        return key & bitMask;
    }

    public static int clearIBits(int key , int ith , int jth){
        int a = (-1)<<(jth+1); //-1 = ~0
        int b = (1<<ith)-1;
        int bitMask = a | b ;
        return key & bitMask;
    }

    public static boolean isPowerOfTwo(int key){
        return (key & (key-1)) == 0;
    }
    
    public static int countSetBits(int n){
        int count = 0;
        while(n > 0){
            if((n & 1) == 1 ){
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static int fastExpo(int a,int n){
        int ans = 1;

        while(n > 0){
            if((n & 1) == 1 ){
                ans = ans * a;
            }
            a = a * a ;
            n = n >> 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("BitWise AND For 5 & 6 Is - "+ (5 & 6)); //0 Dominant
        System.out.println("BitWise OR  For 5 | 6 Is - "+ (5 | 6)); //1 Dominant
        System.out.println("BitWise XOR For 5 ^ 6 Is - "+ (5 ^ 6)); //same 0
        System.out.println("BitWise complement For ~5 Is - "+ (~5)); //a.MSB changes i.e +ve value becames -ve b. +1  c.~5 -> -6 normally ~0 - > 1 but MSB factor
        System.out.println("BitWise Left Shift For 5 << 2 Is - "+ (5 << 2)); //bits shift to left by 2 places nd right empty places fill with 0's //a<<b => a*(2 pow b)
        System.out.println("BitWise Right Shift For 5 >> 2 Is - "+ (6 >> 1)); // a>>b => a / (2 pow b)
        IsOddEven(8);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element - ");
        int key = sc.nextInt();
        System.out.println("Position Of I'th Bit - ");
        int ith = sc.nextInt();
        System.out.println("The "+ith+"'th Bit Of "+key+" Is - "+GetIthBit(key,ith));
        System.out.println("Set "+ith+"'th Bit Of "+key+" As 1 , Element - "+SetIthBit(key,ith));
        System.out.println("Clear "+ith+"'th Bit Of "+key+" As 0 , Element - "+ClearIthBit(key,ith));
        System.out.print("Enter New Bit - ");
        int newBit = sc.nextInt();
        System.out.println("Update "+ith+"'th Bit Of "+key+" As "+newBit+" , Element - "+UpdateIthBit(key,ith,newBit));
        System.out.println("The Bits upto "+ith+"'th Bit Of "+key+" are Cleared , Element - "+clearIBits(key,ith));
        System.out.println("Enter Jth Bit - ");
        int jth = sc.nextInt();
        System.out.println("The Bits in range "+ith+"'th and "+jth+"'th Bit Of "+key+" are Cleared , Element - "+clearIBits(key,ith,jth));
        System.out.println("The key "+key+" IsPowerOfTWo - "+isPowerOfTwo(key));
        System.out.println("The key "+key+" Has Set Bit Count - "+countSetBits(key));
        System.out.println("Fast Expo For 5 toThePow 3 Is - "+fastExpo(5 , 3));
        
    }
}
