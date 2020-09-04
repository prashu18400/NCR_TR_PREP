package sorting;

import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) 
			arr[i] = sc.nextInt();
		sc.close();
		for(int i=0;i<n-1;i++) {
			int flag=0;
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					flag =1;
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
				if(flag == 0) {
					break;
				}
		}
		for(int e:arr)
			System.out.print(e+" ");
	}

}
