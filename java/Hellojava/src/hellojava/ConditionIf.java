package hellojava;

public class ConditionIf {

	public static void main(String[] args) {
		
		String id = args[0]; //입력값(의 띄어쓰기전 첫입력값)을 id라는 문자열변수에 담음
		String pw = args[1];
		
		if (id.equals("soong")) {
			if (pw.equals("hehe")) {  //문자열비교는 == 말고 .equals
				System.out.println("right");
			} else {
				System.out.println("pw wrong");
			}
		} 
		
		
		else {
			System.out.println("id wrong");
		}
	
	}
	//else if () {
}
