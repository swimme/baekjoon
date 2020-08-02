package finalPart;
import java.io.IOException; //IOException; must be caught or declared to be thrown

//throw new
class Calculator2 extends Calculator{
	
	//�� ���ϳ��� ���� ������ ��
	public void setOprands (int left, int right) {
		if(right == 0) {
			throw new IllegalArgumentException("�ι�° ������ ���� 0�̵� �� ����");
		}
		this.left = left;
		this.right = right;
	}
	
	 public void divide(){
		 if(this.right == 0){
			 throw new ArithmeticException("0���� ������ ���� ������ �ʽ��ϴ�.");
		 }
		 try {
			 System.out.print("������� ");
			 System.out.print(this.left/this.right);
			 System.out.print(" �Դϴ�.");
		 } catch(Exception e){
			 System.out.println("\n\ne.getMessage()\n"+e.getMessage());
			 System.out.println("\n\ne.toString()\n"+e.toString());
			 System.out.println("\n\ne.printStackTrace()");
			 e.printStackTrace();
		 }
	 }
	 
}

//Exception Ŭ������ RuntimeException Ŭ����
//checked ���� - RuntimeException�� ������ Exception�� ���� Ŭ����
///checked ���ܴ� ����ڿ��� ������ �ذ��� ��ȸ�� �ִ� ���̸鼭 ����ó���� �����ϴ� �� - IOException
///����� �ʿ��� ���� ��Ȳ�� ���� �� �� �ִٸ� 

//unchecked ���� - RuntimeException�� ���� Ŭ����
///����ڰ� API�� ������� ��ܼ� �߻��ϴ� �����ų� ���� ��Ȳ�� �̹� �߻��� �������� �׳� ���α׷��� �����ϴ� ���� �� ���� �� ��
//- ArithmeitcException

// [Ŀ���� ���� �����]
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
//    public void divide() throws DivideException{ //����ڿ��� �����Ұ��
        if(this.right == 0){
//            throw new DivideException("0���� ������ ���� ������ �ʽ��ϴ�.");
            try {
                throw new DivideException("0���� ������ ���� ������ �ʽ��ϴ�.");
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
