package oneDimensionalArray;

import java.util.Scanner;

public class Max {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int max = 0;
			int location = 0;
			int[]arr = {
					sc.nextInt(),sc.nextInt(),sc.nextInt(),
					sc.nextInt(),sc.nextInt(),sc.nextInt(),
					sc.nextInt(),sc.nextInt(),sc.nextInt()
			};
			int len = arr.length;
			for (int i = 0; i < len; i++) {
				if(arr[i]>max) {
					max = arr[i];
					location = i+1;
				}
			}
			System.out.println(max+"\n"+location);
		
		
	}
}
