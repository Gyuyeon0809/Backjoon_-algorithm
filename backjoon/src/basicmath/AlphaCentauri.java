package basicmath;

import java.util.Scanner;

public class AlphaCentauri {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] x = new int[t];
		int[] y = new int[t];
		int planetLen;
		for (int i = 0; i < t; i++) {
			
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		for (int i = 0; i < t; i++) {
			System.out.println("½ÃÀÛ");
			int canLen = 1;
			int count = 0;
			planetLen = y[i] - x[i];
			System.out.println(canLen);
			System.out.println(planetLen);
			while (true) {
				if (canLen < planetLen) {
					planetLen -= canLen;
					canLen++;
					count++;
				} else if (canLen == planetLen) {
					count += 2;
					break;
				}
			}
			System.out.println(count);

		}
	}
}
