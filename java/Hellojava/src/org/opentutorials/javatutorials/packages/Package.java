package org.opentutorials.javatutorials.packages;

//�ٸ� ��Ű���� Ŭ���� ����ϱ����� ����
//*��� Ŭ����  or specify����
import objectjava.*;

//[11.��Ű��]
// ������ �̸��� ���� �ٸ� Ŭ������ ����ϱ� ���� ���

//C:\Users\soo\Desktop\java\Hellojava\src\org\opentutorials\javatutorials\packages\Package.java	
// ������Ʈ���丮(\Hellojava)
// �ҽ��ڵ�������丮(src)
// Ŭ����������丮(\org~\object) ; ��Ű���̸��� ����; ���丮����
//cf. ��Ű���̸� - �Ҽ��̳� �����κ����� �Ųٷ� 
public class Package {

	public static void main(String[] args) {
		A a = new A(); //���� ��Ű���� Ŭ������� import������� ����
		B b = new B(); // AŬ���������� BŬ���� ��밡�� 
		
		Classpath c = new Classpath(); 
		CalEx d = new CalEx(); // �����̸���(��Ű�������ִ� Ŭ�������� �ε��ϴ� ���̹Ƿ�!)
		//�ٸ� ��Ű���̸� CalEx�� class Calculator�� ���Ұ�...!
//		Calculator cal = new Calculator();
		
		//����: �ٸ� ��Ű���� only public(in its own file) Ŭ������ �ε尡��
		//	      ���� ��Ű���� ��� Ŭ���� �ε尡��
	}
}

//Part2. cmdâ
//src : �ҽ� �ڵ尡 ����ִ�. - for human
//bin : �����ϵ� Ŭ���� ������ ����ִ�. - for computer(binary)

//javac�� �ϸ� �����ϵ� Ŭ���������� �ش���Ű�����丮(�ҽ��ڵ��ִµ��丮)���� �����ȴ�.
//bin������ ���Բ��Ϸ��� 
// javac src\org\opentutorials\javatutorials\packages\A.java -d bin


//Part3. import�� ��Ű�� ���� ���� �̸��� Ŭ������ ����ϰ� ������
//	org.opentutorials.javatutorials.objectjava.A ex = new org.opentutorials.javatutorials.objectjava.A();
