package finalPart;

// [����1. ����ó������]
//try {} catch (����Ŭ���� �ν��Ͻ�) { ���� �߻��� ���� } finally { ���ܿ��ο� ������� ������� }

/// ����Ŭ���� Exception 
/// getMessage(), toString(), printStackTrace()������ �������� �����Ҽ��ִ�
/// �׿��� ���� �������� Ŭ������ ArithmeticException ���� �ִ�.
class Calculator {
	int left, right;
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void divide() {
		try {
			System.out.println("��� �����");
			System.out.println(this.left/this.right);
		} catch (Exception e) {
			System.out.println("�����߻�:" + e.getMessage() ); // ����) 0���� ������ ���
		} finally {
			System.out.println("always");
		}
	}
}

//finally�� �۾��� ������; ex ���ܹ߻����ο� ������� �׻� ������ ������ �ݾƾ��ϴ� ���

public class ExceptionOne {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOprands(10,0); 
		c1.divide(); 

	}

}
