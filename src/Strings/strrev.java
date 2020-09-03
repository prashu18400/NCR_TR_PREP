package Strings;

import java.util.*;

public class strrev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = new String(sc.next());
		sc.close();
		char[] d = s.toCharArray();
		int start = 0;
		int end = s.length() - 1;
		while(start<end) {
			d[start]^=d[end];
			d[end]^=d[start];
			d[start]^=d[end];
			start++;
			end--;
		}
		System.out.println(d);

	}

}
