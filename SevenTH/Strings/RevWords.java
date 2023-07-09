public class RevWords {
    public static void main(String[] args) {
        String s = "Computer Is Fun";
        String rev = "";
        
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                rev = rev + s.charAt(i);
            } else {
                System.out.print(reverseWord(rev) + " ");
                rev = "";
            }
        }
        
        // Print the last word
        System.out.print(reverseWord(rev));
    }
    
    private static String reverseWord(String word) {
        String reversedWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord += word.charAt(i);
        }
        return reversedWord;
    }
}
