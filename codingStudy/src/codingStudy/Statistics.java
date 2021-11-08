package codingStudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Statistics {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// n개의 정수입력
		int n = sc.nextInt();
		//n개의 정수만큼 배열생성
		int[] arr = new int[n];
		//for문을 돌며 arr[i]에 값을 입력
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		// 산술평균
		// arr배열에 담긴 값을 누적 할 sum변수 생성 
		int sum = 0; 
//		for문을 돌며 sum에 arr배열의 담긴 값을 누적
		for (int i = 0; i < n; i++) {
			sum += arr[i]; 
		}
		// sum과 입력받은 정수의 수를 나누어 평균 출력 Math.round를 이용하여 소수첫째자리 반올림
		System.out.println(Math.round((double)sum/(double)n));
		// 중앙값
//		Arrays.sort()를 이용하여 오름차순으로 배열을 정리
		Arrays.sort(arr);
//		오름차순으로 정리된 arr배열의 가운데 값인 arr[n/2]를 출력 (배열은 인덱스가 0부터 시작이니까 n이 5라고 가정한다면 가운데 값은 3이 아닌 2가 된다)
		System.out.println(arr[n / 2]);
		// 최빈값
//		절대값이 4000이기 때문에 int[8001]로 생성해줌
		int[] index = new int[8001];
		int mode = 0;// 최빈값
//		max에 빈도수 누적
		int max = Integer.MIN_VALUE;
		int len = index.length;
//		list라는 이름의 ArrayList객체 생성
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			index[arr[i] + 4000]++; // count
		}
		for (int i = 0; i < len; i++) {
			if (max < index[i]) {
				// 빈도수를 max에 누적
				max = index[i];
				//mode에 최빈수를 넣어줌
				mode = i;
			}
		}
		for (int i = 0; i < len; i++) {
//			for문으로 index배열을 돌면서 max(빈도수)가 같다면 list에 엘리먼트 값을 넘겨 줌
			if (max == index[i]) {
//				list에 i-4000이라는 엘리먼트 값을 넘겨줌
				list.add(i - 4000);
			}
		}
//		.length(배열의 길이를 알고 싶을 때)
//		size()(컬렉션타입의 길이를 알고 싶을때 )
//		만약에 list의 size()가 1이라면 최빈값이 중복되지 않는 경우
		if (list.size() == 1) {
//		.get() 요청한 list의 인덱스 안의 값을 출력 (list의 0번 인덱스의 데이터 출력)
			System.out.print(list.get(0) + "\n");
//		size()가 1이 아닌 경우 최빈값이 여러 개일 경우
		} else {
//		list를 오름차순으로 정렬 sort를 이용
			Collections.sort(list);
//		list의 인덱스 1번방 (2번째로 큰 수)의 데이터를 출력
			System.out.print(list.get(1) + "\n");
		}
		// 범위
//		위에서 이미 arr를 오름차순으로 정리함 즉 arr[n-1]은 최댓값이고 arr[0]은 최솟값임
//		max1에 최댓값을 넣어줌
		int max1 = arr[n-1];
//		mix1에 최솟값을 넣어줌
		int min1 = arr[0];
//		두 수의 차를 출력
		System.out.println(max1-min1);
		
//		리뷰 : 김규연/Java/ 배열에 대해 잘 안다고 생각했지만 문제를 풀면서 아직 배열을 정렬하는 과정에서 조금 해메서 모르는게 많다는 것을 깨닫게 되었습니다!	

		
	}

}
