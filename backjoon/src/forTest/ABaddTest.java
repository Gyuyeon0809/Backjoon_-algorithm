package forTest;

import java.util.Scanner;

public class ABaddTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int T = t;
		for (int i = 1; i <= T; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			System.out.println("Case #"+i+": "+A+" + "+B+" = "+(A+B));
		}
	}

}
