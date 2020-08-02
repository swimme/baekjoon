package hellojava;

public class Datatype {

	public static void main(String[] args) {
	  //1. 데이터 타입 선택지 for 메모리 절약 
		// 정수형 데이 ; byte < short < int(4) < long
		// 실수형 데이터; float < double(8) ; 디폴트 double사용
		// 문자형 데이터; char(2)
		
		// 상수의 데이터 타입 (상수 : 변하지 않는 값 )
		int a = 1; //상수는 1 (ex. 3으로바꿀 수 없음)
		
//		float c = 2.2; (x) 상수의 데이터타입은 double
		double b = 2.2; 
		float c = 2.2F; // 상수의 데이터타입을 float로 임의로 변환
		
//		int d = 2147483648; (x) int의 범위벗어남
//		long d = 2147483648; (x) 여전히 상수의 데이터 타입은 int
		long d = 2147483648L; //상수의 데이터타입을 long으로 명시적으로 변환
		   //cf. byte와 short에 대해서는 int형 상수대입을 허용함
		
		
	  //2. 자동 형변환; 자바의 기능 
		double e = 3.0F; // double형 변수에 float타입 값을 대입함 
		//= float을 자동으로 double타입으로 형변환; double이 float보다 더 많은수표현가능하기 때문
		// 즉, 표현범위 좁->넓은 데이터타입으로의 변환 가능하다
		// /byte-> short, char -> int -> long ->/ float -> double
		int n1 = 3;
		float n2 = 1.0F;
		double sum = n1+n2; // 정수i + 실수f -> 실수f + 실수f => 실수d
		
	  //3. 명시적 형변환
//		float a = 100.0; (x)
		float f1 = 100.0F;
		float f2 = (float)100.0;
		int i1 = (int)100.0F;
		
		
		
		
	  //3. 데이터 타입 명시적 변환
		
	}

}
