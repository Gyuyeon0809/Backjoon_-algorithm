package stringTest;

import java.util.Scanner;

public class VokaFind {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[]arr = new int[26];
		for (int i = 0; i < 26; i++) {
			arr[i] = -1;//알파벳의 초기값을 설정 
		}
		String s = sc.nextLine();
		int len = s.length();//문자열 s의 길이
		for (int i = 0; i < len; i++) {
			char ch = s.charAt(i);
			if(arr[ch -'a'] == -1) {
				arr[ch - 'a'] = i;
			}
		}
		for(int a : arr) {
			System.out.print(a+" ");
		}
		
	}
}
