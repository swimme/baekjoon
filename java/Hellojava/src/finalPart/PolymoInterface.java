package finalPart;

//������ -3. �������̽��� ������
interface In {}
class CCb implements In {}

interface In2 {
	public String A();
}

class DD implements In, In2{
	public String A() {return "";}
}

public class PolymoInterface {
	public static void main(String[] args) {
		In inCl = new CCb();
		//Ư���������̽� �����ϴ� Ŭ������ 
		//������Ÿ���� �� �������̽��� �ν��Ͻ�ȭ �� �� �ִ�.

		//���� ����� �����Ǵ� �������̽��� Ư¡����ϸ�,
		DD objd = new DD();
		In objdi = new DD();
		In2 objdi2 = new DD();
		
//		objdi.A(); //������Ÿ���� In�̹Ƿ� 
		objdi2.A();
		//������Ÿ���� In���� �Ѵٴ� ����
		// �ν��Ͻ��� �ܺο��� ������ �� �ִ� ������ġ�� In�� ����� �����Ѵٴ� ��
		// �̷��� �Ͽ� �ϳ��� Ŭ������ �پ��� ���¸� ��� �� �� �ִ�.
	}

}
