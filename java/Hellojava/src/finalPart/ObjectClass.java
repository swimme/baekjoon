package finalPart;

// [�⺻���� objectŬ����]
class o {}
//= class o extends Object {}

//-1. toString: ��ü�� ���ڷ� ǥ���ϴ� �޼ҵ�
//System.out.print�� ȣ���ϸ� �ڵ����� toString�� ȣ��ǵ��� ��ӵǾ� �ִ�.
class CalculatorObject extends Calculator {
	//������
	public String toString(){
		return "left : " + this.left + ", right : "+ this.right;
	}	
}

//-2. equals: ��ü�� ��ü�� ���� �������� ��api
class Student {
	String name;

	Student(String name) { //�ڱ��ڽ��� �ν��Ͻ�ȭ�ϴ� ������. ����?
		this.name = name;
	}

	public boolean equals(Object obj) {
		Student _obj = (Student)obj;
		//�޼ҵ� equals�� ���޵� obj�� ������ Ÿ���� Object�̱� ������ 
		//�̸� Student Ÿ������ �� ��ȯ�ϴ� �ڵ�
		return name == _obj.name;
	}
}

//-3. finalize: ��ü�� �Ҹ�� �� ȣ��Ǳ�� ����� �޼ҵ�
// not preferred
/// ������ �÷���
//(garbage collection)
/// ���� ȿ�������� ����ϱ� ���ؼ� �� �̻� ������� �ʴ� �����͸� ������ �����ϵ��� �ڵ�ȭ �� ��
//https://d2.naver.com/helloworld/1329

//-4. clone: � ��ü�� ���� �� �� ��ü�� �Ȱ��� ��ü�� �������ִ� ���
class Studentwo implements Cloneable{
	String name;
	Studentwo(String name){
		this.name = name;
	}
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}

public class ObjectClass {
	public static void main(String[] args) {
		//
		Calculator c = new Calculator();
		c.setOprands(10,20);
		System.out.println(c);

		CalculatorObject c1 = new CalculatorObject();
		c1.setOprands(10, 20);
		System.out.println(c1.toString());
		System.out.println(c1);

		//
		Student s1 = new Student("egoing");
		Student s2 = new Student("egoing");
		System.out.println(s1 == s2); //false; ���� �ٸ� ��ü
		System.out.println(s1.equals(s2)); //true; ���� ��ü��

		//
		Studentwo st1 = new Studentwo("soo");
		try {
			Studentwo st2 = (Studentwo)st1.clone();
			System.out.println(st1.name);
			System.out.println(st2.name);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
