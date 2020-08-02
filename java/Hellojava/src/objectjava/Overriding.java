package objectjava;

//[8.override]
// 하위클래스에서 상위클래스의 메소드를 덮어쓰는 겨우; 재정의

//* 상위클래스 Inherit파트의 Cal 
class SubstractionableCal extends Cal {
	
	//상위클래스의 sum메소드를 override
	public void sum() {
		System.out.println("실행결과는"+(this.left+this.right)+"입니다");
	}
	
	//0. 오류발생경우
//	public int avg() {
//		return(this.left+this.right)/2;
//	}
	
	// 1. override 제약조건  
	// : return type, params(수, type, 순서)가 상위하위클래스 같아야함 = 서명이 일치
	
	// 2. 상위클래스와  같은 코드의 중복막으려면?
//	public int avg() {
//		return *super.avg()*;
// 		추가로직
//	}
}

public class Overriding {

	public static void main(String[] args) {

	}

}
