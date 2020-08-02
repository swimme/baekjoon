package hellojava;

//자바의 내장 클래스 inputStram사용
import java.io.InputStream;
// 아스키코드 단점해결해줄 inputStreamReader와 유동길이 BufferedReader까지 사용
import java.io.*;

public class InputStreamDemo {

	public static void main(String[] args) throws Exception {
		InputStream in = System.in;  //system.in이 inputstream의 객체
		InputStreamReader reader = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(reader);
		
		//1 InputStream 1바이트
		int a;
		a = in.read(); //read메소드는 1바이트의 정수형값을 읽고
					   // 아스키코드값으로 저장한다 (0-255)
		
		System.out.println(a); //여기서 1 input이나 10 input이나 둘다 49 (아스키코드로 출력)
		
		// 2 InputStream 여러개
		byte[] b = new byte[2];
		in.read(b);
		System.out.println(b[0]);
		System.out.println(b[1]);
		
		// 3 InputStreamReader
		char[] c = new char[4];
		reader.read(c);
		System.out.println(c); //문자그대로 인식
		
		// 4 BufferedReader
		String s = br.readLine(); //고정길이선언 안해줘도됨, 입력전체
		System.out.println(s); 
	}

}
