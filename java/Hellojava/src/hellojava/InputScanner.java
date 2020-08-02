package hellojava;

//scanner 라이브러리 사용 -inputStream도있음 
import java.util.Scanner;
//
import java.io.*;

public class InputScanner {

	public static void main(String[] args) throws IOException { //
		Scanner sc = new Scanner(System.in); //cf. Scanner객체 사용
		double a = sc.nextInt(); //정수를 받아 double로 저장하면 소수점자리까지 구할 수 있다. vs int a 
		double b = sc.nextInt();
//		String c = sc.next();
		
//		System.out.println(i*1000);
		System.out.println(a/b);
		sc.close();
		
	 // ver2. 
		//re*** (char)System.in.read()메소드 IOException
		char ch;
		ch = (char)System.in.read();
		System.out.println(ch);
		
		// charAt메소드
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
//main메소드 실행

//Scanner객체에 system.in(사용자가 입력한 값이란 의미;file이 될수도 있음)전달
// (scanner는 사용자가 입력한 값은 scanning함)
//이객체를 sc라는 변수에 저장

//scanner의 nextInt라는 메소드; 사용자가 입력할때 담고있다가  엔터치면 그때 i에 저장 (정수만입력받음)
//nextLine, nextDouble, next(단어)
//여러개면 여러메소드쓰면됨

//https://limkydev.tistory.com/170 보충