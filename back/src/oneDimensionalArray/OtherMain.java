package oneDimensionalArray;

import java.util.HashSet;
import java.util.Scanner;

public class OtherMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> h = new HashSet<Integer>();
		for (int i = 0; i < 10; i++) {
			h.add(sc.nextInt()%42);
			
		}
		System.out.println(h.size());
	}
}