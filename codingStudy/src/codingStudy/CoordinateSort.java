package codingStudy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class CoordinateSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		���� ���� �Է�
		int n = sc.nextInt();
//		���� ��ǥ�� �Է¹��� 2���� �迭
		int[][] xy = new int[n][2];
//		���� ��ǥ�� �Է¹��� �ݺ���	
		for (int i = 0; i < n; i++) {
			xy[i][0] = sc.nextInt();
			xy[i][1] = sc.nextInt();
			
		}
//		Arrays.sort�� �̿��Ͽ� ������������ ����
		Arrays.sort(xy, new Comparator<int[]>() {

			@Override
			//������ Comparator��� �������̽��� ����߱� ������ compare�� �������̵���
			public int compare(int[] o1, int[] o2) {
//		xy�迭�� ù��° �� xy[n][0],xy[n+1][0]�� ���� ���ٸ� ����		
				if (o1[0]==o2[0]) {
//		xy�迭�� �ι�° �� xy[n][0] xy[n][1]�� ���� ��(�� ���� ���� ����) �� ����� ��� �� ��ü�� ��ġ�� �ٲ�
					return o1[1]-o2[1];
				}else {
//		�ƴҰ�� ù��° �迭�� ���� �� �� ����� ��� �� ���� ��ġ�� �ٲ�
					return o1[0]-o2[0];
				}
			
			}
		});
		for (int i = 0; i < n; i++) {
			System.out.println(xy[i][0]+" "+xy[i][1]);
		}
// ��Կ�/Java/����: ���ٽ����� �ٲٸ� �� �� �����ϰ� �� �� ������ ������ ���ٽ��� �� �ٷ��� ���Ͽ��� �ƽ������ϴ�.
// 				���ٽ��� �����Ͽ� �� �� ª�� �ڵ��ϴ� ����� ������ ���� �� �� �����ϴ�!
	}
}
