package stringTest;

import java.util.Scanner;

public class GroupCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		�׷�ܾ��� ������ ���� ���� count����
		int count = 0;
//		�Է¹��� �ܾ��� ���� �Է�
		int N = sc.nextInt();
//		for���� ���鼭 cheak�޼ҵ忡�� ���Ϲ��� ���� true���̸� count�� +1����
		for (int i = 0; i < N; i++) {
//		�ܾ �Է¹���
			String str = sc.next();
			if(cheak(str)==true) {
				count++;
			}
		}
//		count���� ���
		System.out.println(count);
		
		
		

	}
	// ��ü�� �ʵ带 ������� �ʴ� ��� �Ѱܹ��� ���� ���� ����ϴ� ��쿡�� static������ �ᵵ ������
	//(���࿡ ���� �����ص� ������� ��쿡 static������ ������� �ʴ´ٸ� ��ü�� �����ؾ� �� �ڵ尡 �����)
	public static boolean cheak(String str) {
		Scanner sc = new Scanner(System.in);
//		�ʱⰪ�� false�� boolean�� �迭�� �����Ͽ�
		boolean[] al = new boolean[26];
//		str�� ���̸� len�̶�� ������ ������ ����� 
//		���࿡ for���� ���Ǻο����� str.length()�� �ڵ��� �Ѵٸ� 
//		for���� �ݺ��ϸ鼭 ��� str�� ���̸� ���ϱ� ������ �ӵ��κп��� ȿ���� ������ 
		int len = str.length();
//		�׷�ܾ�Ȯ���� ���� prev�̶�� ������ ������ �����Ͽ� ���� ���� ���ĺ����� �Ǻ�
		int prev = 0;
		for (int i = 0; i < len; i++) {
//		for���� ���鼭 �Է¹��� �ܾ��� i��° �ε������� �ƽ�Ű�ڵ�� �ٲپ� now��� ������ ��´�(a��� �����ϸ� 97�� ���)
			int now = str.charAt(i);
//		���࿡ ���� �Է¹��� ���� ������ ���� �ٸ��ٸ� ����(�� ���� �Է¹��� �� �� �ߺ��Ǵ� �ܾ �ִٸ� �׷�ܾ�x, ���ٸ� �׷�ܾ�o)
			if(prev != now) {
//	 	al�̶�� �迭�� now-'a'�� �ε��� ��(now�� a�� �ƽ�Ű�ڵ��� 97�� ��� �ִٸ� 97-97 �� al�� 0�� �ε����� ��)
//		booleanŸ���� �迭�� �ʱⰪ�� false������ ���࿡ ������ ���Դ� ���ĺ��̾ƴ϶�� false���� �������
//		false��� �ش� �ε����� true�� �־��༭ �̹� ���� ���ĺ����� ����Ŵ
				if (al[now-'a']==false) {
					al[now-'a'] = true;
//		prev��� ������ ���� �˻����� ���ĺ��� �ƽ�Ű�ڵ带 �Ѱ��༭ ���� �˻� �� �̿�
					prev = now;
//		���࿡ true���̶�� �̹� �� �� ������ �ִ� ���ĺ��̱� ������ false�� �������ش�
				}else {
					return false;
				}
//		���࿡ prev�� now�� ���� ���ٸ� �ߺ��Ǳ� ������ �� ������ �ǳʶٰ� ���� �ε����� ���ĺ��� �˻���
//				else�� ��������
			}else {
				continue;
			}
		}
//		������ false�� �� ���� �� ���Դٸ� �׷�ܾ��̱� ������ true�� �����Ѵ�.
		return true;
	}
}
