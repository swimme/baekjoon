package example;

import java.util.Scanner;

public class While1110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //
		sc.close();
		
		int a = N%10; //�����ڸ� 
		int b = N/10; //�����ڸ� 
		int num; //���ο� �� ; 0�� �Է����� �θ�ȵ�
		int cnt = 1; //����Ŭ 
		
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

//���ϱ� �� ���� ���� �ڸ�,���� �� ���� ���� �ڸ��� �̾� ���̴� ��������.