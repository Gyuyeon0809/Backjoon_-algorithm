package basicmath;

import java.util.Scanner;

public class Fraction {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		Fraction fr = new Fraction();
		fr.fraction(x);
	}
	void fraction(int x) {
		int cross = 1;
		int prev_count = 0;
		while (true) {
			if (x <= cross+prev_count) {
				if(cross % 2 == 1) {//대각선의 수가 홀수라면
					 System.out.print((cross - (x -prev_count-1))+"/"+(x-prev_count));
					 break;
				}else {
					System.out.print((x-prev_count)+"/"+(cross-(x-prev_count)));
					break;
				}
			}else {
				prev_count += cross;
				cross++;
			}
		}
		
	}
	
}
