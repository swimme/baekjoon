package objectjava;

//����Ŭ������ Calculator2�� ���; �����߻�
	// Calculator2�� ���ڰ��ִ� ����������(setOprands���) & �⺻������x�̹Ƿ�
	// **** ����Ŭ������ �ν��Ͻ�ȭ��Ű�� ����Ŭ������ ������ ȣ���ϱ����� *����Ŭ������ �⺻�����ڸ� �ڵ����� ȣ��*�ϱ� ���� ****
//�ذ�1: ����Ŭ������ �⺻������ ��������� ����
//�ذ�2: super
	//�̰��, ����Ŭ������ ����Ŭ������ �ߺ��� �߻� (setOprands���)
	// ******�� Ŭ������ �����ڿ����� ���ٸ�, ����Ŭ�������� ����Ŭ������ �����ڸ� ȣ���ϵ���*******

//class Substraction extends Cal { 
class Substraction extends Calculator2 { 
	
    public Substraction(int left, int right) { //���ڰ��ִ� ������
    	super(left,right); //super();�θ�Ŭ������ ������
    						//**����Ŭ���� �������� ���� int left�� super�� left�� ���ٴ¶�**
    						//����ó������ ����
//      this.left = left;
//      this.right = right;
    }

    
    public void substract() {
        System.out.println(this.left - this.right);
    }
}

public class InheritConstructorDemo {

	public static void main(String[] args) {
	     Substraction c1 = new Substraction(10, 20); //10-> int left -> �캯left => this.left�� 10�̵�
	     //c1.setOprands(10,20);
	     c1.sum();
	     c1.avg();
	     c1.substract();
	
	}

}

//Cal(*inherit��Ʈ)
//Calculator2(*Constructor��Ʈ)


//���: �θ�Ŭ������ �⺻�����ڰ� ���� �� ����Ŭ������ �����ڿ� super�� ����Ͽ� * ����Ŭ�������� ����Ŭ������ �����ڸ� ȣ���ϵ��� �Ѵ�...re
//����: ����Ŭ������ �����ڿ��� super�ڵ尡 ������� ��Ÿ������; �θ� ���� �ʱ�ȭ�۾�




	