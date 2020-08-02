package org.opentutorials.javatutorials.packages;

//다른 패키지의 클래스 사용하기위한 선언
//*모든 클래스  or specify가능
import objectjava.*;

//[11.패키지]
// 동일한 이름을 가진 다른 클래스를 사용하기 위한 방법

//C:\Users\soo\Desktop\java\Hellojava\src\org\opentutorials\javatutorials\packages\Package.java	
// 프로젝트디렉토리(\Hellojava)
// 소스코드저장디렉토리(src)
// 클래스저장디렉토리(\org~\object) ; 패키지이름과 동일; 디렉토리개념
//cf. 패키지이름 - 소속이나 도메인보편사용 거꾸로 
public class Package {

	public static void main(String[] args) {
		A a = new A(); //같은 패키지의 클래스사용 import선언없이 가능
		B b = new B(); // A클래스파일의 B클래스 사용가능 
		
		Classpath c = new Classpath(); 
		CalEx d = new CalEx(); // 파일이름명(패키지내에있는 클래스파일 로드하는 것이므로!)
		//다른 패키지이면 CalEx의 class Calculator은 사용불가...!
//		Calculator cal = new Calculator();
		
		//정리: 다른 패키지면 only public(in its own file) 클래스만 로드가능
		//	      같은 패키지면 모든 클래스 로드가능
	}
}

//Part2. cmd창
//src : 소스 코드가 들어있다. - for human
//bin : 컴파일된 클래스 파일이 들어있다. - for computer(binary)

//javac를 하면 컴파일된 클래스파일이 해당패키지디렉토리(소스코드있는디렉토리)내에 생성된다.
//bin폴더로 가게끔하려면 
// javac src\org\opentutorials\javatutorials\packages\A.java -d bin


//Part3. import한 패키지 안의 같은 이름의 클래스를 사용하고 싶을때
//	org.opentutorials.javatutorials.objectjava.A ex = new org.opentutorials.javatutorials.objectjava.A();
