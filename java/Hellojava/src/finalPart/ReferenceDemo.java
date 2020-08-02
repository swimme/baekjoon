package finalPart;

public class ReferenceDemo {

	static void _value(int b) { 
	//default static void: 같은 패키지에서만; 언제 default 언제 public쓰는지 헷갈린다 rere
		b = 2;
	}
	
	//*************
	public static void runValue() {
		int a= 1;
		_value(a); 
		//1. int형 a의 값을  2로 바꾼다? 아님
		// == int b = a; b = 2; 
		// 좌변에 우변을 대입! b가 생성되고, 그 값을 a와 같게하고 다시 값을 2로 바꾼것일뿐
		
		System.out.println("runValue, " +a); //1
	}
	//*************

	static void _reference1(Aref b) {
//		System.out.println(b.id); // 1
		b = new Aref(2); 
	}
	
	public static void runReference1() {
		Aref a = new Aref(1); // 참조 데이터타입 A -> Instance (id = 1)
		_reference1(a); 
		//2. Aref형 a의 인스턴스를 id가 2인 새로운 인스턴스로 바꾼다? 아님

		// == Aref b = a; b = new A(2);
		// Aref형인 b가 생성되고, a와 같은 인스턴스를 참조하게 했다가; 다시 새로운 id가 2인 인스턴스를 참조하게 하는것!
		//a에는 영향이 없다. b만 바뀌는 것
		
		
		//참조데이터타입(a)을 매개변수로 전달; reference1안에서 "매개변수 b"를 다른 인스턴스로 변경
		System.out.println("runReference1, " + a.id); //1
	}
	
	static void _reference2(Aref b) {
		b.id = 2;
	}
	
	public static void runReference2() {
		Aref a = new Aref(1);
		_reference2(a); 
		//3. Aref형 a의  인스턴스의 id를 2로 바꾼다?
		// == Aref b = a; b.id = 2;
		// Aref형인 b가 생성되고, a와 같은 인스턴스를 참조하게 한다; b가 참조하는 그 인스턴스의 id를  2로 바꾼다
		//a와 b는 같은 인스턴스를 참조하므로 a에도 반영

		//(a와 b는 모두 같은 객체를 참조하고 있는 변수다)
		
		System.out.println("runReference2, " + a.id);
	}
	
	public static void main(String[] args) {
		runValue(); //1
		runReference1(); //1
		runReference2(); //2
	}

}

/*
 * A a = new A(1);
 * A b = new A(1);
 * b.id = 2; (a와는 관계가 없다.)
 * System.out.println(a.id); -> 1 출력
 * 
 * 이 둘은 서로 다른 instance 주소를 참조하게 됩니다.
 *  여기서 'new'를 통해 컴퓨터는 새로운 instance를 위한 메모리 공간을 확보하게 됩니다. 
 *  즉 a와 b는 다른 instance 주소를 참조하게 되는 것이죠.
 *  
 *  A b = a; -> (b가 instance A의 메모리 주소를 참조한다.)
 *  b.id = 2;
 *  System.out.println(a.id); -> 2 출력
*/