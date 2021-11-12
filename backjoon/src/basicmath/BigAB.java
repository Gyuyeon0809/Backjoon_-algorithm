package basicmath;

import java.util.Scanner;

public class BigAB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		int maxLen = Math.max(str1.length(),str2.length());
		int[] arr1 = new int[str1.length()+1];
		int[] arr2 = new int[str2.length()+1];
		int len = arr1.length;
		int len1 = arr2.length;
		
		for (int i = len-1, j = 0; i >= 0; i--,j++) {
			arr1[j] = str1.charAt(i)-'0';//�������� ��Ƽ� 0���濡 �� ���ڸ� ���ڰ� ���
		}
		for (int i = len1-1,j = 0; i >= 0; i--,j++) {
			arr1[j] = str2.charAt(i)-'0';//�������� ��Ƽ� 0���濡 �� ���ڸ� ���ڰ� ���
		}
		for (int i = maxLen; i > 0; i--) {
			int cheak = arr1[i]+arr2[i];
			 arr1[i] = cheak%10;
			 arr1[i+1] += (cheak/10);
			 
		}
		StringBuilder sb = new StringBuilder();
		if(arr1[maxLen] != 0) {
			sb.append(arr1[maxLen]);
		}
		for(int i = maxLen - 1; i >= 0; i--) {
			sb.append(arr1[i]);
		}
		
		System.out.println(sb);
	}

}
