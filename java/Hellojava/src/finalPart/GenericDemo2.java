package finalPart;

// ������ ���׸�
/*
 class EmployeeInfo {
	public int rank;
	EmployeeInfo(int rank) { this.rank = rank; }
}
*/

//T,S�δ� ����������Ÿ�Ը� �� �� �ִ�!
class PersonGG<T,S> {
	public T info;
	public S id;
	PersonGG(T info, S id) {
		this.info = info;
		this.id = id;
	}
	
	//2. �޼ҵ忡�� ���밡��
	public <U> void printInfo(U info) {
		System.out.println(info);
	}

}

public class GenericDemo2 {

	public static void main(String[] args) {
//		PersonGG<EmployeeInfo, int> p1 = new PersonGG<EmployeeInfo, int>(new EmployeeInfo(1), 1); //����������Ÿ�Ը�

		EmployeeInfo e = new EmployeeInfo(1);
		Integer i = new Integer(10);
		//�⺻������Ÿ���� ����������Ÿ������ ��ȯ: wrapper class
		PersonGG<EmployeeInfo, Integer> p1 = new PersonGG<EmployeeInfo, Integer>(e, i);
		System.out.println(p1.id.intValue());
		
		//2. �޼ҵ� (return���� EmployeeInfo���� ���)
		p1.<EmployeeInfo>printInfo(e);
		p1.printInfo(e); //��������
		
		PersonGG p2 = new PersonGG(e, i); //���� �ڵ�� e�� i�� ������Ÿ�Ծ˰������Ƿ� ��밡��
	}

}
