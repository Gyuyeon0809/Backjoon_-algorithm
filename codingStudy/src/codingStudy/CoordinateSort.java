package codingStudy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class CoordinateSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		점의 개수 입력
		int n = sc.nextInt();
//		점의 좌표를 입력받을 2차원 배열
		int[][] xy = new int[n][2];
//		점의 좌표를 입력받을 반복문	
		for (int i = 0; i < n; i++) {
			xy[i][0] = sc.nextInt();
			xy[i][1] = sc.nextInt();
			
		}
//		Arrays.sort를 이용하여 오름차순으로 정렬
		Arrays.sort(xy, new Comparator<int[]>() {

			@Override
			//위에서 Comparator라는 인터페이스를 사용했기 때문에 compare을 오버라이드함
			public int compare(int[] o1, int[] o2) {
//		xy배열의 첫번째 즉 xy[n][0],xy[n+1][0]의 값이 같다면 실행		
				if (o1[0]==o2[0]) {
//		xy배열의 두번째 즉 xy[n][0] xy[n][1]의 값을 비교(두 수의 차를 구함) 후 양수일 경우 두 객체의 위치를 바꿈
					return o1[1]-o2[1];
				}else {
//		아닐경우 첫번째 배열의 값을 비교 후 양수일 경우 두 수의 위치를 바꿈
					return o1[0]-o2[0];
				}
			
			}
		});
		for (int i = 0; i < n; i++) {
			System.out.println(xy[i][0]+" "+xy[i][1]);
		}
// 김규연/Java/리뷰: 람다식으로 바꾸면 좀 더 간단하게 할 수 있지만 아직은 람다식을 잘 다루지 못하여서 아쉬웠습니다.
// 				람다식을 공부하여 좀 더 짧게 코딩하는 방법도 생각해 봐야 할 것 같습니다!
	}
}
