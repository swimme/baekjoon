package hellojava;

// method; function; 코드의 재사용 용이
public class Method {
	
	//numbering 메소드 정의 ; 입력값에 따른 메소드; 여러 입력값 
	  //+**출력값** (void아닌 String; 출력값에 대한 자료형); 문자열을 return하는 메소드
	public static String numbering(int init, int limit) {
		
		int i = init; //cf. 좀더 직관적인 코드선언
		
		//결과를 output이라는 변수에 담기 위해 먼저 선언 (return변수)
		String output = "";
		
		while (i< limit) {
//			System.out.println(i);
			output += i; //출력하는 대신 변수 output에 append; 1234가 차례로 담긴다!!!
						//output = output + i
			i++;
		}
		
		// return에서 프로그램 무조건 종료됨!!! 외부로 반환하려면 return선언 
		return output;
	}
	
	//main메소드(함수)
	public static void main(String[] args) {
		//numbering(1, 5); //numbering 메소드 호출
		
		//return한 값을 변수에 담는다. (return이 선언되어있어야함?)
		String result = numbering(1,5);
		System.out.println(result);
		
	}

//tip 메소드코드 읽을때 입력값과 출력값 먼저 보고, 그다음 정의부를 보면 파악하기 용인
//출력값선언장단점; 좀더엄격하고 긴코드(유연성낮음) ; 그외의 자료형경우는 고려하지 않아도됨(예측가능성)
//return; 메소드의 부품으로서의 가치 
	//화면출력이 아닌 파일기록or메일첨부기능의 경우 ; 출력/기록/메일첨부로부터 계산하는 로직을 분리!
	//내장의경우와 비교해보면; numbering메소드 안에 print선언이 있었음_ 출력까지 내장_ 호출하면 출력되는 경우
}
