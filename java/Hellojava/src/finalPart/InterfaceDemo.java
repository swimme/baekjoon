package finalPart;

//[4. �������̽�]
// � ��ü�� Ư�� '�������̽��� ���'�Ѵٸ�,
// �� ��ü�� �ݵ�� '�������̽��� �޼ҵ���� "����"�ؾ�' �Ѵ�.
//���� Ŭ������ Ư���� �޼ҵ尡 �ݵ�� �����ϵ��� ����

interface I {
	public void z();
}

//implements
class Any implements I {
	public void z() {} //
}

public class InterfaceDemo {
	public static void main(String[] args) {
	}
}

//���û�Ȳ:
// ���� Ŭ������ ������ A�� �����, ������ B�� �� Ŭ������ ����ϴ� ������ �����
//�����Ѹ��� �� Ŭ������ ������ �־�� �� �޼ҵ带 �������̽��� ���� �����ϴ� ��
interface Calculatable {
    public void setOprands(int first, int second, int third) ;
    public int sum(); 
    public int avg();
}

//�������̽��� �̿��� ����
//�������̽��� �̿��ؼ� ���ΰ� ������ �޼ҵ带 ���鵵�� �Ծ��� ���� 


//�ϳ��� Ŭ������ ���� �������̽��� ������ �� �ִ�
//�������̽������� ����� �ȴ�
//�������̽��� ����� �ݵ�� public


//cf.�߻�ȭ���� ���̱���
