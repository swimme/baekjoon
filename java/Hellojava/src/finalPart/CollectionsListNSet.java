package finalPart;
//-2. List�� Set
//List �ߺ���뤷 ����Ǵ� ����������
//Set�� �ߺ����x ����x?

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
		
        //Iterator: �÷��ǿ� ����� ��ҵ��� �о�� �� �ְ� ���ִ� �������̽�
        //has Next�� next�޼ҵ� + remove
		Iterator ai = a1.iterator(); 
		while(ai.hasNext()) { //hasNext: �ݺ��� �����Ͱ� �� ������  true ������ false
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
