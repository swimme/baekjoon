package objectjava;

//[6.���]
//�� ��ü�� ������ �޼ҵ带 "�ٸ� ��ü�� ���� ���� �� �ִ� ���"

		//ex ��ü�� �޼ҵ带 �߰��ϴ� ���� ����� ���.
		// ���� ������ ���� �ҽ��� ��� ���ҽ� ������Ʈ�� ����� �� ����
		// �پ��� ���� Ȱ��Ǵ� ��ü�� ��� �ٸ� ������ ���ʿ�
				
		//then ���� ��ü �����ϸ� ��� �߰��ϴ� �����? ���
		// �� ������ü �������� �����鼭, *���ο� ��ü�� ������ü�� �������* �������
		// ������ ��ü�� ����� ������ = �θ�(����)��ü(Ŭ����); ���ο� ��ü�� �������� = �ڽ�(����)��ü


class Cal {
	int left, right; // Ŭ��������
	
	public void setOprands(int left, int right) {
		this.left = left; 
		this.right = right; // this�� �� Ŭ����, ��Ŭ������ right�� ����right����
	}
	
	public void sum() {
		System.out.println(this.left+this.right);
	}
	
   public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}

//���ο� Ŭ����
class Substract extends Cal{ 
	//"extends" - CalŬ����(����)�� SubstractŬ����(����)�� Ȯ��; class ���� extends ����
	// ����->����; ������ ������ Ȯ��/����Ѵ�.
	
	public void sub() {
		System.out.println(this.left-this.right);
	}
}


public class Inherit {

	public static void main(String[] args) {
		
		Substract c1 = new Substract(); //�ν��Ͻ�ȭ
		//������ CalŬ������ �޼ҵ� - "extends Cal"
		c1.setOprands(10, 20);
		//�߰��� ������ �޼ҵ� ȣ��
		c1.sub();
	}

}
