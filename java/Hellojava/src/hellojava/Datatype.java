package hellojava;

public class Datatype {

	public static void main(String[] args) {
	  //1. ������ Ÿ�� ������ for �޸� ���� 
		// ������ ���� ; byte < short < int(4) < long
		// �Ǽ��� ������; float < double(8) ; ����Ʈ double���
		// ������ ������; char(2)
		
		// ����� ������ Ÿ�� (��� : ������ �ʴ� �� )
		int a = 1; //����� 1 (ex. 3���ιٲ� �� ����)
		
//		float c = 2.2; (x) ����� ������Ÿ���� double
		double b = 2.2; 
		float c = 2.2F; // ����� ������Ÿ���� float�� ���Ƿ� ��ȯ
		
//		int d = 2147483648; (x) int�� �������
//		long d = 2147483648; (x) ������ ����� ������ Ÿ���� int
		long d = 2147483648L; //����� ������Ÿ���� long���� ��������� ��ȯ
		   //cf. byte�� short�� ���ؼ��� int�� ��������� �����
		
		
	  //2. �ڵ� ����ȯ; �ڹ��� ��� 
		double e = 3.0F; // double�� ������ floatŸ�� ���� ������ 
		//= float�� �ڵ����� doubleŸ������ ����ȯ; double�� float���� �� ������ǥ�������ϱ� ����
		// ��, ǥ������ ��->���� ������Ÿ�������� ��ȯ �����ϴ�
		// /byte-> short, char -> int -> long ->/ float -> double
		int n1 = 3;
		float n2 = 1.0F;
		double sum = n1+n2; // ����i + �Ǽ�f -> �Ǽ�f + �Ǽ�f => �Ǽ�d
		
	  //3. ����� ����ȯ
//		float a = 100.0; (x)
		float f1 = 100.0F;
		float f2 = (float)100.0;
		int i1 = (int)100.0F;
		
		
		
		
	  //3. ������ Ÿ�� ����� ��ȯ
		
	}

}
