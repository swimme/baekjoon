package hellojava;
//sysout �Է��� �� Ctrl + Space �ϸ� System.out.println();

public class Operator {

	public static void main(String[] args) {
		// 1. ������Ÿ�Կ� ���� ���� ��°� ����
		int a = 10;
		int b = 3;
		double div = a/b;
		System.out.println(a/b); // 3 ; ���������
		System.out.println(div); //3.0 ; �����Ŀ� ���������� ��ȯ
		
		float c = 10.0F;
		float d = 3.0F;
		System.out.println(c/d); // 3.33333 ; �Ҽ������
		
		System.out.println(a/d); // 3.33333 ; ����->�Ǽ��� �ڵ���ȯ
	
		// 2. ���� ������  ++ /--
		int i = 3;
		i++;
		System.out.println(i); //4
		++i;
		System.out.println(i); //5
		
		System.out.println(i++); //5  ***i����� ++
		System.out.println(i); //6 
		
		System.out.println(++i); //7 ++�ϰ� ���	
		
		// 3. �񱳿����� == , != , >= 
		
		
		// ���ڿ��񱳴� .equals �޼ҵ�
		String s1 = "ksj";
		String s2 = "mogu";
		System.out.println(s1.equals(s2));
		
		// 4. �������� &&, �Ӥ� , !
	}

}
