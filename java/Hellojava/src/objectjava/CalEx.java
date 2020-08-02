package objectjava;

// [1-3 ����]
class Calculator {
	//Ŭ���� ����
	static double PI = 3.14;
	static int base = 0;
	// �ν��Ͻ� ����
	int left, right;
	
	//�޼ҵ� - �ν��Ͻ� �޼ҵ�
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
		//left = _left; (���ڰ� _left�ΰ��); this�Ƚᵵ �º��� left�� �ν��Ͻ� �������� �ν�
	}
	
	//�ν��Ͻ� �޼ҵ�
	public void sum() {
		System.out.println(this.left + this.right + base);
	}
	
	//Ŭ���� �޼ҵ�
	public static void sum2(int left, int right) {
		System.out.println(left + right);
	}
	
	//��������
	static void static_instance() {
//		System.out.println(left); Ŭ�����޼ҵ�� �ν��Ͻ����� ���پȵ�
	}
	
	void instance_static() {
		System.out.println(base); //�ν��Ͻ� �޼ҵ�� Ŭ�������� ���ٰ���
	}
	
}
	
public class CalEx {

	public static void main(String[] args) {
		
		Calculator c1 = new Calculator();
		c1.setOprands(10,20);
		c1.sum(); //30

		System.out.println(c1.PI); 
		System.out.println(Calculator.PI); //Ŭ���� ����
		
		Calculator.base = 10;
		c1.sum(); //40
		
		Calculator.sum2(10, 20); //30 //Ŭ���� �޼ҵ�
		
		//
		c1.sum2(10,20); //�ν��Ͻ�->Ŭ�����޼ҵ� ���ٰ���
		//Calculator.sum(); //Ŭ����->�ν��Ͻ��޼ҵ� ���ٺҰ���
		//Calculator.setOprands(10,20);
		Calculator.sum2(10, 20); //Ŭ����->Ŭ�����޼ҵ� ���ٰ���
		
		
	}

}
