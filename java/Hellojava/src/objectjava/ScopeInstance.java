package objectjava;

//[4. ��ȿ���� -2 ]
class C {
	int v = 10; //��������
	
	void m() {
		int v = 20; //��������
		System.out.println(v); //20
		System.out.println(this.v); //10
		//this�� ��ü������ �ν��Ͻ� �ڽ��� ��Ī
		//calEx�� setOprandsȮ��
		// cf. ǥ��
	}
	
}

public class ScopeInstance {

	public static void main(String[] args) {
		C c1 = new C(); //��ü����; �ν��Ͻ� c1
		c1.m(); //20; ����v ; ���������� �켱������ �� ����..
				//cf. �ν��Ͻ��� �ν��Ͻ� �޼ҵ�
			//���⼭ this.v�� c1�� v��� ��; �� class�� v; ��������
		
		//������ ���������� ��ø Ȱ��: ����Ʈ�� �������� �ΰ� �ٲٴ� ��츦 �������� �Ѽ��ִ�.
	}

}

//���� _ �ν��Ͻ� �޼ҵ�� Ŭ�����޼ҵ� ���� �ٽ�. ; static�� �ǹ�

//cf. �������⿡�� ���������� ���� ���� not preferred ;���ļ� �߻��Ҽ��ִ� ����
//re

