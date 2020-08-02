package example;
//2920 음계 

import java.util.Scanner;
public class ArrayDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
//		int a = 0; int d =0 ; 
		String output = "";
	
		// sol2. 단 한번이라도 mixed일경우 break중요!        
		for (int i=0;i<8;i++) { 
			int n = sc.nextInt(); 
			if ( n == i+1 ) {  // 4==3+1 ascending으로 바꼈다가 다시 descending되므로 틀림 sol1으로 풀자~
//				a += 1;
				output = "ascending";
			} else if ( n == 8-i ) { //안되는 경우   8=8-0/7=8-1/6=8-2/4=8-4/5=8-3/3=8-5/2 1 
//				d += 1;
				output = "descending";
			} else {
				output ="mixed";
				break;
			}
		}
		System.out.println(output);

		// sol1. int지표활용
//		if (a==8) {
//			System.out.println("ascending");
//		} else if (d==8) {
//			System.out.println("descending"); 
//		} else {
//			System.out.println("mixed"); 
//		}
		
		
		sc.close();
	}
}
