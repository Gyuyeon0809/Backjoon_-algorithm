package codingStudy;


import java.util.Scanner;
/*
*입력*
1번 줄 도시의 수
2번 줄 도시 간의 거리(km) n-1개가 주어짐
3번 줄 각 도시의 기름 값
*방법*
각 도시별의 기름 값을 내림차순으로 바꿔준다면 쉽게 해결가능
거리와 기름값이 각각 밑에 수로 주어졌다고 가정한다면
3451
59241
--------------------------------------------
내림차순이 아닌 숫자를 바로 전에나온 내림차순인 숫자로 바꿔주고 
거리와 기름값 곱의 총합을 구하면 된다.
59241 -> 55221
(5*3)+(5*4)+(2*5)+(5*1)
*/

public class GasStation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		도시의 수 입력
		int n = sc.nextInt();
//		도시 간의 거리를 입력받을 int형 배열생성(도시 간의 거리기 때문에 n-1만큼의 배열을 만듬)
		int[] distance = new int[n-1];
//		각 도시의 기름값을 입력받을 int형 배열생성
		int[] oilCost = new int[n];
//		도시 간의 거리를 입력받기 위한 반복문
		for (int i = 0; i < n-1; i++) {
			distance[i] = sc.nextInt();	
		}
//		도시의 기름값을 입력받기 위한 반복문
		for (int i = 0; i < n; i++) {
			oilCost[i] = sc.nextInt();
		}
//		내림차순 정리를 위해 초기 값을 첫 도시의 기름값으로 하는 int형 변수생성  
		int min = oilCost[0];
//	 	기름값과 거리를 누적하는 int형 변수를 생성
		int result = 0;
//		최저 비용을 계산하는 반복문(마지막 도시의 기름값은 무시 가능하기에 n-1 번 반복)
		for (int i = 0; i < n-1; i++) {
//			i번째 기름 값이 min에 있는 기름값보다 싸다면 실행
			if(oilCost[i]<min) {
//			min에 i번째의 기름값을 넣어줌(다음 내림차순 정리를 위해)
//			만약에 55446이고 현재 i값이 2라면 4를 넣어서 
//			다음값이 내림차순인지 검사
				min = oilCost[i];
//			min값이 i번째 기름값보다 싸다면 실행
			}else if(min<oilCost[i]) {
//			기름값에 전에 나온 내림차순 수인 min을 oilCost의 i번째에 넣어준다.
				oilCost[i] = min;
			}
//			검사가 끝났다면 기름값과 거리를 곱하여 result에 누적시킨다
			result += (oilCost[i]*distance[i]);
			
		}
		System.out.println(result);
	
	}
//	김규연/Java/리뷰: 각 도시별 기름값을 내림차순으로 바꾸는 방법을 사용하였고, 
//  방법을 생각하지 않고 무작정으로 코드를 먼저 입력해서 해맸습니다. 다음에는 알고리즘을 먼저 생각하고 코드를 짜야 될 거 같습니다!
	
	
}










