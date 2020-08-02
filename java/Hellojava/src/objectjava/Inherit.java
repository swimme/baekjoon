package objectjava;

//[6.상속]
//한 객체의 변수와 메소드를 "다른 객체가 물려 받을 수 있는 기능"

		//ex 객체에 메소드를 추가하는 것이 어려운 경우.
		// 내가 만들지 않은 소스인 경우 원소스 업데이트시 사라질 수 있음
		// 다양한 곳에 활용되는 객체인 경우 다른 곳에선 불필요
				
		//then 기존 객체 유지하며 기능 추가하는 방법은? 상속
		// 즉 기존객체 수정하지 않으면서, *새로운 객체가 기존객체를 기반으로* 만들어짐
		// 기존의 객체는 기능을 물려줌 = 부모(상위)객체(클래스); 새로운 객체는 물려받음 = 자식(하위)개체


class Cal {
	int left, right; // 클래스변수
	
	public void setOprands(int left, int right) {
		this.left = left; 
		this.right = right; // this는 이 클래스, 이클래스의 right에 인자right대입
	}
	
	public void sum() {
		System.out.println(this.left+this.right);
	}
	
   public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}

//새로운 클래스
class Substract extends Cal{ 
	//"extends" - Cal클래스(상위)를 Substract클래스(하위)가 확장; class 하위 extends 상위
	// 하위->상위; 하위가 상위를 확장/상속한다.
	
	public void sub() {
		System.out.println(this.left-this.right);
	}
}


public class Inherit {

	public static void main(String[] args) {
		
		Substract c1 = new Substract(); //인스턴스화
		//기존의 Cal클래스의 메소드 - "extends Cal"
		c1.setOprands(10, 20);
		//추가로 정의한 메소드 호출
		c1.sub();
	}

}
