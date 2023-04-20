public class MergeSort {// O(n log n)

    public static void mergeSort(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2; // (si+ei)/2
        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1]; // size of temp array //auxilary array - space complexity O(n)
        int i = si;
        int j = mid + 1;
        int k = 0;

        // comparing two partitions of array
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // left partition is bigger than right one
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // right partition is bigger than left one
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }

    }

    public static void printOrArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 7, 5, 6, 7, -2, 2, 9 };
        mergeSort(arr, 0, arr.length - 1);
        System.out.print("The sorted array Is - ");
        printOrArr(arr);
    }
}
