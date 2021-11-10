package basicmath;

import java.util.Scanner;

public class SugerDelivery {
	/*
	 3kg 5kg	만약에 5로 나눈 나머지를 3으로 나눌 수 없다면 -1이 나옴
	 	그래서 주어지는 수와 5의 나머지가 3으로 나눌수 있을동안만 나눠야한다?..(나누기 말고 빼기하면 쌉가능?)
	 18/5 = 3	6/5 = 1
	 18%5 = 3	6%5 = 1
	 3/3 = 1	1/3 = 0
	 3%3 = 0	1%3 = 1
	 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = n;
		int count = 0;
//		반복을 얼마나 해야하는지 특정되지 않은 경우기에 while사용
		while (true) {
			result -= 5; //4가지 경우 3으로 나눠지는 경우 아닌경우 0인 경우 result가 -인 경우
			count++;

			if(result < 0) {
				System.out.println(-1);
				break;
			}else if (result%3 == 0) {//3으로 나눠지는 경우
				count += result/3;
				result = 0;
				System.out.println(count);

				break;
				
			}else if(result%3!=0) { //3으로 나누어떨어지지 않는 경우
				if (n%3==0 && (n%5)%3!=0) { //처음 입력받은 값이 3으로 나누어 떨어지는지 확인
					count = n/3;
					System.out.println(count);
					break;
				}
				
			}else if(result == 0) {
				System.out.println(count);
				break;
			}
				
		
		}
	}
}
