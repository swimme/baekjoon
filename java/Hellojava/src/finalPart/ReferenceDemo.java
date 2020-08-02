package finalPart;

public class ReferenceDemo {

	static void _value(int b) { 
	//default static void: ���� ��Ű��������; ���� default ���� public������ �򰥸��� rere
		b = 2;
	}
	
	//*************
	public static void runValue() {
		int a= 1;
		_value(a); 
		//1. int�� a�� ����  2�� �ٲ۴�? �ƴ�
		// == int b = a; b = 2; 
		// �º��� �캯�� ����! b�� �����ǰ�, �� ���� a�� �����ϰ� �ٽ� ���� 2�� �ٲ۰��ϻ�
		
		System.out.println("runValue, " +a); //1
	}
	//*************

	static void _reference1(Aref b) {
//		System.out.println(b.id); // 1
		b = new Aref(2); 
	}
	
	public static void runReference1() {
		Aref a = new Aref(1); // ���� ������Ÿ�� A -> Instance (id = 1)
		_reference1(a); 
		//2. Aref�� a�� �ν��Ͻ��� id�� 2�� ���ο� �ν��Ͻ��� �ٲ۴�? �ƴ�

		// == Aref b = a; b = new A(2);
		// Aref���� b�� �����ǰ�, a�� ���� �ν��Ͻ��� �����ϰ� �ߴٰ�; �ٽ� ���ο� id�� 2�� �ν��Ͻ��� �����ϰ� �ϴ°�!
		//a���� ������ ����. b�� �ٲ�� ��
		
		
		//����������Ÿ��(a)�� �Ű������� ����; reference1�ȿ��� "�Ű����� b"�� �ٸ� �ν��Ͻ��� ����
		System.out.println("runReference1, " + a.id); //1
	}
	
	static void _reference2(Aref b) {
		b.id = 2;
	}
	
	public static void runReference2() {
		Aref a = new Aref(1);
		_reference2(a); 
		//3. Aref�� a��  �ν��Ͻ��� id�� 2�� �ٲ۴�?
		// == Aref b = a; b.id = 2;
		// Aref���� b�� �����ǰ�, a�� ���� �ν��Ͻ��� �����ϰ� �Ѵ�; b�� �����ϴ� �� �ν��Ͻ��� id��  2�� �ٲ۴�
		//a�� b�� ���� �ν��Ͻ��� �����ϹǷ� a���� �ݿ�

		//(a�� b�� ��� ���� ��ü�� �����ϰ� �ִ� ������)
		
		System.out.println("runReference2, " + a.id);
	}
	
	public static void main(String[] args) {
		runValue(); //1
		runReference1(); //1
		runReference2(); //2
	}

}

/*
 * A a = new A(1);
 * A b = new A(1);
 * b.id = 2; (a�ʹ� ���谡 ����.)
 * System.out.println(a.id); -> 1 ���
 * 
 * �� ���� ���� �ٸ� instance �ּҸ� �����ϰ� �˴ϴ�.
 *  ���⼭ 'new'�� ���� ��ǻ�ʹ� ���ο� instance�� ���� �޸� ������ Ȯ���ϰ� �˴ϴ�. 
 *  �� a�� b�� �ٸ� instance �ּҸ� �����ϰ� �Ǵ� ������.
 *  
 *  A b = a; -> (b�� instance A�� �޸� �ּҸ� �����Ѵ�.)
 *  b.id = 2;
 *  System.out.println(a.id); -> 2 ���
*/