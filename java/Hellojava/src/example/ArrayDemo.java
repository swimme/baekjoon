package example;
//2920 ���� 

import java.util.Scanner;
public class ArrayDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
//		int a = 0; int d =0 ; 
		String output = "";
	
		// sol2. �� �ѹ��̶� mixed�ϰ�� break�߿�!        
		for (int i=0;i<8;i++) { 
			int n = sc.nextInt(); 
			if ( n == i+1 ) {  // 4==3+1 ascending���� �ٲ��ٰ� �ٽ� descending�ǹǷ� Ʋ�� sol1���� Ǯ��~
//				a += 1;
				output = "ascending";
			} else if ( n == 8-i ) { //�ȵǴ� ���   8=8-0/7=8-1/6=8-2/4=8-4/5=8-3/3=8-5/2 1 
//				d += 1;
				output = "descending";
			} else {
				output ="mixed";
				break;
			}
		}
		System.out.println(output);

		// sol1. int��ǥȰ��
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
