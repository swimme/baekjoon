package objectjava;

//[9.overload]
// "같은 이름"이지만 "다른 인자"가지는 메소드 여러개 정의하는 방법

// ex. 세수를 계산하기도 하는 계산기
class overloadCalculator {
	int left, right;
	
	// *추가전역변수설정*
	int third = 0;
	
	public void setOprands(int left,int right) {
		this.left = left;
		this.right = right;
	}
	
	public void setOprands(int left,int right, int third) {
//		this.left = left;
//		this.right = right; 
		
		//***중복제거가능!***
		this.setOprands(left, right);
		
		this.third = third;
	}
	
	public void sum() {
		System.out.println(this.left + this.right + this.third);
	}
}

//오버로딩 Part2. - 규칙
public class Overloading {
	
	void A() {}
	void A(int arg1) {}
	void A(String arg1) {}
//	int A() {}
	// 같은 이름이면서 매개변수정보도 같은데 return값이 다른 경우 - 오류발생
	// cf. 메소드의 반환값은 메소드를 호출하는 시점에서 전달되지 않는 정보이기 때문에 오버로딩의 대상이 될 수 없다.
	
	public static void main(String[] args) {
		Overloading od = new Overloading();
		od.A();
		od.A(1);
		od.A("hi");
	}
}
//오버로딩 part3 - 상속에서 (vs.오버라이딩)
public class Overloading2 extends Overloading{
	void A (String arg1, String arg2) {} //상위에서 시그니처까지같은메소드 없음; 오버로딩 
	void A () {} //상위에서도 존재 ; 오버라이딩
	
	public static void main(String[] args) {
		Overloading2 od = new Overloading2();
		od.A();
		od.A(1);
		od.A("hi");
		od.A("hi","sy");
	}
}

//class와 객체생성 main외내부 re
// cf. 자기자신을 인스턴스화시킨경우 [InheritConstructor참고] vs. 계산기 예제

