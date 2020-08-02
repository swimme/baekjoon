package example;

import java.util.Scanner;

public class While1110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //
		sc.close();
		
		int a = N%10; //일의자리 
		int b = N/10; //십의자리 
		int num; //새로운 수 ; 0을 입력으로 두면안됨
		int cnt = 1; //사이클 
		
		while(true) { 
			int unit = (a + b)%10; 
			num = a*10 + unit; 
			a = num%10; 
			b = num/10; 
			if(N==num)break; else cnt++;
			
		}
		
		System.out.println(cnt);


	}

}

//더하기 전 수의 일의 자리,더한 후 수의 일의 자리를 이어 붙이는 연산이죠.