package oneDimensionalArray;

import java.util.Scanner;

public class AverageOver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int[]arr;
		int C = sc.nextInt();//�׽�Ʈ�� ���� C�� �Է�
		
		for (int i = 0; i < C; i++) {
			double sum = 0; //�л� ���� �����հ�
			int N = sc.nextInt();//�л��� �� �Է�
			arr = new int[N];// �л��� ����ŭ �迭 ����
			for (int j = 0; j < N; j++) {
				arr[j] = sc.nextInt();//N���� ���� �Է�
				sum += arr[j];//�л����� ������ �հ�
			}
			double count = 0;
			double mean = (sum/N);//����� �Ѵ� �л���
			for (int j = 0; j < N; j++) {
				if(arr[j]>mean) {
					count++;// ����� �Ѵ� ����� ������
				}
			}
			System.out.printf("%.3f%%\n",(count/N)*100);
		}
	}

}
