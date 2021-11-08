package oneDimensionalArray;

import java.util.Scanner;

public class NumNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numData = (sc.nextInt() * sc.nextInt() *sc.nextInt());
		String str = numData+"";
		int len = str.length();
		for (int i = 0; i < 10; i++) {
			int count = 0;
			for (int j = 0; j < len; j++) {
				if((str.charAt(j)-'0')==i) {
					count++;
				}
			}
			
			System.out.println(count);
		}
		
	}
}
