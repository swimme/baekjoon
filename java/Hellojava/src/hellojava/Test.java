package hellojava;

import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		
		//�迭
		int[] num = new int[2];
		
		Scanner sc = new Scanner(System.in); 
		//2�� �Է¹ޱ�
		for (int i=0;i<2;i++) {
			num[i] = sc.nextInt();
		}
		
		int a = num[1]%10; //5 �����ڸ�
		int b = (num[1]/10)%10; //8 �����ڸ�
		int c= (num[1]/100); //3 �����ڸ�
				
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
