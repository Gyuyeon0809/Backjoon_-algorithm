package methodTest;

import java.util.Scanner;

public class OneNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int cnt = 99;
		int cnt1 = 0;
		if (n<100) {
			for (int i = 0; i < n; i++) {
				cnt1++;
			}
			System.out.println(cnt1);
		}else {
			if(n>99) {
				if (n==1000) {
					n = 999;
				}
				for (int i = 100; i <= n; i++) {
					int hun = i/100;
					int ten = (i%100)/10;
					int one = (i%100)%10;
					if ((hun-ten)==(ten-one)) {
						cnt++;
					}
				}
				System.out.println(cnt);
			}
		}
		

	}
}
