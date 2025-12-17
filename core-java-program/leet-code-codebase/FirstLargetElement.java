import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int arr[] = new int[n];

		int firstLargest = Integer.MIN_VALUE;

		for(int i=0;i<n;i++){
			firstLargest = Math.min(firstLargest,arr[i]);
		}

		System.out.println("First largest element of the array is : "+firstLargest);

	}

}

