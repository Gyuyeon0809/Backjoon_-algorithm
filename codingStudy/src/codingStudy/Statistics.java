package codingStudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Statistics {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// n���� �����Է�
		int n = sc.nextInt();
		//n���� ������ŭ �迭����
		int[] arr = new int[n];
		//for���� ���� arr[i]�� ���� �Է�
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		// ������
		// arr�迭�� ��� ���� ���� �� sum���� ���� 
		int sum = 0; 
//		for���� ���� sum�� arr�迭�� ��� ���� ����
		for (int i = 0; i < n; i++) {
			sum += arr[i]; 
		}
		// sum�� �Է¹��� ������ ���� ������ ��� ��� Math.round�� �̿��Ͽ� �Ҽ�ù°�ڸ� �ݿø�
		System.out.println(Math.round((double)sum/(double)n));
		// �߾Ӱ�
//		Arrays.sort()�� �̿��Ͽ� ������������ �迭�� ����
		Arrays.sort(arr);
//		������������ ������ arr�迭�� ��� ���� arr[n/2]�� ��� (�迭�� �ε����� 0���� �����̴ϱ� n�� 5��� �����Ѵٸ� ��� ���� 3�� �ƴ� 2�� �ȴ�)
		System.out.println(arr[n / 2]);
		// �ֺ�
//		���밪�� 4000�̱� ������ int[8001]�� ��������
		int[] index = new int[8001];
		int mode = 0;// �ֺ�
//		max�� �󵵼� ����
		int max = Integer.MIN_VALUE;
		int len = index.length;
//		list��� �̸��� ArrayList��ü ����
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			index[arr[i] + 4000]++; // count
		}
		for (int i = 0; i < len; i++) {
			if (max < index[i]) {
				// �󵵼��� max�� ����
				max = index[i];
				//mode�� �ֺ���� �־���
				mode = i;
			}
		}
		for (int i = 0; i < len; i++) {
//			for������ index�迭�� ���鼭 max(�󵵼�)�� ���ٸ� list�� ������Ʈ ���� �Ѱ� ��
			if (max == index[i]) {
//				list�� i-4000�̶�� ������Ʈ ���� �Ѱ���
				list.add(i - 4000);
			}
		}
//		.length(�迭�� ���̸� �˰� ���� ��)
//		size()(�÷���Ÿ���� ���̸� �˰� ������ )
//		���࿡ list�� size()�� 1�̶�� �ֺ��� �ߺ����� �ʴ� ���
		if (list.size() == 1) {
//		.get() ��û�� list�� �ε��� ���� ���� ��� (list�� 0�� �ε����� ������ ���)
			System.out.print(list.get(0) + "\n");
//		size()�� 1�� �ƴ� ��� �ֺ��� ���� ���� ���
		} else {
//		list�� ������������ ���� sort�� �̿�
			Collections.sort(list);
//		list�� �ε��� 1���� (2��°�� ū ��)�� �����͸� ���
			System.out.print(list.get(1) + "\n");
		}
		// ����
//		������ �̹� arr�� ������������ ������ �� arr[n-1]�� �ִ��̰� arr[0]�� �ּڰ���
//		max1�� �ִ��� �־���
		int max1 = arr[n-1];
//		mix1�� �ּڰ��� �־���
		int min1 = arr[0];
//		�� ���� ���� ���
		System.out.println(max1-min1);
		
//		���� : ��Կ�/Java/ �迭�� ���� �� �ȴٰ� ���������� ������ Ǯ�鼭 ���� �迭�� �����ϴ� �������� ���� �ظ޼� �𸣴°� ���ٴ� ���� ���ݰ� �Ǿ����ϴ�!	

		
	}

}
