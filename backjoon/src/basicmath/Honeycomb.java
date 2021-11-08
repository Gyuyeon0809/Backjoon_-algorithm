package basicmath;

import java.util.Scanner;

public class Honeycomb {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 1;
		int range = 2;
		 if(n==1) {
			 System.out.println(count);
		 }else {
			 while (range <= n) {
				range = range+(6*count);
				count++;
			}
			 System.out.println(count);
		 }
		
		
	}
}
