package sorting;

import java.util.*;

public class Linear_Search {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int f = 0;
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		int target = sc.nextInt();
		sc.close();
		for(int e:arr) {
			if(e == target) {
				f = 1;
				break;
			}
		}
		String s = f == 0?"Element is not present in array":"Element is present in array";
		System.out.println(s);
	}
}
