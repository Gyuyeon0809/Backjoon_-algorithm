package oneDimensionalArray;

import java.util.Scanner;

public class Score {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int �ʱ�ȭ��
		 double M = 0;
		double result = 0;
		double operate = 0;
		int num = sc.nextInt();
		double[] arr = new double[num];
//		�迭�� int��(����)�� ������� for��
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextDouble();
			if (M<arr[i]) {
				M = arr[i];
			}
			
		}
//		�迭�� ��� ������ ������ �����ϴ� for��
		for (int i = 0; i < num; i++) {
			operate = ((arr[i]/M)*100); 
//			System.out.println(operate);
			result += operate;
			
		}
//		System.out.println(result);
		System.out.println(result/num);
	}
}
