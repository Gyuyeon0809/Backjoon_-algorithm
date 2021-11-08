package oneDimensionalArray;

import java.util.Scanner;

public class OXQuiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String[] arrOX = new String[num];
		for (int i = 0; i < num; i++) {
			arrOX[i] = sc.next();
		}
		
		for (int i = 0; i < num; i++) {
			int len = arrOX[i].length();
			int cnt = 0;
			int sum = 0;
			for (int j = 0; j < len; j++) {
				char ch = arrOX[i].charAt(j);
				if(ch == 'O') {
					cnt++;
				}else {
					cnt=0;
				}
				sum += cnt;
			}
			System.out.println(sum);
		}
	}
}
