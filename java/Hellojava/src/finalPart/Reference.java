package finalPart;
//[참조]
// 복제는 파일을 복사하는 것이고 
// 참조는 심볼릭 링크 혹은 바로가기를 만드는 것과 비슷하다
// 	원본이 수정되면 심볼릭 링크에도 그 내용이 반영되는 것과 같은 효과
//  심볼릭 링크를 통해 만든 파일은 원본 파일에 대한 주소 값이 담겨 있다
class Aref {
	public int id;
	Aref(int id) {
		this.id = id;
	}
}

public class Reference {

	public static void runValue() {
		int a = 1;
		int b = a;
		b = 2;
		System.out.println("runValue, " + a);
	}
	
	public static void runReference() {
		Aref a = new Aref(1);
		Aref b = a; // *** 변수 b와 변수a에 담긴 인스턴스가 서로 같게함; a와 b가 같은 인스턴스를 참조함
		b.id = 2; // = b의 id를 바꾸면 a의 id도 바뀐다
		System.out.println("runReference, " + a.id);
	}
	
	public static void main(String[] args) {
		runValue(); //1
		runReference(); //2
	}

}
//기본 데이터형과 참조데이터형 (new로 만든 객체,String제외)
