package objectjava;

// [1-3 예제]
class Calculator {
	//클래스 변수
	static double PI = 3.14;
	static int base = 0;
	// 인스턴스 변수
	int left, right;
	
	//메소드 - 인스턴스 메소드
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
		//left = _left; (인자가 _left인경우); this안써도 좌변의 left가 인스턴스 변수임을 인식
	}
	
	//인스턴스 메소드
	public void sum() {
		System.out.println(this.left + this.right + base);
	}
	
	//클래스 메소드
	public static void sum2(int left, int right) {
		System.out.println(left + right);
	}
	
	//오류사항
	static void static_instance() {
//		System.out.println(left); 클래스메소드는 인스턴스변수 접근안됨
	}
	
	void instance_static() {
		System.out.println(base); //인스턴스 메소드는 클래스변수 접근가능
	}
	
}
	
public class CalEx {

	public static void main(String[] args) {
		
		Calculator c1 = new Calculator();
		c1.setOprands(10,20);
		c1.sum(); //30

		System.out.println(c1.PI); 
		System.out.println(Calculator.PI); //클래스 변수
		
		Calculator.base = 10;
		c1.sum(); //40
		
		Calculator.sum2(10, 20); //30 //클래스 메소드
		
		//
		c1.sum2(10,20); //인스턴스->클래스메소드 접근가능
		//Calculator.sum(); //클래스->인스턴스메소드 접근불가능
		//Calculator.setOprands(10,20);
		Calculator.sum2(10, 20); //클래스->클래스메소드 접근가능
		
		
	}

}
