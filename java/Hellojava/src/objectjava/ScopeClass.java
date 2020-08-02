package objectjava;

//[4. 유효범위 ] - 변수이름 충돌막기위해
public class ScopeClass {
	
	/* Ver1. 지역변수 유효범위 
	static void a() {
		int i = 0;  //지역변수'선언' //이 i는  이 메소드내에서만 유효함(사용됨) 
	}
		
	public static void main(String[] args) {
		//#1.
		for (int i=0; i<5; i++) //for문내 지역변수 '선언'
		{ 
			a(); //a의 i=0 
			// for문의 i++ -> i=1, i++ ->...
			System.out.println(i); //0->1->..->4
		}
		
	}
	*/
	
	/* Ver2. 전역변수 유효범위
	 static int i; //class직속변수 
	 static void a() {	
	 	i = 0;  // 전역변수'할당'
	   } 
	  
	 public static void main(String[] args) {
		for( i=0; i<5; i++ ) // 전역변수 할당
		{
			a(); //전역 i=0 
		  	//전역 i++ -> 1 -> a함수에 의해 다시 0이 된다
			System.out.println(i); 
		} 
		//무한루프발생
	 } // a()나 for문내부의 i하나만이라도 지역변수로 선언하면 정상작동 
	*/
	
	//Ver3. 중첩
	 static int i= 5;  
	 static void a() {	
	 	int i = 10; 
		b();
	   } 
	     
	 static void b(){
	  	System.out.println(i); //전역i 
	 }
	  
	 public static void main(String[] args) {
		a(); //5 
		//a함수의 b()는 a의i가아닌 전역i를 이용 
		//b가 정의될때의 i를 사용한다; 만약 저상태에서 전역변수정의되어있지않으면 오류
		//즉, 메소드를 누가 호출하냐에 상관없이 자기자신의 i(지역) or 전역을 사용
		// => 정적인 유효범위
		
		//메소드를 호출한 다른 메소드의 변수사용시 동적인 유효범위라고 하는데... 자바는 not
	 } 
	 
}
