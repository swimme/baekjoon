package finalPart;

//[2. abstract]
// 클래스/메소드를 직접 사용할 수 없고 상속한 클래스를 만들어서 상속하여 사용하도록 강제하는 것

// 추상클래스
//- 추상메소드를 하나라도 가지는 클래스는 추상클래스여야한다.
//- 추상메소드 없을수도 ㅇ
abstract class A {
	// 추상 메소드 
	//메소드의 시그니처만이 정의된 비어있는 메소드
	//- 본체가 있는 메소드는 abstract 키워드를 가질 수 없다.
	//상속클래스에서 overriding 필요
	public abstract int b();
	
	public void d(){
		System.out.println("world");
	}
}

//즉, abstract는 구체적인 로직은 사용하는 쪽에게 넘기고, 로직을 사용하기 위한 시그니처(형식)만 정의하는 것.

class B extends A {
	public int b() { //A의 추상메소드 override
		return 1;
	}
}

public class AbstractClass {
	public static void main(String[] args) {
//		A obj = new A(); //직접사용불가
		B obj = new B();
	}
}

