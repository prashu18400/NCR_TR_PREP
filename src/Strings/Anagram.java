package Strings;

import java.util.Scanner;
public class Anagram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = new String();
		String s1 = new String();
		s = sc.nextLine();
		s1 = sc.nextLine();
		sc.close();
		boolean isAnagram = true;
		int al[] = new int[256];
		for(char c:s.toCharArray()) {
			int index = (int) c;
			al[index]++;
		}
		for(char c:s1.toCharArray()) {
			int index = (int) c;
			al[index]--;
		}
		for(int a:al) {
			if(a!=0) {
				isAnagram = false;
			}
		}
		s = isAnagram?"Anagram":"Not an Angram";
		System.out.println(s);
	}
}
