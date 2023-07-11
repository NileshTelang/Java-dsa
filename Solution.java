class Solution {
    public static String mergeAlternately(String word1, String word2) {
        String merged = "";
        int max = 2 * Math.max(word1.length(), word2.length());
        int i = 0;
        while (i <= max) {
            if (i > word1.length() || i > word2.length()) {
                merged += " ";
            }
            if (i == 0 || i % 2 == 0) {
                merged += word1.charAt(i);
            } else {
                merged += word2.charAt(i);
            }
        }

        return merged;
    }

    public static void main(String[] args) {
        String a = "radha";
        String b = "krishn";

        System.out.println(mergeAlternately(a, b));
    }
}