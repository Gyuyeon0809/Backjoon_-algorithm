package stringTest;

import java.util.Scanner;
//3
public class CroatiaVoka {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		int count = 0;
		int len = n.length();
		for (int i = 0; i < len; i++) {
			char ch = n.charAt(i);
			if(ch == 'c') {
				if(n.charAt(i+1)=='=') {
					count++;
				
				}else if(n.charAt(i+1) == '-') {
					
					count++;
				}
			
			}
		}
		System.out.println(count);
	}
}
