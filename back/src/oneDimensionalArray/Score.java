package oneDimensionalArray;

import java.util.Scanner;

public class Score {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int 초기화값
		 double M = 0;
		double result = 0;
		double operate = 0;
		int num = sc.nextInt();
		double[] arr = new double[num];
//		배열에 int값(점수)를 담기위한 for문
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextDouble();
			if (M<arr[i]) {
				M = arr[i];
			}
			
		}
//		배열에 담긴 점수를 가지고 연산하는 for문
		for (int i = 0; i < num; i++) {
			operate = ((arr[i]/M)*100); 
//			System.out.println(operate);
			result += operate;
			
		}
//		System.out.println(result);
		System.out.println(result/num);
	}
}
