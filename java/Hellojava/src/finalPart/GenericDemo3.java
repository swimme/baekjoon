package finalPart;

//[���׸��� ����]
//�ν��Ͻ�ȭ�� �� �����Ǵ� ������Ÿ��
//��� ���׸����� �� �� �ִ� ���������� Ư��Ŭ������ �ڽ����� ���� - Ŭ��������̳� �������̽���

abstract class Info {
	public abstract int getLevel();
}
//abstract�߻�ȭ: ����Ͽ� ����ϵ��� ���� (��abstract�ƴϿ�����)
//interface�� implements���迡���� ��밡��

class EmployeeInfo2 extends Info {
	public int rank;
	EmployeeInfo2 (int rank) { this.rank = rank; }
	
	//getLevel����
	public int getLevel() {
		return this.rank;
	}
}

//****
// PersonE�� T�� InfoŬ������ �� �ڽ�(EmployeeInfo2)�� �� �� �ִ�.
class PersonE<T extends Info> {
	public T info;
	PersonE(T info) { 
		this.info = info;
		info.getLevel();
	}
}

public class GenericDemo3 {

	public static void main(String[] args) {
		PersonE<EmployeeInfo2> p1 = new PersonE(new EmployeeInfo2(1));
//		PersonE<String> p2 = new PersonE<String>("����"); //�����Ͽ���
	}

}
