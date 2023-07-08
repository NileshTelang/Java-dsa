import java.util.Scanner;

public class InitialsAndSurname {

    public static void main(String[] args) {

        // S C Bose
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Full Name : ");
        String s = sc.nextLine();

        String is = "";

        System.out.print("Output :  ");

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                is = is + ch;
            } else {
                System.out.print(is.toUpperCase().charAt(0) + ". ");
                is = "";
            }
        }
        is.toUpperCase().charAt(0);
        System.out.print(is.toUpperCase().charAt(0) + is.substring(1, is.length()));

    }
}
