package hellojava;

public class MethodReturnArray {

	//배열을 반환하는 메소드
	public static String[] getMembers() {
		String[] members = {"숭","송","장"};
		return members;
	}
	
	public static void main(String[] args) {
		String[] members = getMembers();
		System.out.println(members[0]);
	}

}
