package methodTest;

public class SelfNumMain {
	public static void main(String[] args) {
		boolean[] check = new boolean[10001];
		
		for (int i = 0; i < 10001; i++) {
			int n = d(i);
			
			if(n < 10001) {
				check[n] = true;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 1; i < 10001; i++) {
			if (!check[i]) {
				sb.append(i).append('\n');
			}
		}
		System.out.println(sb);
	}
	static int d(int n) {
		
		int m = n;
	while(0!= m) {
		int o = m%10;//1의 자리 수 
		m = m+o;
		n = m/10;
		
		
		}
	return m;
	}
}
