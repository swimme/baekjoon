package finalPart;

// [예외1. 오류처리문법]
//try {} catch (예외클래스 인스턴스) { 예외 발생시 로직 } finally { 예외여부와 관계없이 실행로직 }

/// 예외클래스 Exception 
/// getMessage(), toString(), printStackTrace()등으로 오류원인 리턴할수있다
/// 그외의 좀더 세부적인 클래스로 ArithmeticException 등이 있다.
class Calculator {
	int left, right;
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void divide() {
		try {
			System.out.println("계산 결과는");
			System.out.println(this.left/this.right);
		} catch (Exception e) {
			System.out.println("오류발생:" + e.getMessage() ); // 예시) 0으로 나누는 경우
		} finally {
			System.out.println("always");
		}
	}
}

//finally는 작업의 뒷정리; ex 예외발생여부와 상관없이 항상 동작후 서버를 닫아야하는 경우

public class ExceptionOne {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOprands(10,0); 
		c1.divide(); 

	}

}
