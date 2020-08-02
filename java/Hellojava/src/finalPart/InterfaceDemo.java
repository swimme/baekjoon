package finalPart;

//[4. 인터페이스]
// 어떤 객체가 특정 '인터페이스를 사용'한다면,
// 그 객체는 반드시 '인터페이스의 메소드들을 "구현"해야' 한다.
//하위 클래스에 특정한 메소드가 반드시 존재하도록 강제

interface I {
	public void z();
}

//implements
class Any implements I {
	public void z() {} //
}

public class InterfaceDemo {
	public static void main(String[] args) {
	}
}

//예시상황:
// 계산기 클래스는 개발자 A가 만들고, 개발자 B는 그 클래스를 사용하는 로직을 만들다
//둘중한명이 이 클래스가 가지고 있어야 할 메소드를 인터페이스로 만들어서 제공하는 것
interface Calculatable {
    public void setOprands(int first, int second, int third) ;
    public int sum(); 
    public int avg();
}

//인터페이스를 이용한 협업
//인터페이스를 이용해서 서로가 동일한 메소드를 만들도록 규약을 만듦 


//하나의 클래스가 여러 인터페이스를 구현할 수 있다
//인터페이스끼리도 상속이 된다
//인터페이스의 멤버는 반드시 public


//cf.추상화와의 차이구별
