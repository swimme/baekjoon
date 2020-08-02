package finalPart;

//[제네릭의 제한]
//인스턴스화할 때 지정되는 데이터타입
//대신 제네릭으로 올 수 있는 데이터형을 특정클래스의 자식으로 제한 - 클래스상속이나 인터페이스로

abstract class Info {
	public abstract int getLevel();
}
//abstract추상화: 상속하여 사용하도록 강제 (꼭abstract아니여도됨)
//interface와 implements관계에서도 사용가능

class EmployeeInfo2 extends Info {
	public int rank;
	EmployeeInfo2 (int rank) { this.rank = rank; }
	
	//getLevel구현
	public int getLevel() {
		return this.rank;
	}
}

//****
// PersonE의 T는 Info클래스나 그 자식(EmployeeInfo2)만 올 수 있다.
class PersonE<T extends Info> {
	public T info;
	PersonE(T info) { 
		this.info = info;
		info.getLevel();
	}
}

public class GenericDemo3 {

	public static void main(String[] args) {
		PersonE<EmployeeInfo2> p1 = new PersonE(new EmployeeInfo2(1));
//		PersonE<String> p2 = new PersonE<String>("부장"); //컴파일에러
	}

}
