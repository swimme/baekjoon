package finalPart;

// [기본제공 object클래스]
class o {}
//= class o extends Object {}

//-1. toString: 객체를 문자로 표현하는 메소드
//System.out.print로 호출하면 자동으로 toString이 호출되도록 약속되어 있다.
class CalculatorObject extends Calculator {
	//재정의
	public String toString(){
		return "left : " + this.left + ", right : "+ this.right;
	}	
}

//-2. equals: 객체와 객체가 같은 것인지를 비교api
class Student {
	String name;

	Student(String name) { //자기자신을 인스턴스화하는 생성자. 맞음?
		this.name = name;
	}

	public boolean equals(Object obj) {
		Student _obj = (Student)obj;
		//메소드 equals로 전달된 obj의 데이터 타입이 Object이기 때문에 
		//이를 Student 타입으로 형 변환하는 코드
		return name == _obj.name;
	}
}

//-3. finalize: 객체가 소멸될 떄 호출되기로 약속한 메소드
// not preferred
/// 가비지 컬렉션
//(garbage collection)
/// 램을 효율적으로 사용하기 위해서 더 이상 사용하지 않는 데이터를 램에서 제거하도록 자동화 한 것
//https://d2.naver.com/helloworld/1329

//-4. clone: 어떤 객체가 있을 때 그 객체와 똑같은 객체를 복제해주는 기능
class Studentwo implements Cloneable{
	String name;
	Studentwo(String name){
		this.name = name;
	}
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}

public class ObjectClass {
	public static void main(String[] args) {
		//
		Calculator c = new Calculator();
		c.setOprands(10,20);
		System.out.println(c);

		CalculatorObject c1 = new CalculatorObject();
		c1.setOprands(10, 20);
		System.out.println(c1.toString());
		System.out.println(c1);

		//
		Student s1 = new Student("egoing");
		Student s2 = new Student("egoing");
		System.out.println(s1 == s2); //false; 서로 다른 객체
		System.out.println(s1.equals(s2)); //true; 논리적 객체비교

		//
		Studentwo st1 = new Studentwo("soo");
		try {
			Studentwo st2 = (Studentwo)st1.clone();
			System.out.println(st1.name);
			System.out.println(st2.name);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
