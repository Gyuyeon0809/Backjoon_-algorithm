package whileTest;

import java.util.Scanner;

public class SumCycle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = N;//입력받은 N값을 기억
		
		int count = 0; //while문의 반복 횟수 누적
		while(true) {
			int O = N%10;//N의 1의 자리수
			int T = N/10;//N의 10의 자리수
			N = (O*10)+((T+O)%10);
			count++;
			if(N == M) {
				break;
			}
		}
			
		System.out.println(count);
		
	}
}
