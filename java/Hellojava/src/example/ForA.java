package example;
import java.util.Scanner;

//[�����]
public class ForA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int N = sc.nextInt();
		
		//�ٸ� Ǯ�� - for��ø��: i��°�ٿ� i����!
		for(int i=0; i<N; i++) { 
			for(int j=0; j<=i; j++) { // j<=i�ؾߵ�!!
				System.out.print("*"); //���ٴ�
			} System.out.println();   //����  
			//print�� println ����!!
		}
			
//		//��Ǯ�� - �迭�� �ϳ��� �ְ�  / ���ٴ� ����Ʈ
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
