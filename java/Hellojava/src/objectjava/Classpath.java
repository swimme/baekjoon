package objectjava;

//[10.클래스패스(경로)] 
//클래스가 위치하는 경로를 지정하여, 자바가 필요로하는 클래스를 로드할 수 있도록 하는 법
public class Classpath {

	public static void main(String[] args) {
	}
}

//1. srcbin디렉토리
//javac로 컴파일하면
//-> class파일생성 : 이때 class파일은 해당소스코드안의 class각각이 모두 생성됨


//2. 클래스파일 경로변경시 명시적으로 명령하는법
// java -classpath ".;lib" ClasspathDemo2
// . (현재디렉토리) ; (없으면다른폴더)
// ex. ". ; folder1 ; folder2"

//3. 환경변수
//자바실행시 클래스사용하는데, 그 "클래스가 어디에 위치하는지 지정"
//실행할때마다 클래스패스선언은 번거로우므로 자바설치시 환경변수설정한 것
//환경변수: 운영체제에 지정하는 변수

