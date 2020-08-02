package finalPart;

// 복수의 제네릭
/*
 class EmployeeInfo {
	public int rank;
	EmployeeInfo(int rank) { this.rank = rank; }
}
*/

//T,S로는 참조데이터타입만 올 수 있다!
class PersonGG<T,S> {
	public T info;
	public S id;
	PersonGG(T info, S id) {
		this.info = info;
		this.id = id;
	}
	
	//2. 메소드에도 적용가능
	public <U> void printInfo(U info) {
		System.out.println(info);
	}

}

public class GenericDemo2 {

	public static void main(String[] args) {
//		PersonGG<EmployeeInfo, int> p1 = new PersonGG<EmployeeInfo, int>(new EmployeeInfo(1), 1); //참조데이터타입만

		EmployeeInfo e = new EmployeeInfo(1);
		Integer i = new Integer(10);
		//기본데이터타입을 참조데이터타입으로 변환: wrapper class
		PersonGG<EmployeeInfo, Integer> p1 = new PersonGG<EmployeeInfo, Integer>(e, i);
		System.out.println(p1.id.intValue());
		
		//2. 메소드 (return값이 EmployeeInfo임을 기억)
		p1.<EmployeeInfo>printInfo(e);
		p1.printInfo(e); //생략가능
		
		PersonGG p2 = new PersonGG(e, i); //위의 코드로 e와 i의 데이터타입알고있으므로 사용가능
	}

}
