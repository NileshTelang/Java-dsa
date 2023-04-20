

public class optimizedBubbleSort {


    public static void BubbleSort(int [] ar) {
		//O(n^2)
		int swap = 0;
		for(int i=0;i<ar.length-1;i++) {
			for(int j =0;j<ar.length-i-1;j++) {
				if(ar[j]>ar[j+1]) {
					int temp = ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
					swap++;
				}
			}
			if(swap == 0){
				System.out.println("\nAlready Sorted !");
				return; //O(n)
			}
		}
	}


    public static void print(int[] arr) {
		System.out.println("\nSorted Array : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}


    public static void main(String[] args) {
        int [] arr = {77,56,88,41,31,99};
        BubbleSort(arr);
        print(arr);
    }
}


//optimized selection sort and insertion sort under sorting techniques