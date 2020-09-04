import java.util.HashMap;
import java.util.Scanner;

public class Snr_code {
	private static int fib(int n) {
		if(n==0) {
			return 0;
		}
		else if(n==1) {
			return 1;
		}
		else {
			return fib(n-1) + fib(n-2);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1  = new String();
		s1 = sc.next();
		int i=0;
		sc.close();
		HashMap<Character,Integer> s = new HashMap<Character,Integer>();
		s.put('a',0);
		s.put('e',1);
		s.put('i',2);
		s.put('o',3);
		s.put('u',4);
		char arr[] = {'a','e','i','o','u'};
		String s2 = s1.toLowerCase();
		String s3 = "";
		for(Character p:s2.toCharArray()) {
			if(p=='a' || p=='e' || p=='i' || p=='o' || p=='u') {
				int index = s.get(p) + fib(i+1);
				index = index%5;
				s3 += arr[index];
				i+=1;
			}
		else
			s3 += p;
		}
		System.out.println(s3);
	}
}
