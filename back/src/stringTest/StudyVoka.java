package stringTest;

import java.util.Scanner;

public class StudyVoka {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		int[] arr = new int[26];
		int len = A.length();
		int len1 = arr.length;
		for (int i = 0; i < len; i++) {
			char ch = A.charAt(i);
			if('A'<=ch&&ch<='Z') {
				arr[ch-'A']++;
				
			}else {
				arr[ch-'a']++;
			}
		}

		char result = ' ';
		int max = -1;
		for (int i = 0; i <len1 ; i++) {
			if(arr[i]>max) {
				max = arr[i];
				result = (char)(i+'A');
				
			}else if(arr[i]==max) {
				result = '?';
				
			}
		}
		System.out.println(result);
	}
}
