package hellojava;

public class ConditionIf {

	public static void main(String[] args) {
		
		String id = args[0]; //�Է°�(�� ������ ù�Է°�)�� id��� ���ڿ������� ����
		String pw = args[1];
		
		if (id.equals("soong")) {
			if (pw.equals("hehe")) {  //���ڿ��񱳴� == ���� .equals
				System.out.println("right");
			} else {
				System.out.println("pw wrong");
			}
		} 
		
		
		else {
			System.out.println("id wrong");
		}
	
	}
	//else if () {
}
