package finalPart;

//[Generic]
//Ŭ���� ���ο��� ����� ������ Ÿ���� �ܺο��� ����
// �� Ŭ������ ���� �� ���� info�� ������ Ÿ���� Ȯ������ �ʰ� 
// �ν��Ͻ��� ������ �� ������ Ÿ���� �����ϴ� ��� 

class Person<T> {
	public T info;
}

public class Generic {

	public static void main(String[] args) {
		Person<String> p1 = new Person<String> (); 
		// == public String info
		// == p1.info: String
		Person<StringBuilder> p2 = new Person<StringBuilder>();
		// == p2.info: StringBuilder
		
	}

}
