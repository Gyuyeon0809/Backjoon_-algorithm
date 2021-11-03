package stringTest;

import java.util.Scanner;

public class FinalNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		String a = "";
		String b = "";
		for (int i = 0; i < 3; i++) {
			char ch = A.charAt(i);
			char ch1 = B.charAt(i);
			a = ch+a;
			b = ch1+b;
		}
		if(Integer.parseInt(a) < Integer.parseInt(b)) {
			System.out.println(b);
		}else {
			System.out.println(a);
			
		}
		
		
	}
	
}
