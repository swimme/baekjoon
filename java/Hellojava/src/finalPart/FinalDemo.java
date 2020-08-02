package finalPart;

//final- 상속/변경을 금지하는 규제 
//abstract-상속을 강제

class Fined{
	static final double PI = 3.14; //-1 final 필드(변수)
	//static..?
	
	final void b() {} //-2 final 메소드
}

class Using extends Fined {
//	void b() {} //final 메소드 b 상속불가
}

final class C {
	void f() {}
}

//class D extends C {} //final 클래스 상속불가


public class FinalDemo {

	public static void main(String[] args) {

	}

}
