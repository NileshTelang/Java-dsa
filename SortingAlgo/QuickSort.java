//Theta( n log n) - average // O (n pow 2) - worst 
//or O(n pow 2) when array is sorted and pivot is largest or smallest element
public class QuickSort {
    public static void quickSort(int[] arr, int si, int ei) {
        if (si < ei) {
            int pivot = partition(arr, si, ei);
            quickSort(arr, si, pivot - 1);
            quickSort(arr, pivot + 1, ei);
        }
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;
        
        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        
        int temp = arr[ei];
        arr[ei] = arr[i + 1];
        arr[i + 1] = temp;
        
        return i + 1;
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {7, 5, 6, 7, -2, 2, 9, 8};
        quickSort(arr, 0, arr.length - 1);
        System.out.print("The sorted array is: ");
        printArray(arr);
    }
}
