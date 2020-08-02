package hellojava;

//�ڹ��� ���� Ŭ���� inputStram���
import java.io.InputStream;
// �ƽ�Ű�ڵ� �����ذ����� inputStreamReader�� �������� BufferedReader���� ���
import java.io.*;

public class InputStreamDemo {

	public static void main(String[] args) throws Exception {
		InputStream in = System.in;  //system.in�� inputstream�� ��ü
		InputStreamReader reader = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(reader);
		
		//1 InputStream 1����Ʈ
		int a;
		a = in.read(); //read�޼ҵ�� 1����Ʈ�� ���������� �а�
					   // �ƽ�Ű�ڵ尪���� �����Ѵ� (0-255)
		
		System.out.println(a); //���⼭ 1 input�̳� 10 input�̳� �Ѵ� 49 (�ƽ�Ű�ڵ�� ���)
		
		// 2 InputStream ������
		byte[] b = new byte[2];
		in.read(b);
		System.out.println(b[0]);
		System.out.println(b[1]);
		
		// 3 InputStreamReader
		char[] c = new char[4];
		reader.read(c);
		System.out.println(c); //���ڱ״�� �ν�
		
		// 4 BufferedReader
		String s = br.readLine(); //�������̼��� �����൵��, �Է���ü
		System.out.println(s); 
	}

}
