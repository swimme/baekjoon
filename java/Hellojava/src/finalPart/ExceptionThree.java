package finalPart;
import java.io.IOException; //IOException; must be caught or declared to be thrown

//throw new
class Calculator2 extends Calculator{
	
	//둘 중하나로 오류 막을수 ㅇ
	public void setOprands (int left, int right) {
		if(right == 0) {
			throw new IllegalArgumentException("두번째 인자의 값은 0이될 수 없다");
		}
		this.left = left;
		this.right = right;
	}
	
	 public void divide(){
		 if(this.right == 0){
			 throw new ArithmeticException("0으로 나누는 것은 허용되지 않습니다.");
		 }
		 try {
			 System.out.print("계산결과는 ");
			 System.out.print(this.left/this.right);
			 System.out.print(" 입니다.");
		 } catch(Exception e){
			 System.out.println("\n\ne.getMessage()\n"+e.getMessage());
			 System.out.println("\n\ne.toString()\n"+e.toString());
			 System.out.println("\n\ne.printStackTrace()");
			 e.printStackTrace();
		 }
	 }
	 
}

//Exception 클래스와 RuntimeException 클래스
//checked 예외 - RuntimeException을 제외한 Exception의 하위 클래스
///checked 예외는 사용자에게 문제를 해결할 기회를 주는 것이면서 예외처리를 강제하는 것 - IOException
///사용자 쪽에서 예외 상황을 복구 할 수 있다면 

//unchecked 예외 - RuntimeException의 하위 클래스
///사용자가 API의 사용방법을 어겨서 발생하는 문제거나 예외 상황이 이미 발생한 시점에서 그냥 프로그램을 종료하는 것이 덜 위험 할 때
//- ArithmeitcException

// [커스텀 예외 만들기]
//class DivideException extends RuntimeException {
class DivideException extends Exception {
	 DivideException(){
	        super();
	    }
	 DivideException(String message){
		 super(message);
	 }
}

class newCalculator extends Calculator{
    public void divide(){
//    public void divide() throws DivideException{ //사용자에게 위임할경우
        if(this.right == 0){
//            throw new DivideException("0으로 나누는 것은 허용되지 않습니다.");
            try {
                throw new DivideException("0으로 나누는 것은 허용되지 않습니다.");
            } catch (DivideException e) {
                e.printStackTrace();
            }
        }
        System.out.print(this.left/this.right);
    }
}

public class ExceptionThree {

	public static void main(String[] args) {
		
	}

}
