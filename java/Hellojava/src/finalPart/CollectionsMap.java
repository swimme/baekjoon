package finalPart;
//[-4. Map]
//key�� value�� ������ ���� �����ϴ� �÷���. ��ųʸ������ų�
// �ϴ��ϴ���: key����->value����
import java.util.*;

public class CollectionsMap {
	public static void main(String[] args) {
		HashMap<String, Integer> a = new HashMap<String, Integer>();
		
		//������Ÿ�Ա�ü - ����
		Map<String, Integer> a1 = new HashMap<String, Integer>();
		
		//������ �߰� put (key, value)
		a.put("one", 1);
		a.put("two", 2);
		
		//������ ���� get (key)
		System.out.println(a.get("one"));
		System.out.println(a.get("two"));
		
		iteratorUsingForEach(a);
		iteratorUsingIterator(a);
	}

	//Map ����ȵ����� ����
	static void iteratorUsingForEach(HashMap map) {
		
		//entrySet: Map�� ������ ��� Set��ȯ 
		//(�ϴ��ϴ������� �����ϸ� �� set���� ��ȯ�ϴ� �� �����ϱ� ����)
		//(Map��ü�� iterator����� ���� �����̱⵵ ��)
		
			//Set�� ���� ������Ÿ���� Map.Entry....
		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		
		//forEach�� �� entries���� entry�� 
		for (Map.Entry<String, Integer> entry: entries) {
			System.out.println(entry.getKey() + ":" + entry.getValue() );
		}
	}
	
	static void iteratorUsingIterator(HashMap map) {
		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		
		//Iterator���
		Iterator<Map.Entry<String, Integer>> i = entries.iterator();
		
		while(i.hasNext()) {
			//������ entry�� ����
			Map.Entry<String, Integer> entry = i.next();
			System.out.println(entry.getKey() + ":" + entry.getValue() );
		}
	}
	
}
