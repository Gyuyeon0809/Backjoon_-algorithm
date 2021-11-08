package forTest;

import java.util.Scanner;

public class GuguMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();		
		for (int j = 1; j <= 9; j++) {
			System.out.println(n+" * "+j+" = "+(j*n));
		}
				
		
	}
}
