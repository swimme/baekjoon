package hellojava;

public class number {

	public static void main(String[] args) {
		System.out.println(1.2+1.3); //자바는 정수와 실수 구별
		double a, b; //실수 변수선언
		a = 1.1;
		b = 1.2;
		System.out.println(a+b);
		
		System.out.println("문자"); //자바는 문자와 문자열 구별 ('문자'여러개 = "문자열")
		System.out.println("문");
		System.out.println("문자열안의 \"문자열\" ");
		System.out.println("두줄\n두줄");
		String s = "두줄\n";
		System.out.println(s+s);
		System.out.println("\\    /\\"); // '\' 쓰려면 \\
        System.out.println("\"\"\""); // '"' 쓰려면 \"
	// 6월 24일 월요일
	}

}
