package example;
import java.util.Scanner;
import java.util.Arrays;

//2562. 최대값이 어디잇는지 찾는 문제
public class Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
//		int numbers[] = new int[3];
//		
//		for(int i=0;i<3;i++) {
//			int num = sc.nextInt();
//			numbers[i] = num;
//		}
//		
//		Arrays.sort(numbers);
//		
//		System.out.println(numbers[2]);
//		System.out.println();
		
		int[] arNum = new int[9];
	    int max=0, n=0;

	      for (int i = 0; i < 9; i++) {
	         
	         arNum[i] = sc.nextInt();
	         
	         if (i==0) {
	            max = arNum[0];
	         }else {
	         
	         if (max<arNum[i]) {
	            max = arNum[i];
	            n = i+1;
	         }
	      }
	   }
	}
}
