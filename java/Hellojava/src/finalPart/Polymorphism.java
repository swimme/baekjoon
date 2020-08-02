package finalPart;

// [다형성]
// 하나의 메소드/클래스가 다양한 방법으로 동작하는 것
// 키보드의 키 - 사용방법: 누른다 / ESC: 취소, Enter: 실행

//overloading과 다형성
// :같은 이름이지만 서로 다른 동작방법(인자)을 가짐
class Oo {
	public void a (int param) {}
	public void a (String param) {}
}

//클래스와 다형성
class AA {
	public String x() { return "A.x";}
}

class BBc extends AA { 
	public String x() { return "B.x"; } //AA의 메소드를 overriding
	public String y() { return "y"; }
}

public class Polymorphism {
	
	public static void main(String[] args) {
		AA obj = new BBc();
		//클래스 BB의 데이터형이 클래스 AA
		//AA를 "상속하므로 데이터형으로 삼을 수 있다".
		
		obj.x();
//		obj.y(); //오류
		
		//클래스 BB의 데이터형을 클래스 AA로 하면 마치 클래스 AA인것처럼 동작하는 것!
		
		System.out.println(obj.x()); // B.x
		
		//하지만 클래스 BB의 기본적 성질은 그대로 간직
		// AA를 상속하여 override한 메소드는 그 메소드를 사용
		
		//즉, BB를 AA데이터타입으로 인스턴스화하면 AA의 멤버만이 해당 BB의 멤버가 되지만
		// BB에서 "오버라이딩한 멤버는 오버라이딩한 동작방식"을 따른다
		
		BBc obj2 = new BBc();
		obj2.y();
		
	}
	
}
