package hellojava;
//sysout 입력한 후 Ctrl + Space 하면 System.out.println();

public class Operator {

	public static void main(String[] args) {
		// 1. 데이터타입에 따른 연산 출력값 차이
		int a = 10;
		int b = 3;
		double div = a/b;
		System.out.println(a/b); // 3 ; 정수만출력
		System.out.println(div); //3.0 ; 나눈후에 정수형으로 변환
		
		float c = 10.0F;
		float d = 3.0F;
		System.out.println(c/d); // 3.33333 ; 소수점출력
		
		System.out.println(a/d); // 3.33333 ; 정수->실수로 자동변환
	
		// 2. 단항 연산자  ++ /--
		int i = 3;
		i++;
		System.out.println(i); //4
		++i;
		System.out.println(i); //5
		
		System.out.println(i++); //5  ***i출력후 ++
		System.out.println(i); //6 
		
		System.out.println(++i); //7 ++하고 출력	
		
		// 3. 비교연산자 == , != , >= 
		
		
		// 문자열비교는 .equals 메소드
		String s1 = "ksj";
		String s2 = "mogu";
		System.out.println(s1.equals(s2));
		
		// 4. 논리연산자 &&, ㅣㅣ , !
	}

}
