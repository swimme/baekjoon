package hellojava;

// method; function; �ڵ��� ���� ����
public class Method {
	
	//numbering �޼ҵ� ���� ; �Է°��� ���� �޼ҵ�; ���� �Է°� 
	  //+**��°�** (void�ƴ� String; ��°��� ���� �ڷ���); ���ڿ��� return�ϴ� �޼ҵ�
	public static String numbering(int init, int limit) {
		
		int i = init; //cf. ���� �������� �ڵ弱��
		
		//����� output�̶�� ������ ��� ���� ���� ���� (return����)
		String output = "";
		
		while (i< limit) {
//			System.out.println(i);
			output += i; //����ϴ� ��� ���� output�� append; 1234�� ���ʷ� ����!!!
						//output = output + i
			i++;
		}
		
		// return���� ���α׷� ������ �����!!! �ܺη� ��ȯ�Ϸ��� return���� 
		return output;
	}
	
	//main�޼ҵ�(�Լ�)
	public static void main(String[] args) {
		//numbering(1, 5); //numbering �޼ҵ� ȣ��
		
		//return�� ���� ������ ��´�. (return�� ����Ǿ��־����?)
		String result = numbering(1,5);
		System.out.println(result);
		
	}

//tip �޼ҵ��ڵ� ������ �Է°��� ��°� ���� ����, �״��� ���Ǻθ� ���� �ľ��ϱ� ����
//��°����������; ���������ϰ� ���ڵ�(����������) ; �׿��� �ڷ������� ������� �ʾƵ���(�������ɼ�)
//return; �޼ҵ��� ��ǰ���μ��� ��ġ 
	//ȭ������� �ƴ� ���ϱ��or����÷�α���� ��� ; ���/���/����÷�ηκ��� ����ϴ� ������ �и�!
	//�����ǰ��� ���غ���; numbering�޼ҵ� �ȿ� print������ �־���_ ��±��� ����_ ȣ���ϸ� ��µǴ� ���
}
