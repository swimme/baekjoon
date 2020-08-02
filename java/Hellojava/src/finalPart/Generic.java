package finalPart;

//[Generic]
//클래스 내부에서 사용할 데이터 타입을 외부에서 지정
// 즉 클래스를 정의 할 때는 info의 데이터 타입을 확정하지 않고 
// 인스턴스를 생성할 때 데이터 타입을 지정하는 기능 

class Person<T> {
	public T info;
}

public class Generic {

	public static void main(String[] args) {
		Person<String> p1 = new Person<String> (); 
		// == public String info
		// == p1.info: String
		Person<StringBuilder> p2 = new Person<StringBuilder>();
		// == p2.info: StringBuilder
		
	}

}
