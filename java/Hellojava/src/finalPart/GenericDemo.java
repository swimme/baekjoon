package finalPart;

//코드중복을 제거하고 타입 안전성을 위한 Generic
class StudentInfo {
	public int grade;
	StudentInfo (int grade) { this.grade = grade; } //생성자
}

class EmployeeInfo {
	public int rank;
	EmployeeInfo (int rank) { this.rank = rank; }
}

//1. StudentPerson과 EmployeePerson 같은 구조이므로 중복제거가능
/* 
class StudentPerson {
	public StudentInfo info;
	StudentPerson(StudentInfo info) { this.info = info; } 
	//생성자의 인자인 info의 데이터타입 StudentInfo
	//인자의 info를 StudentPerson의 info로 대입
}

class EmployeePerson {
	public EmployeeInfo info;
	EmployeePerson(EmployeeInfo info) { this.info = info; }
}
*/

//2. 타입 안정성
/*
class PersonG {
	public Object info;
	PersonG (Object info) { this.info = info; }
}
//type이 안전하지 않다: 즉 모든 타입이 올 수 있기 때문에 타입을 엄격하게 제한 할 수 없게 되는 것
*/

class PersonG<T> {
	public T info;
	PersonG(T info) { this.info = info; }
}

public class GenericDemo {

	public static void main(String[] args) {
		/*
		 * 1.
		StudentInfo si = new StudentInfo(2); //si.grade = 2
		StudentPerson sp = new StudentPerson(si); //sp.info = si
		System.out.println(sp.info.grade); //2
		
		EmployeeInfo ei = new EmployeeInfo(1); //ei.rank = 1
		EmployeePerson ep = new EmployeePerson(ei); //ep.info = ei
		System.out.println(ep.info.rank); //1
		*/
		
		/*
		 * 2.
		PersonG p1 = new PersonG("부장");  
		//컴파일에러 발생x : PersonG의 info에 모든 데이터타입이 올수있다고 선언했기 때문: p1의 info는 "부장"
		//여기까진 컴파일,런타임에러 모두발생x but 코드취지x (studentinfo, employeeinfo모두 class형)
		
		EmployeeInfo ei = (EmployeeInfo)p1.info;
		//**형변환해줘야함** : Object로 선언된 info를 EmployeeInfo라는 구체적데이터타입으로 대입할때 
		//컴파일에러 발생x 런타임에러 발생 : 현재p1.info는 String타입 / EmployeeInfo는 (class)형
	
		System.out.println(ei.rank);
		*/
		
		PersonG<EmployeeInfo> p1 = new PersonG<EmployeeInfo>(new EmployeeInfo(1));
		EmployeeInfo ei1 = p1.info; //p1.info를 ei1에 대입
		System.out.println(ei1.rank); //1
		
		PersonG<String> p2 = new PersonG<String>("부장");
		String ei2 = p2.info; //ei2 == "부장"
//		System.out.println(ei2.rank); //오류 
		System.out.println(ei2);
	}
}


