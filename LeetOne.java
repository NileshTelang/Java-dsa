class LeetOne {
    public static String mergeAlternately(String word1, String word2) {
        String merged = "";
        int i = 0, a = 0, b = 0;
        int max =  2* Math.max(word1.length(),word2.length());
        while (i < max) {
            if (i % 2 == 0) {
                if (a >= word1.length()) {
                    merged += "";
                } else {
                    merged += word1.charAt(a);
                }

                a++;
            } else {
                if (b >= word2.length()) {
                    merged += "";
                } else {
                    merged += word2.charAt(b);
                }

                b++;
            }
            i++;
        }

        return merged ;
    }

    public static void main(String[] args) {
        String a = "radha";
        String b = "krishn";

        System.out.println(mergeAlternately(a, b));
    }
}