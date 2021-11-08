package stringTest;

import java.util.Scanner;

public class SumNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String num = sc.next();
		int sum = 0;
		for (int i = 0; i < N; i++) {
			char ch = num.charAt(i);
			sum += (ch-'0'); 
		}
		System.out.println(sum);
	}
}
