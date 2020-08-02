package hellojava;

public class ArrayDemo {

	public static void main(String[] args) {
		String[] studyGroup = {"숭","방","송"};
		System.out.println(studyGroup.length);
		
		for (int i = 0; i<studyGroup.length; i++) {
			String member = studyGroup[i]; //배열 차례로 string에 넣어서 출력
			System.out.println(member + "하이");
		}
		
		// **간결문; 배열의 값을 변수 e에 담아서 전달
		for (String e : studyGroup) {
			System.out.println(e+"하이염");
		}
		
		//배열 오류; 존재하지 않는 인덱스를 사용하려고 했을 때 발생

	}

}
