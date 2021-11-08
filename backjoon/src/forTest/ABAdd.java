package forTest;

import java.util.Scanner;

public class ABAdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for (int i = 1; i <= t; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			System.out.println(A+B);
		}
	}
}
