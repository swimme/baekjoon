package finalPart;

//[다형성] -이어서

/*
 abstract class AbsCalculator{
	int left, right;
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	int _sum() { //cf. 접근제어자 default(같은패키지)
		return this.left + this.right;
	} 
	
	public abstract void sum();
	public abstract void avg();
	public void run() {
		sum(); //cf. 자식클래스에서 정의된 메소드 호출하는거
		avg();
	}
	
}

class CalculatorDecoPlus extends AbsCalculator{
	public void sum(){
		System.out.println("+ sum :"+ _sum() );
	}
	public void avg(){
		System.out.println("+ avg :"+(this.left+this.right)/2);
	}
}

class CalculatorDecoMinus extends AbsCalculator{
	public void sum(){
     System.out.println("- sum :"+ _sum() );
 }
 public void avg(){
     System.out.println("- avg :"+(this.left+this.right)/2);
 }
}

 */

public class PolymoDemo {

	//추가
	public static void execute(AbsCalculator cal) {
		System.out.println("실행결과");
		cal.run();
	}
	
	public static void main(String[] args) {
//		CalculatorDecoPlus c1 = new CalculatorDecoPlus();
		AbsCalculator c1 = new CalculatorDecoPlus();
		AbsCalculator c2 = new CalculatorDecoMinus();
		//데이터타입은 AbsCalculator
		
		execute(c1);
		execute(c2);
		//위에 정의된 메소드로 두 c1, c2를 모두 실행시킬 수 있다.
		//즉, 같은로직-상속,abstract로 사용에서 차별화 -데이터타입은 같게 인스턴스화하여 처리할 수 있음
		
		//하나의 클래스(AbsCalculator)가 다양한 동작 방법(ClaculatorDecoPlus, ClaculatorDecoMinus)을 가지고 있는데 
		//이것을 다형성
	}
	

}
