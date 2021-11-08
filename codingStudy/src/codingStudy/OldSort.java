package codingStudy;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class OldSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 정수 N값을 입력받음
		Person[] ps = new Person[N]; // 입력받은 정수만큼의 Person클래스의 배열을 만들어줌
		for (int i = 0; i < N; i++) {// 처음 입력받은 정수만큼 반복
			ps[i] = new Person(sc.nextInt(), sc.next());// ps[i]번에 Person객체 생성 후 Scanner로 매개변수를 입력받고 넣어 줌
		}
//	하나의 객체에 두 가지 이상의 변수가 있는 경우이고 나이를 기준으로 정렬하기 때문에 Java에서 제공하는 Comparable과 Comparator 인터페이스를 이용
		Arrays.sort(ps, new Comparator<Person>() {
			// 나이순으로 정렬
			@Override
			public int compare(Person o1, Person o2) { // 양수,0,음수중 하나를 반환하며 양수일 경우 두 객체의 위치를 바꿔줌
				return o1.age - o2.age; //s1의 나이와 s2의 나이를 연산 후 그 결과를 반환 o1의 나이가 많으면 객체의 위치 변경
//				compare메소드는 앞서 말한거와 같이 양수,0,음수가 리턴되고 양수일 경우에만 두 객체의 위치를 바꿔주기 때문에
//				만약에 두 사람의 나이가 같다면 0이 리턴 될 것이고 두 객체의 자리는 변하지 않으니 자연스럽게 가입 순으로 정렬된다.
			}

		});

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < N; i++) {
			// 객체배열의 객체를 출력하면 해당 인덱스의 객체의 toString() 이 출력 됨
			sb.append(ps[i]); //StringBuilder로 생성한 객체인 sb에 .append로 ps[i]의 값을 넣어준다.
		}

		System.out.println(sb);

	}

	public static class Person {
		int age; // 전역변수 age선언
		String name; // 전역변수 name선언

		public Person(int age, String name) {
			this.age = age; // 전역변수 age에 매개변수로 받아온 age값
			this.name = name; // 전역변수 name에 매개변수로 받아온 name값
		}

		@Override
		public String toString() { // toString을 override(재정의)
//인스턴스의 값을 출력할 때 그냥 인스턴스를 넣거나 기본 toString()메소드를 사용하면 해시값을 포함한 이상한 값이 출력

			return age + " " + name + "\n";
		}

	}
//	리뷰 : 김규연/Java/ 	처음에는 for문과 if문을 사용하여 비교 후 int타입의 변수를 선언하여 큰 값을 대입시키려 했으나 코드가 길어져서 Array.sort를 사용하여 정렬하였습니다!
//					 	배열에 대해 잘 안다고 생각했지만 문제를 풀면서 아직 배열을 정렬하는 과정에서 조금 해메서 모르는게 많다는 것을 깨닫게 되었습니다!

}