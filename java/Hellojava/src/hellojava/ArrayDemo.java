package hellojava;

public class ArrayDemo {

	public static void main(String[] args) {
		String[] studyGroup = {"��","��","��"};
		System.out.println(studyGroup.length);
		
		for (int i = 0; i<studyGroup.length; i++) {
			String member = studyGroup[i]; //�迭 ���ʷ� string�� �־ ���
			System.out.println(member + "����");
		}
		
		// **���Ṯ; �迭�� ���� ���� e�� ��Ƽ� ����
		for (String e : studyGroup) {
			System.out.println(e+"���̿�");
		}
		
		//�迭 ����; �������� �ʴ� �ε����� ����Ϸ��� ���� �� �߻�

	}

}
