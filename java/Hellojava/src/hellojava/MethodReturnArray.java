package hellojava;

public class MethodReturnArray {

	//�迭�� ��ȯ�ϴ� �޼ҵ�
	public static String[] getMembers() {
		String[] members = {"��","��","��"};
		return members;
	}
	
	public static void main(String[] args) {
		String[] members = getMembers();
		System.out.println(members[0]);
	}

}
