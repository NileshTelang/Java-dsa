import java.util.Arrays;

class MinAbsDiff {

    public static void main(String[] args) {
        int A[] = { 1, 2, 3 };
        int B[] = { 2, 1, 3 };

        Arrays.sort(A);
        Arrays.sort(B);

        int midDiff = 0;

        for (int i = 0; i < A.length; i++) {
            midDiff += Math.abs(A[i] - B[i]);
        }

        System.out.println("Min Absolute Difference : "+midDiff);
    }
}