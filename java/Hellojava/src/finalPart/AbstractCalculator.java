package finalPart;

//[abstract - PART2]
//Part2. 추상클래스 사용이유
//- 큰규모의 프로젝트에서 사용
//- 클래스가 공통적기능과 맥락에 따라 달라지는 기능이 존재하는 경우

//예제 -  
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

//공통 - run메소드; 구현자가 만든다 , 경우에 따라 - 출력모습달리; 메소드사용자에게 위임
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

//////

public class AbstractCalculator {

	public static void main(String[] args) {
		CalculatorDecoPlus c1 = new CalculatorDecoPlus();
		c1.setOprands(10,20); 
		c1.run();
		
		CalculatorDecoMinus c2 = new CalculatorDecoMinus();
		c2.setOprands(10, 20);
		c2.run();
	}
}

//"경우에 상황에 따라서 동작 방법이 달라지는 메소드(sum, avg)는 추상 메소드로 만들어서 하위 클래스에서 구현하도록 하고 "
// + _sum()함수 공통다시 정의
//"모든 클래스의 공통분모(setOprands, run)의 경우에는 상위 클래스에 두어서 코드의 중복, 유지보수의 편의성 등을 꾀할 수 있다."


// cf. 플러스알파 - 디자인패턴:  template method pattern