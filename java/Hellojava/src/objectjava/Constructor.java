package objectjava;

//[5.�ʱ�ȭ�� ������]
class Calculator2{ //����; ����Ű�������� �����̸��� Ŭ���������� ���� �� x
	int left, right;
	
	//***Ŭ������ �Ȱ��� �̸���*** �޼ҵ� == ������
	  //Ŭ������ �����ɶ� �ڵ����� �����̸��� �����ڰ� ����ǵ��� ��ӵǾ��ִ� (�����������ǵ���;�ʱ�ȭ�۾�)
	public Calculator2(int left, int right) { //���� ����
		this.left = left; //this=���� ; ���� = ���� (�������� set)
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left+this.right); //then set�� �������
	}
	
	public void avg() {
		System.out.println((this.left + this.right) / 2 );
	}
	
}
	
public class Constructor {	
	public static void main(String[] args) {
		//������; �ʱ�ȭ(�������غ� init)�� ��ü������ ��ü���� �ʱ�ȭ�Ҽ� �ֵ��� �����ִ� ���?
	
		//����1.
//		Calculator c1 = new Calculator();
//		c1.setOprands(10, 20);
//		c1.sum();       
//		c1.avg(); 
		//�ν��Ͻ��� ����� sum�� avg�Լ��� ���Ƿ��� ������ setOprands()����ž��ϴ� ���
		  //��, left�� right�������ִ� ����� �ʿ��� �ν��Ͻ�
		
		//����2.
		//���� ;��ü������ �� ������ �����ϵ����ϱ�
		Calculator2 c2 = new Calculator2(10, 20); //�캯�� Calculator�� �������̴�!
		c2.sum();
		c2.avg();	
	}
}
//**����: public class���� ���θ޼ҵ�� �׿ܺ� class(as ��ǰ)..�Ѵ� ��ü..
