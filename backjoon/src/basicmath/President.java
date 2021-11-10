package basicmath;

import java.util.Scanner;

public class President {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] room = new int[15][15];
		for (int i = 0; i < 15; i++) {
			room[i][1] = 1;
			room[0][i] = i;
			for (int j = 2; j < 15; j++) {
				room[0][j]=j;
			}
		}
		for (int i = 1; i < 15; i++) {
			for (int j = 2; j < 15; j++) {
				room[i][j] = room[i-1][j] + room[i][j-1];
			}
		}
		
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int k = sc.nextInt();
			int n = sc.nextInt();
			System.out.println(room[k][n]);
		}
	}
}
