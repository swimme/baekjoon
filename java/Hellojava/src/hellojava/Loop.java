package hellojava;

public class Loop {

	public static void main(String[] args) {
		//while(){}
		int a = 0; //initial 따로 선언 
		while (a<10) {
			System.out.println("while"+ a);
			a++;
		}
		
		//for(초기화; 종료조건; 반복실행)
		for (int i =0 ; i<10; i++) {
			if (i==5)
				break; // 5일때 (이 위치에서) 반복문자체를 중단 
			System.out.println("for"+i); //for4까지 출력 cf.break전에있으면 for5까지
		}
		
		//continue 구문
		for (int i =0 ; i<10; i++) {		
			if (i==5)
				continue;  // 5일때 (이 위치에서) 실행중단 다음 i로 넘어감
			System.out.println("forc"+i);
		}
		
		//중첩loop 예제
		for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(i + "" + j); //
            }
        }
		
		

	}

}
