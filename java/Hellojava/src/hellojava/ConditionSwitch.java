package hellojava;

public class ConditionSwitch {

	public static void main(String[] args) {
		String explain = "";
		switch(1) {
		case 1:
			System.out.println("��ȣ�� case����");
//			explain="�ٸ�����";
//			break; //break�ϸ� �ش�case�� ���
		case 2:
			System.out.println("���ʷ�");			
		case 3:
			System.out.println("���");
		default:
			System.out.println("�̰Ŵ� ��ȣ��case�� ��Ī�Ǵ� case������");
		}
		System.out.println(explain);
	}
}
