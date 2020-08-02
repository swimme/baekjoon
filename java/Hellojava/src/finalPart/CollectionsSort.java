package finalPart;
//-5. 정렬
//컬렉션 사용이유 중 하나 
//sort - List정렬메소드 api
import java.util.*;

class Computer implements Comparable { //sort사용위해 Comparable 인터페이스 구현필요
	int serial;
	String owner;
	
	//생성자
	Computer(int serial, String owner) {
		this.serial = serial ;
		this.owner = owner;
	}
	
	//구현해야하는 compareTo (비교대상)
	public int compareTo(Object o) {
		return this.serial - ((Computer)o).serial; //serial로 비교
		// a.compareTo(b)
		// 현재객체.compareTo(비교대상)
		// 현재객체 - 비교대상: 양수, 0 , 음수
	}
	
	//값 반환
	public String toString() {
		return serial + "" + owner;
	}
}

public class CollectionsSort {

	public static void main(String[] args) {
		//1. Computer형을 담는 ArryList 
		List<Computer> computers = new ArrayList<Computer>();
		computers.add(new Computer(500,"egoing"));
		computers.add(new Computer(200,"sooyoung"));
		
		//2. 열거
		Iterator i = computers.iterator();
		System.out.println("before");
		while(i.hasNext()) {
			System.out.println(i.next()); //추가한 순서대로 
		}
		
		//3. 정렬 sort - List형식 지원
		// implements Comparable선언
		Collections.sort(computers);
		
		System.out.println("\nafter");
		i = computers.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
