package objectjava;

//[8.override]
// ����Ŭ�������� ����Ŭ������ �޼ҵ带 ����� �ܿ�; ������

//* ����Ŭ���� Inherit��Ʈ�� Cal 
class SubstractionableCal extends Cal {
	
	//����Ŭ������ sum�޼ҵ带 override
	public void sum() {
		System.out.println("��������"+(this.left+this.right)+"�Դϴ�");
	}
	
	//0. �����߻����
//	public int avg() {
//		return(this.left+this.right)/2;
//	}
	
	// 1. override ��������  
	// : return type, params(��, type, ����)�� ��������Ŭ���� ���ƾ��� = ������ ��ġ
	
	// 2. ����Ŭ������  ���� �ڵ��� �ߺ���������?
//	public int avg() {
//		return *super.avg()*;
// 		�߰�����
//	}
}

public class Overriding {

	public static void main(String[] args) {

	}

}
