package basicmath;

import java.util.Scanner;

public class SnailWantUp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();//������ �ö󰡴� �Ÿ�
		int b = sc.nextInt();//�ڴµ��� �̲������� �Ÿ�
		int v = sc.nextInt(); //������ ����
		int count = 0;// �ɸ��� �� ��
		int up = a-b;
		int result = 0;

		while (true) {
			if (result<v) {
				if(result+a>v) {
					if(count==1) {
						count++;
					}
					break;
				}else {
					count++;
					result += up;
					
				}
			}else {
				count++;
				break;
			}
			
		}
		System.out.println(count);
	}
}
