package finalPart;
//-2. List와 Set
//List 중복허용ㅇ 저장되는 순서유지ㅇ
//Set은 중복허용x 순서x?

import java.util.ArrayList;
import java.util.HashSet;

import java.util.Iterator;

public class CollectionsListNSet {

	public static void main(String[] args) {
		//List
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("one");
		a1.add("two");
		a1.add("two");
		a1.add("three");
		a1.add("three");
		a1.add("four");
		a1.add("five");
		System.out.println("array");
		
        //Iterator: 컬렉션에 저장된 요소들을 읽어올 수 있게 해주는 인터페이스
        //has Next와 next메소드 + remove
		Iterator ai = a1.iterator(); 
		while(ai.hasNext()) { //hasNext: 반복할 데이터가 더 있으면  true 없으면 false
			System.out.println(ai.next());
		}
		
		//Set
		HashSet<String> hs = new HashSet<String>();
        hs.add("one");
        hs.add("two");
        hs.add("two");
        hs.add("three");
        hs.add("three");
        hs.add("five");
        System.out.println("\nhashset");
        
        Iterator hi = hs.iterator();  
        while(hi.hasNext()){ 
            System.out.println(hi.next());
        }
	}

}
