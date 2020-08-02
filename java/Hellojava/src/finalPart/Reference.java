package finalPart;
//[����]
// ������ ������ �����ϴ� ���̰� 
// ������ �ɺ��� ��ũ Ȥ�� �ٷΰ��⸦ ����� �Ͱ� ����ϴ�
// 	������ �����Ǹ� �ɺ��� ��ũ���� �� ������ �ݿ��Ǵ� �Ͱ� ���� ȿ��
//  �ɺ��� ��ũ�� ���� ���� ������ ���� ���Ͽ� ���� �ּ� ���� ��� �ִ�
class Aref {
	public int id;
	Aref(int id) {
		this.id = id;
	}
}

public class Reference {

	public static void runValue() {
		int a = 1;
		int b = a;
		b = 2;
		System.out.println("runValue, " + a);
	}
	
	public static void runReference() {
		Aref a = new Aref(1);
		Aref b = a; // *** ���� b�� ����a�� ��� �ν��Ͻ��� ���� ������; a�� b�� ���� �ν��Ͻ��� ������
		b.id = 2; // = b�� id�� �ٲٸ� a�� id�� �ٲ��
		System.out.println("runReference, " + a.id);
	}
	
	public static void main(String[] args) {
		runValue(); //1
		runReference(); //2
	}

}
//�⺻ ���������� ������������ (new�� ���� ��ü,String����)
