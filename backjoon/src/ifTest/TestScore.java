package ifTest;

import java.util.Scanner;

public class TestScore {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		if(score>=90||score==100) {
			System.out.println("A");
		}else if(score>=80&&score<90) {
			System.out.println("B");
		}else if(score>=70&&score<80) {
			System.out.println("C");
		}else if(score>=60&&score<70) {
			System.out.println("D");
		}else if(score<60&&score>0) {
			System.out.println("F");
		}else {
			System.out.println("잘못 된 점수를 입력하였습니다.");
		}
	}
}
