package finalPart;
//-3. Set

import java.util.HashSet;
import java.util.Iterator;

public class CollectionsSet {
	public static void main(String[] args) {
		HashSet<Integer> A = new HashSet<Integer> ();
		A.add(1);
		A.add(2);
		A.add(3);
		
		HashSet<Integer> B = new HashSet<Integer> ();
		B.add(3);
		B.add(4);
		B.add(5);
		
		// .containsAll - 포함관계여부
		System.out.println(A.containsAll(B)); //false
		
		A.addAll(B); //합집합 union
		A.retainAll(B); //교집합 intersect
		A.removeAll(B); //차집합 difference A-B
		
		Iterator hi = A.iterator(); 
		while (hi.hasNext()) {
			System.out.println(hi.next());
		}
		
	}

}
