package finalPart;

//final- ���/������ �����ϴ� ���� 
//abstract-����� ����

class Fined{
	static final double PI = 3.14; //-1 final �ʵ�(����)
	//static..?
	
	final void b() {} //-2 final �޼ҵ�
}

class Using extends Fined {
//	void b() {} //final �޼ҵ� b ��ӺҰ�
}

final class C {
	void f() {}
}

//class D extends C {} //final Ŭ���� ��ӺҰ�


public class FinalDemo {

	public static void main(String[] args) {

	}

}
