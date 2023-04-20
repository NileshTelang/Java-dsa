
import java.util.Scanner; //Input
import java.util.Arrays; //InbuiltSort
import java.util.Collections; //reverseInbuiltSort

public class SortingTechniques {

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
				print(ar);
			}
			if(swap == 0){
				System.out.println("\nAlready Sorted !");
				return; //O(n)
			}
		}
	}
	
	public static void SelectionSort(int [] ar) {
		//O(n^2)
		int swap = 0;
		for(int i=0;i<ar.length-1;i++) {
			int smallest = i;
			for(int j =i+1;j<ar.length;j++) {
				if(ar[smallest]>ar[j]) {
					smallest = j;
					swap++;
				}
			}
			int temp = ar[smallest];
			ar[smallest]=ar[i];
			ar[i]=temp;
			if(swap == 0){
				System.out.println("\nAlready Sorted !");
				return; //O(n)
			}
		}
	}
	
	public static void InsertionSort(int [] arr) {
		//O(n^2)
		for(int i = 1;i<arr.length;i++) {
			int current = arr[i];
			int j = i-1;
			while(j >= 0 && current < arr[j]) {
				arr[j+1]=arr[j];
				j--; 
			}
			arr[j+1] = current ;
		}
	}
										
	//O(n log n) --> very less compared to O(n^2)
	public static void InbuiltSort(int [] arr){
		Arrays.sort(arr);
	}
	
	public static void InbuiltRevSort(Integer [] arr){
		Arrays.sort(arr, Collections.reverseOrder());
	}

	public static void print(int [] arr) {
		System.out.println("\nSorted Array : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void countingSort(int [] arr){
		//largest element in arr array
		int largest = Integer.MIN_VALUE;
		for(int i=0 ; i<arr.length;i++){
			largest = Math.max(largest, arr[i]);
		}
		//count array update
		int count [] = new int [largest+1];
		for(int i = 0;i<arr.length;i++){
			count[arr[i]]++;
		}
		//sorting in arr array
		int j = 0;
		for(int i = 0;i<count.length;i++){
			while(count[i]>0){
				arr[j]=i;//i element in count = number in arr
				j++;
				count[i]--;
			}
		}

	}

	public static void print(Integer [] arr) {
		System.out.println("\nSorted Array : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {77,56,88,41,31,99};
		Integer [] arri = {77,56,88,41,31,99};
		System.out.println("Array : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		Scanner sc = new Scanner(System.in);
		int r;
		do {
			System.out.println("\nSort The Array - \n1 . Bubble Sort\n2 . Selection Sort\n3 . Insertion Sort\n4 . Inbuilt Sort\n5 . Counting Sort\nEnter Your Choice : ");
			int s = sc.nextInt();
			switch(s) {
			case 1 : BubbleSort(arr);
			print(arr);
			break;
			case 2 : SelectionSort(arr);
			print(arr);
			break;
			case 3 : InsertionSort(arr);
			print(arr);
			break;
			case 4 : InbuiltSort(arr);
			print(arr);
			InbuiltRevSort(arri);
			print(arri);
			break;
			case 5 : countingSort(arr);
			print(arr);
			break;
			default : System.out.println("Wrong Choice !");
			}
			System.out.println("\nDo You Want To Continue ? ");
			r=sc.nextInt();
		}while(r == 1);
		
		
		//put print(arr); in any of the sorts to know mechanism
	}

}
