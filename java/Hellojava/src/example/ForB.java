package example;

//[2741. N���]
import java.util.Scanner;

public class ForB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int N = sc.nextInt();
		
		//for��ø��: i��°�ٿ� i����! + ������ ���� = indent
		for(int i=1; i<=N; i++) { 
			for(int j=1;j<=N-i; j++) { // N���� i��ŭ���� ; 3�̸� 3-1
				System.out.print(" ");
			} for(int k=1; k<=i; k++) {  //i��°�ٸ�ŭ
				System.out.print("*"); 
			} System.out.println ("");   //����  
		}
		sc.close();
	}
}
