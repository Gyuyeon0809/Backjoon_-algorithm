package oneDimensionalArray;

import java.util.Scanner;

public class AverageOver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int[]arr;
		int C = sc.nextInt();//테스트의 개수 C값 입력
		
		for (int i = 0; i < C; i++) {
			double sum = 0; //학생 성적 누적합계
			int N = sc.nextInt();//학생의 수 입력
			arr = new int[N];// 학생의 수만큼 배열 생성
			for (int j = 0; j < N; j++) {
				arr[j] = sc.nextInt();//N명의 점수 입력
				sum += arr[j];//학생들의 점수의 합계
			}
			double count = 0;
			double mean = (sum/N);//평균이 넘는 학생수
			for (int j = 0; j < N; j++) {
				if(arr[j]>mean) {
					count++;// 평균이 넘는 사람의 수세기
				}
			}
			System.out.printf("%.3f%%\n",(count/N)*100);
		}
	}

}
