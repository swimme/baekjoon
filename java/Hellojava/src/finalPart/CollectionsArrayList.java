package finalPart;
//[Collections Framework]
//정적인 배열의 크기의 불편함을 해소가능
/* 알고리즘, 자료구조에 활용 */

//-1. ArrayList
import java.util.ArrayList;

public class CollectionsArrayList {
	public static void main(String[] args) {
		
		//기존 배열
		String[] arrayObj = new String[2];
		arrayObj[0] = "one";
		arrayObj[1] = "two";
//		arrayObj[2] = "three";		
		
		for (int i = 0; i <arrayObj.length; i++) {
			System.out.println(arrayObj[i]);
		}
		
		//ArrayList - 동적할당
//		ArrayList a1 = new ArrayList();
//		a1.add("one");
//		String val = a1.get(1); //컴파일 오류 테이터타입 알 수 없기 때문
//		String val = (String)a1.get(1); //형변환필요
		
		ArrayList<String> a1 = new ArrayList<String>(); //제네릭스사용하여 데이터타입지정
		a1.add("one");
		a1.add("two");
		a1.add("three");
		
		//.get(인덱스) 
		for (int i = 0; i <a1.size(); i++) {
			String val = a1.get(i);
			System.out.println(val);
		}
		
	}
}

/* Collection & Map
(Collection : Set - List - Queue)
*/