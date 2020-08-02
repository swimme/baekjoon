package hellojava;

public class ConditionSwitch {

	public static void main(String[] args) {
		String explain = "";
		switch(1) {
		case 1:
			System.out.println("괄호안 case부터");
//			explain="다른예시";
//			break; //break하면 해당case만 출력
		case 2:
			System.out.println("차례로");			
		case 3:
			System.out.println("출력");
		default:
			System.out.println("이거는 괄호안case와 매칭되는 case없을때");
		}
		System.out.println(explain);
	}
}
