package whileTest;

import java.util.Scanner;

public class SumCycle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = N;//�Է¹��� N���� ���
		
		int count = 0; //while���� �ݺ� Ƚ�� ����
		while(true) {
			int O = N%10;//N�� 1�� �ڸ���
			int T = N/10;//N�� 10�� �ڸ���
			N = (O*10)+((T+O)%10);
			count++;
			if(N == M) {
				break;
			}
		}
			
		System.out.println(count);
		
	}
}
