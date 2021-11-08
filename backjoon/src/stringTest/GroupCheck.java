package stringTest;

import java.util.Scanner;

public class GroupCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		그룹단어의 개수를 세는 변수 count생성
		int count = 0;
//		입력받을 단어의 수를 입력
		int N = sc.nextInt();
//		for문을 돌면서 cheak메소드에서 리턴받은 값이 true값이면 count에 +1누적
		for (int i = 0; i < N; i++) {
//		단어를 입력받음
			String str = sc.next();
			if(cheak(str)==true) {
				count++;
			}
		}
//		count값을 출력
		System.out.println(count);
		
		
		

	}
	// 객체의 필드를 사용하지 않는 경우 넘겨받은 값들 만을 사용하는 경우에는 static변수를 써도 무방함
	//(만약에 값을 공유해도 상관없는 경우에 static변수를 사용하지 않는다면 객체를 생성해야 함 코드가 길어짐)
	public static boolean cheak(String str) {
		Scanner sc = new Scanner(System.in);
//		초기값이 false인 boolean의 배열을 생성하여
		boolean[] al = new boolean[26];
//		str의 길이를 len이라는 정수형 변수에 담아줌 
//		만약에 for문의 조건부영역을 str.length()로 코딩을 한다면 
//		for문이 반복하면서 계속 str의 길이를 구하기 때문에 속도부분에서 효율이 떨어짐 
		int len = str.length();
//		그룹단어확인을 위해 prev이라는 정수형 변수를 생성하여 전에 나온 알파벳인지 판별
		int prev = 0;
		for (int i = 0; i < len; i++) {
//		for문을 돌면서 입력받은 단어의 i번째 인덱스값을 아스키코드로 바꾸어 now라는 변수에 담는다(a라고 가정하면 97이 담김)
			int now = str.charAt(i);
//		만약에 전에 입력받은 값이 현재의 값과 다르다면 실행(그 전에 입력받은 값 중 중복되는 단어가 있다면 그룹단어x, 없다면 그룹단어o)
			if(prev != now) {
//	 	al이라는 배열의 now-'a'의 인덱스 값(now에 a의 아스키코드인 97이 담겨 있다면 97-97 즉 al의 0번 인덱스의 값)
//		boolean타입의 배열의 초기값은 false임으로 만약에 이전에 나왔던 알파벳이아니라면 false값이 담겨있음
//		false라면 해당 인덱스에 true를 넣어줘서 이미 나온 알파벳임을 기억시킴
				if (al[now-'a']==false) {
					al[now-'a'] = true;
//		prev라는 변수에 현재 검사중인 알파벳의 아스키코드를 넘겨줘서 다음 검사 때 이용
					prev = now;
//		만약에 true값이라면 이미 한 번 나온적 있는 알파벳이기 때문에 false를 리턴해준다
				}else {
					return false;
				}
//		만약에 prev과 now의 값이 같다면 중복되기 때문에 위 과정을 건너뛰고 다음 인덱스의 알파벳을 검사함
//				else는 생략가능
			}else {
				continue;
			}
		}
//		위에서 false가 한 번도 안 나왔다면 그룹단어이기 때문에 true를 리턴한다.
		return true;
	}
}
