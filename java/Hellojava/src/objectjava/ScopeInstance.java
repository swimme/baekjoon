package objectjava;

//[4. 유효범위 -2 ]
class C {
	int v = 10; //전역변수
	
	void m() {
		int v = 20; //지역변수
		System.out.println(v); //20
		System.out.println(this.v); //10
		//this는 객체생성시 인스턴스 자신을 지칭
		//calEx의 setOprands확인
		// cf. 표기
	}
	
}

public class ScopeInstance {

	public static void main(String[] args) {
		C c1 = new C(); //객체생성; 인스턴스 c1
		c1.m(); //20; 지역v ; 지역변수의 우선순위가 더 높다..
				//cf. 인스턴스와 인스턴스 메소드
			//여기서 this.v는 c1의 v라는 뜻; 즉 class의 v; 전역변수
		
		//지역과 전역변수의 중첩 활용: 디폴트를 전역으로 두고 바꾸는 경우를 지역으로 둘수있다.
	}

}

//보충 _ 인스턴스 메소드와 클래스메소드 차이 다시. ; static의 의미

//cf. 절차지향에서 전역변수가 많은 것은 not preferred ;겹쳐서 발생할수있는 오류
//re

