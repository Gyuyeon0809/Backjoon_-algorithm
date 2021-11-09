package basicmath;

import java.util.Scanner;

public class ACMHotel {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			int n = sc.nextInt();
//			int height = 0;
//			int room = (n/h);
			if(n%h==0) {
//				height = h*100;
				System.out.println((h * 100) + (n / h));
			}else {
//				height = (n%h)*100;
//				room += 1;
				System.out.println(((n % h) * 100) + ((n / h) + 1));
			}
			
//			System.out.print(room+height);
			
		}
		
	}
}

