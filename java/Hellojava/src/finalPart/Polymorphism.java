package finalPart;

// [������]
// �ϳ��� �޼ҵ�/Ŭ������ �پ��� ������� �����ϴ� ��
// Ű������ Ű - �����: ������ / ESC: ���, Enter: ����

//overloading�� ������
// :���� �̸������� ���� �ٸ� ���۹��(����)�� ����
class Oo {
	public void a (int param) {}
	public void a (String param) {}
}

//Ŭ������ ������
class AA {
	public String x() { return "A.x";}
}

class BBc extends AA { 
	public String x() { return "B.x"; } //AA�� �޼ҵ带 overriding
	public String y() { return "y"; }
}

public class Polymorphism {
	
	public static void main(String[] args) {
		AA obj = new BBc();
		//Ŭ���� BB�� ���������� Ŭ���� AA
		//AA�� "����ϹǷ� ������������ ���� �� �ִ�".
		
		obj.x();
//		obj.y(); //����
		
		//Ŭ���� BB�� ���������� Ŭ���� AA�� �ϸ� ��ġ Ŭ���� AA�ΰ�ó�� �����ϴ� ��!
		
		System.out.println(obj.x()); // B.x
		
		//������ Ŭ���� BB�� �⺻�� ������ �״�� ����
		// AA�� ����Ͽ� override�� �޼ҵ�� �� �޼ҵ带 ���
		
		//��, BB�� AA������Ÿ������ �ν��Ͻ�ȭ�ϸ� AA�� ������� �ش� BB�� ����� ������
		// BB���� "�������̵��� ����� �������̵��� ���۹��"�� ������
		
		BBc obj2 = new BBc();
		obj2.y();
		
	}
	
}
