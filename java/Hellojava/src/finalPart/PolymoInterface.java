package finalPart;

//다형성 -3. 인터페이스와 다형성
interface In {}
class CCb implements In {}

interface In2 {
	public String A();
}

class DD implements In, In2{
	public String A() {return "";}
}

public class PolymoInterface {
	public static void main(String[] args) {
		In inCl = new CCb();
		//특정인터페이스 구현하는 클래스는 
		//데이터타입을 그 인터페이스로 인스턴스화 할 수 있다.

		//다중 상속이 지원되는 인터페이스의 특징고려하면,
		DD objd = new DD();
		In objdi = new DD();
		In2 objdi2 = new DD();
		
//		objdi.A(); //데이터타입이 In이므로 
		objdi2.A();
		//데이터타입을 In으로 한다는 것은
		// 인스턴스를 외부에서 제어할 수 있는 조작장치를 In의 멤버로 제한한다는 것
		// 이렇게 하여 하나의 클래스가 다양한 형태를 띄게 할 수 있다.
	}

}
