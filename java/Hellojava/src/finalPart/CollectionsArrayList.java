package finalPart;
//[Collections Framework]
//������ �迭�� ũ���� �������� �ؼҰ���
/* �˰���, �ڷᱸ���� Ȱ�� */

//-1. ArrayList
import java.util.ArrayList;

public class CollectionsArrayList {
	public static void main(String[] args) {
		
		//���� �迭
		String[] arrayObj = new String[2];
		arrayObj[0] = "one";
		arrayObj[1] = "two";
//		arrayObj[2] = "three";		
		
		for (int i = 0; i <arrayObj.length; i++) {
			System.out.println(arrayObj[i]);
		}
		
		//ArrayList - �����Ҵ�
//		ArrayList a1 = new ArrayList();
//		a1.add("one");
//		String val = a1.get(1); //������ ���� ������Ÿ�� �� �� ���� ����
//		String val = (String)a1.get(1); //����ȯ�ʿ�
		
		ArrayList<String> a1 = new ArrayList<String>(); //���׸�������Ͽ� ������Ÿ������
		a1.add("one");
		a1.add("two");
		a1.add("three");
		
		//.get(�ε���) 
		for (int i = 0; i <a1.size(); i++) {
			String val = a1.get(i);
			System.out.println(val);
		}
		
	}
}

/* Collection & Map
(Collection : Set - List - Queue)
*/