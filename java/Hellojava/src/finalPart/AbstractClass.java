package finalPart;

//[2. abstract]
// Ŭ����/�޼ҵ带 ���� ����� �� ���� ����� Ŭ������ ���� ����Ͽ� ����ϵ��� �����ϴ� ��

// �߻�Ŭ����
//- �߻�޼ҵ带 �ϳ��� ������ Ŭ������ �߻�Ŭ���������Ѵ�.
//- �߻�޼ҵ� �������� ��
abstract class A {
	// �߻� �޼ҵ� 
	//�޼ҵ��� �ñ״�ó���� ���ǵ� ����ִ� �޼ҵ�
	//- ��ü�� �ִ� �޼ҵ�� abstract Ű���带 ���� �� ����.
	//���Ŭ�������� overriding �ʿ�
	public abstract int b();
	
	public void d(){
		System.out.println("world");
	}
}

//��, abstract�� ��ü���� ������ ����ϴ� �ʿ��� �ѱ��, ������ ����ϱ� ���� �ñ״�ó(����)�� �����ϴ� ��.

class B extends A {
	public int b() { //A�� �߻�޼ҵ� override
		return 1;
	}
}

public class AbstractClass {
	public static void main(String[] args) {
//		A obj = new A(); //�������Ұ�
		B obj = new B();
	}
}

