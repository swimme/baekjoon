package objectjava;

//[9.overload]
// "���� �̸�"������ "�ٸ� ����"������ �޼ҵ� ������ �����ϴ� ���

// ex. ������ ����ϱ⵵ �ϴ� ����
class overloadCalculator {
	int left, right;
	
	// *�߰�������������*
	int third = 0;
	
	public void setOprands(int left,int right) {
		this.left = left;
		this.right = right;
	}
	
	public void setOprands(int left,int right, int third) {
//		this.left = left;
//		this.right = right; 
		
		//***�ߺ����Ű���!***
		this.setOprands(left, right);
		
		this.third = third;
	}
	
	public void sum() {
		System.out.println(this.left + this.right + this.third);
	}
}

//�����ε� Part2. - ��Ģ
public class Overloading {
	
	void A() {}
	void A(int arg1) {}
	void A(String arg1) {}
//	int A() {}
	// ���� �̸��̸鼭 �Ű����������� ������ return���� �ٸ� ��� - �����߻�
	// cf. �޼ҵ��� ��ȯ���� �޼ҵ带 ȣ���ϴ� �������� ���޵��� �ʴ� �����̱� ������ �����ε��� ����� �� �� ����.
	
	public static void main(String[] args) {
		Overloading od = new Overloading();
		od.A();
		od.A(1);
		od.A("hi");
	}
}
//�����ε� part3 - ��ӿ��� (vs.�������̵�)
public class Overloading2 extends Overloading{
	void A (String arg1, String arg2) {} //�������� �ñ״�ó���������޼ҵ� ����; �����ε� 
	void A () {} //���������� ���� ; �������̵�
	
	public static void main(String[] args) {
		Overloading2 od = new Overloading2();
		od.A();
		od.A(1);
		od.A("hi");
		od.A("hi","sy");
	}
}

//class�� ��ü���� main�ܳ��� re
// cf. �ڱ��ڽ��� �ν��Ͻ�ȭ��Ų��� [InheritConstructor����] vs. ���� ����

