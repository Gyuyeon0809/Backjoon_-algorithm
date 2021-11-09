package basicmath;

import java.util.Scanner;

public class SnailWantUp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();//낮동안 올라가는 거리
		int b = sc.nextInt();//자는동안 미끄러지는 거리
		int v = sc.nextInt(); //나무의 높이
		int count = 0;// 걸리는 날 수
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
