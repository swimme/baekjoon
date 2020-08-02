package example;
import java.util.Scanner;

//[별찍기]
public class ForA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int N = sc.nextInt();
		
		//다른 풀이 - for중첩문: i번째줄에 i개별!
		for(int i=0; i<N; i++) { 
			for(int j=0; j<=i; j++) { // j<=i해야됨!!
				System.out.print("*"); //한줄당
			} System.out.println();   //엔터  
			//print와 println 차이!!
		}
			
//		//내풀이 - 배열에 하나씩 넣고  / 한줄당 프린트
//		String result[] = new String[N];
//		String star = "";
//		
//		for (int i=0; i<N; i++) {	
//			star += "*";
//			result[i] = star;
//			System.out.println(result[i]);
//		}
//		
//		sc.close();
	}

}
