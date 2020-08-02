package finalPart;

//�ڵ��ߺ��� �����ϰ� Ÿ�� �������� ���� Generic
class StudentInfo {
	public int grade;
	StudentInfo (int grade) { this.grade = grade; } //������
}

class EmployeeInfo {
	public int rank;
	EmployeeInfo (int rank) { this.rank = rank; }
}

//1. StudentPerson�� EmployeePerson ���� �����̹Ƿ� �ߺ����Ű���
/* 
class StudentPerson {
	public StudentInfo info;
	StudentPerson(StudentInfo info) { this.info = info; } 
	//�������� ������ info�� ������Ÿ�� StudentInfo
	//������ info�� StudentPerson�� info�� ����
}

class EmployeePerson {
	public EmployeeInfo info;
	EmployeePerson(EmployeeInfo info) { this.info = info; }
}
*/

//2. Ÿ�� ������
/*
class PersonG {
	public Object info;
	PersonG (Object info) { this.info = info; }
}
//type�� �������� �ʴ�: �� ��� Ÿ���� �� �� �ֱ� ������ Ÿ���� �����ϰ� ���� �� �� ���� �Ǵ� ��
*/

class PersonG<T> {
	public T info;
	PersonG(T info) { this.info = info; }
}

public class GenericDemo {

	public static void main(String[] args) {
		/*
		 * 1.
		StudentInfo si = new StudentInfo(2); //si.grade = 2
		StudentPerson sp = new StudentPerson(si); //sp.info = si
		System.out.println(sp.info.grade); //2
		
		EmployeeInfo ei = new EmployeeInfo(1); //ei.rank = 1
		EmployeePerson ep = new EmployeePerson(ei); //ep.info = ei
		System.out.println(ep.info.rank); //1
		*/
		
		/*
		 * 2.
		PersonG p1 = new PersonG("����");  
		//�����Ͽ��� �߻�x : PersonG�� info�� ��� ������Ÿ���� �ü��ִٰ� �����߱� ����: p1�� info�� "����"
		//������� ������,��Ÿ�ӿ��� ��ι߻�x but �ڵ�����x (studentinfo, employeeinfo��� class��)
		
		EmployeeInfo ei = (EmployeeInfo)p1.info;
		//**����ȯ�������** : Object�� ����� info�� EmployeeInfo��� ��ü��������Ÿ������ �����Ҷ� 
		//�����Ͽ��� �߻�x ��Ÿ�ӿ��� �߻� : ����p1.info�� StringŸ�� / EmployeeInfo�� (class)��
	
		System.out.println(ei.rank);
		*/
		
		PersonG<EmployeeInfo> p1 = new PersonG<EmployeeInfo>(new EmployeeInfo(1));
		EmployeeInfo ei1 = p1.info; //p1.info�� ei1�� ����
		System.out.println(ei1.rank); //1
		
		PersonG<String> p2 = new PersonG<String>("����");
		String ei2 = p2.info; //ei2 == "����"
//		System.out.println(ei2.rank); //���� 
		System.out.println(ei2);
	}
}


