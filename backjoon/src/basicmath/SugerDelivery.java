package basicmath;

import java.util.Scanner;

public class SugerDelivery {
	/*
	 3kg 5kg	���࿡ 5�� ���� �������� 3���� ���� �� ���ٸ� -1�� ����
	 	�׷��� �־����� ���� 5�� �������� 3���� ������ �������ȸ� �������Ѵ�?..(������ ���� �����ϸ� �԰���?)
	 18/5 = 3	6/5 = 1
	 18%5 = 3	6%5 = 1
	 3/3 = 1	1/3 = 0
	 3%3 = 0	1%3 = 1
	 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = n;
		int count = 0;
//		�ݺ��� �󸶳� �ؾ��ϴ��� Ư������ ���� ���⿡ while���
		while (true) {
			result -= 5; //4���� ��� 3���� �������� ��� �ƴѰ�� 0�� ��� result�� -�� ���
			count++;

			if(result < 0) {
				System.out.println(-1);
				break;
			}else if (result%3 == 0) {//3���� �������� ���
				count += result/3;
				result = 0;
				System.out.println(count);

				break;
				
			}else if(result%3!=0) { //3���� ����������� �ʴ� ���
				if (n%3==0 && (n%5)%3!=0) { //ó�� �Է¹��� ���� 3���� ������ ���������� Ȯ��
					count = n/3;
					System.out.println(count);
					break;
				}
				
			}else if(result == 0) {
				System.out.println(count);
				break;
			}
				
		
		}
	}
}
