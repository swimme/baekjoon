package example;

import java.util.Scanner;
public class MultipleLineScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int T = sc.nextInt();
		
//		String A="";
//		String B="";
		int result[] = new int[T];
		
		for (int i=0;i<T;i++) {  //한줄마다
			int A = sc.nextInt();
			int B = sc.nextInt();	
			result[i] = A+B;	
			//System.out.println(A+B);
		}
		
		for (int i=0;i<T;i++) { 
			System.out.println(result[i]);
		}
		sc.close();
	}
}

//기존풀이는 한번에 모든 case입력을 한후에 sum을 한번에 받는거고
//수정풀이는 각case입력마다 sum을 받는 것
  // A와 B에 대해 nextInt()가 공백을 기준으로도 인식함!!!!!!!