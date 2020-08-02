package objectjava;

//[5.초기화와 생성자]
class Calculator2{ //주의; 한패키지내에서 같은이름의 클래스여러개 잇을 수 x
	int left, right;
	
	//***클래스와 똑같은 이름의*** 메소드 == 생성자
	  //클래스가 생성될때 자동으로 같은이름의 생성자가 실행되도록 약속되어있다 (가장먼저실행되도록;초기화작업)
	public Calculator2(int left, int right) { //지역 인자
		this.left = left; //this=전역 ; 전역 = 지역 (전역변수 set)
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left+this.right); //then set된 전역사용
	}
	
	public void avg() {
		System.out.println((this.left + this.right) / 2 );
	}
	
}
	
public class Constructor {	
	public static void main(String[] args) {
		//생성자; 초기화(시작전준비 init)를 객체단위로 객체에서 초기화할수 있도록 도와주는 기능?
	
		//예제1.
//		Calculator c1 = new Calculator();
//		c1.setOprands(10, 20);
//		c1.sum();       
//		c1.avg(); 
		//인스턴스를 만들고 sum과 avg함수가 사용되려면 언제나 setOprands()선행돼야하는 경우
		  //즉, left와 right설정해주는 기능이 필요한 인스턴스
		
		//예제2.
		//개선 ;객체생성시 이 값들을 설정하도록하기
		Calculator2 c2 = new Calculator2(10, 20); //우변의 Calculator는 생성자이다!
		c2.sum();
		c2.avg();	
	}
}
//**보충: public class내부 메인메소드와 그외부 class(as 부품)..둘다 객체..
