package example;

import java.util.Scanner;
public class MultipleLineScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int T = sc.nextInt();
		
//		String A="";
//		String B="";
		int result[] = new int[T];
		
		for (int i=0;i<T;i++) {  //���ٸ���
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

//����Ǯ�̴� �ѹ��� ��� case�Է��� ���Ŀ� sum�� �ѹ��� �޴°Ű�
//����Ǯ�̴� ��case�Է¸��� sum�� �޴� ��
  // A�� B�� ���� nextInt()�� ������ �������ε� �ν���!!!!!!!