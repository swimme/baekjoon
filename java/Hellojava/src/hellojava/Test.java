package hellojava;

import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		
		//배열
		int[] num = new int[2];
		
		Scanner sc = new Scanner(System.in); 
		//2개 입력받기
		for (int i=0;i<2;i++) {
			num[i] = sc.nextInt();
		}
		
		int a = num[1]%10; //5 일의자리
		int b = (num[1]/10)%10; //8 십의자리
		int c= (num[1]/100); //3 백의자리
				
		int first = (a * num[0]);
		int second = (b * num[0]);
		int third = (c * num[0]);
		int last = num[0]*num[1];
		
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
		System.out.println(last);
		
        sc.close();

	}

}
