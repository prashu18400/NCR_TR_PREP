package sorting;

import java.util.*;
//Note : An array must be sorted if we want to search the elements using Binary search
public class BinarySearch {
	private static String bs(int[] arr,int min,int max,int target) {
		while(min<=max) {
			int mid = (min + max)/2;
			if(arr[mid]>target)
				max = mid-1;
			else if(arr[mid]<target)
				min = mid+1;
			else 
				return "Element is preset in the Array";	
		}
		return "Element is not present in the Array";

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		int target = sc.nextInt();
		sc.close();
		Arrays.sort(arr);;
		System.out.println(bs(arr,0,n-1,target));
		
	}

}
