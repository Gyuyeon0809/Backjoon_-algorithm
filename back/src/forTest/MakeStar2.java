package forTest;

import java.util.Scanner;

public class MakeStar2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N-i ; j++) {
				System.out.print(" ");
				
			}
			for (int j2 = 1; j2 <= i; j2++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}
}
