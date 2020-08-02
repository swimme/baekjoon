package example;
import java.util.Scanner;

//8958. OX퀴즈
//문자열을 배열로 split메소드
//문자열String 비교는 equals메소드 쓸것
//nextLine 개행 이해 다시
//다른풀이 찾아보기 - for each문 사용해보기 각case를 배열로담고 / 전위증가? ++score 
// - / charAt쓰면 배열로안만들어도된다, 문자열길이 .length() / 누적지표score (if-else문)과 총합계지표result

public class Array8958 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine(); //for 개행
		

		//N개의 테스트케이스
		for (int n=0; n<N; n++) { 
			//각테스트 케이스
			String str = sc.nextLine(); 
			String[] arr = str.split(""); //배열에 한글자씩 담기

			//각 'O'인 문제는 cnt+=1
			//이전 문제도 'O'이면 cnt+=1
			int score = 0;
			
			// 'O'인경우 뒤에 몇개의  'O'가 있는지 중요 
//			for (int i=0; i<arr.length; i++) {
//				if ( arr[i].equals("O")) {
//					score += 1;
//					for (int j=i-1; j>=0; j-- ) { //이전 문제 검사 
//						if ( arr[j].equals("O")) score += 1;
//						else if ( arr[j].equals("X")) break;
//					}
//				} 
//			}

			//sol2.. - 누적지표와 총합계지표 따로두면 - 이전 문제 검사반복문 안두어도 된다. 
			int cnt = 0;
			for (int i=0; i<str.length();i++) {
				if (str.charAt(i) == 'O') {
					cnt++;
					score += cnt;
				} else cnt = 0;
			}
			System.out.println(score);
		
			
		}
		
		
	}
}
