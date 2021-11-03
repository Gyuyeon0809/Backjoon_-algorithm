package oneDimensionalArray;

import java.util.Scanner;

public class LessMax {
public static void main(String[] args) {

   Scanner sc = new Scanner(System.in);
int min = 1000000;
int max = -1000000;
          int n = sc.nextInt(); 
         int[] numbers = new int[n]; 

        for(int i=0; i<n; i++){ 
      numbers[i] = sc.nextInt();
       if(max<numbers[i]) {
        max = numbers[i];
    }    
     if(min>numbers[i]) {
      min = numbers[i];
    }        
  
   } //for문종료
System.out.println(min+" "+max);
 
   }//메인메소드종료
    
}//클래스종료
