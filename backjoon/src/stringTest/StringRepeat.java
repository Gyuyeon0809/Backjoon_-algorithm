package stringTest;

import java.util.Scanner;

public class StringRepeat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		String[] a = new String[T];
		for (int i = 0; i < T; i++) {
			String result = "";
			int R = sc.nextInt();
			String S = sc.nextLine();
			int len = S.length();
			for (int j = 0; j < len; j++) {
				char ch = S.charAt(j);				
				for (int j1 = 0; j1 < R; j1++) {
					if (ch != ' ') {
						
						result += ch;
					}
				}
				
			}
			a[i] = result;
						
		}
		for(String fin : a) {
			System.out.println(fin);
		}
		
	}
}
