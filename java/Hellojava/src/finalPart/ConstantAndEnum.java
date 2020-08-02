package finalPart;

//[상수와 enum]

//-2. 상수그룹 ->인터페이스활용가능
//인터페이스에서 선언된 변수는 무조건 public static final의 속성을 가짐!
/*
interface FRUIT {
	int APPLE = 1, PEACH = 2, BANANA = 3;
}
interface COMPANY {
	int GOOGLE = 1, APPLE = 2, ORACLE = 3;
}
*/

//-3. 이 경우 오류를 컴파일중에 발견할수x ; 둘다 같은 int 등등
// class변수로 인스턴스로사용
//  각각의 변수가 final이기 때문에 불변이고, Static이므로 인스턴스로 만들지 않아도 된다. rere
/*
class Fruit {
	public static final Fruit APPLE = new Fruit();
}
class Company {
	public static final Company APPLE = new Company();
}
*/

//-4. enum 열거형: 연관된 상수들의 집합 ( 그값이 변경되지않도록 보장 )
// 코드가 단순해지고, 인스턴스 생성과 상속을 방지하며?, 열거형인 구현의도가 드러남
// 사실상 class 아래 코드와 같다 (생성자와 메소드가질 수잇음)
/* 
 class Fruit{
    public static final Fruit APPLE  = new Fruit();
    public static final Fruit PEACH  = new Fruit();
    public static final Fruit BANANA = new Fruit();
    private Fruit(){} 
    //생성자의 접근제어자가 private : 클래스를 인스턴스로 만들 수 없다는 것...?
}
 */

enum Fruit {
	/*
	APPLE, PEACH, BANANA;
	//enum의 생성자는 무조건 private ; 직접 생성할 수 없다..(?)
	Fruit() {
		System.out.println("Constructor" + this); 
	}
	*/
	
	//상수 선언하면서 동시에 생성자 호출
	/*
	APPLE("red"), PEACH("pink"), BANANA("yellow");
	
	public String color;
	Fruit ( String color ) {
		System.out.println("Constructor" + this);  //apple생성시 this는apple이되고
		this.color = color; //red(우변)은 this.color가 되어 인스턴스의 color가 된다
	}
	*/
	
	//메소드 예시
	APPLE("red"), PEACH("pink"), BANANA("yellow");
	
	private String color;
	Fruit ( String color ) {
		System.out.println("Constructor" + this);  
		this.color = color; 
	}
	
	String getColor() {
		return this.color;
	}
}

public class ConstantAndEnum {
//-1. 변수를 final로 처리하면 한번 설정된 변수의 값은 더 이상 바뀌지 않음
//또한 바뀌지 않는 값이라면 인스턴스 변수가 아니라 클래스 변수(static)로 지정하는 것이 더 좋을 것
	/*
	private final static int FRUIT_APPLE = 1;
	private final static int PEACH = 2;
	private final static int BANANA = 3;

	private final static int GOOGLE = 1;
	private final static int COMPANY_APPLE = 2;
	private final static int ORACLE = 3;
 	*/	
	public static void main(String[] args) {
		/*
		 * 1. 사과
		 * 2. 복숭아
		 * 3. 바나나
		 */
//		int type = FRUIT.APPLE; //1 //FRUIT_APPLE
		Fruit type = Fruit.APPLE;
		
		switch(type) {
//			case FRUIT.APPLE: //1 //(interface)
			case APPLE:
//				System.out.println(57 + Fruit.APPLE.color);
				System.out.println(57 + Fruit.APPLE.getColor() );
				break;
			case PEACH: //2
				System.out.println(34);
				break;
			case BANANA: //3
				System.out.println(93);
				break;
		}
		
		//-3, -4
		/*
		if (Fruit.APPLE == Company.APPLE) { //서로 다른 카테고리의 상수는 비교금지이므로
			System.out.println("");
		}
		*/
	}

}
