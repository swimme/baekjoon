package finalPart;
//[-4. Map]
//key와 value의 쌍으로 값을 저장하는 컬렉션. 딕셔너리같은거네
// 일대일대응: key집합->value집합
import java.util.*;

public class CollectionsMap {
	public static void main(String[] args) {
		HashMap<String, Integer> a = new HashMap<String, Integer>();
		
		//데이터타입교체 - 참고
		Map<String, Integer> a1 = new HashMap<String, Integer>();
		
		//데이터 추가 put (key, value)
		a.put("one", 1);
		a.put("two", 2);
		
		//데이터 추출 get (key)
		System.out.println(a.get("one"));
		System.out.println(a.get("two"));
		
		iteratorUsingForEach(a);
		iteratorUsingIterator(a);
	}

	//Map 저장된데이터 열거
	static void iteratorUsingForEach(HashMap map) {
		
		//entrySet: Map의 데이터 담는 Set반환 
		//(일대일대응관계 생각하면 왜 set으로 반환하는 지 생각하기 쉬움)
		//(Map자체는 iterator기능이 없기 때문이기도 함)
		
			//Set의 값의 데이터타입은 Map.Entry....
		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		
		//forEach문 각 entries들을 entry로 
		for (Map.Entry<String, Integer> entry: entries) {
			System.out.println(entry.getKey() + ":" + entry.getValue() );
		}
	}
	
	static void iteratorUsingIterator(HashMap map) {
		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		
		//Iterator사용
		Iterator<Map.Entry<String, Integer>> i = entries.iterator();
		
		while(i.hasNext()) {
			//각각을 entry로 담음
			Map.Entry<String, Integer> entry = i.next();
			System.out.println(entry.getKey() + ":" + entry.getValue() );
		}
	}
	
}
