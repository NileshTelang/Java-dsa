import java.util.*;

public class PrimeNum {
    public static boolean IsPrime(int n) {  // O ( sqrt n )

        if (n < 2) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }

    public static void Primera(int a, int b) {
        System.out.println("Prime Numbers Are : ");
        for (int i = a; i <= b; i++) {
            if (IsPrime(i)) {
                System.out.print(i + " ");
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range for Prime Numbers : ");
        System.out.print("From - ");
        int a = sc.nextInt();
        System.out.print("To - ");
        int b = sc.nextInt();

        Primera(a, b);

    }

}
