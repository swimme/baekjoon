package hellojava;

//scanner ���̺귯�� ��� -inputStream������ 
import java.util.Scanner;
//
import java.io.*;

public class InputScanner {

	public static void main(String[] args) throws IOException { //
		Scanner sc = new Scanner(System.in); //cf. Scanner��ü ���
		double a = sc.nextInt(); //������ �޾� double�� �����ϸ� �Ҽ����ڸ����� ���� �� �ִ�. vs int a 
		double b = sc.nextInt();
//		String c = sc.next();
		
//		System.out.println(i*1000);
		System.out.println(a/b);
		sc.close();
		
	 // ver2. 
		//re*** (char)System.in.read()�޼ҵ� IOException
		char ch;
		ch = (char)System.in.read();
		System.out.println(ch);
		
		// charAt�޼ҵ�
		char m,n;
		String str;
		Scanner scc = new Scanner(System.in);
		str = sc.nextLine();
		m = str.charAt(0);
		n = str.charAt(2);
		System.out.println(a+""+b);
		scc.close();
	}

}
//main�޼ҵ� ����

//Scanner��ü�� system.in(����ڰ� �Է��� ���̶� �ǹ�;file�� �ɼ��� ����)����
// (scanner�� ����ڰ� �Է��� ���� scanning��)
//�̰�ü�� sc��� ������ ����

//scanner�� nextInt��� �޼ҵ�; ����ڰ� �Է��Ҷ� ����ִٰ�  ����ġ�� �׶� i�� ���� (�������Է¹���)
//nextLine, nextDouble, next(�ܾ�)
//�������� �����޼ҵ徲���

//https://limkydev.tistory.com/170 ����