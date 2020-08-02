package finalPart;

//[예외2. 예외던지기_ 예외처리를 다음 사용자에게 넘기는 것]
import java.io.*;
/* 예외의 책임 Bb에게 
class Bb{
    void run(){
        BufferedReader bReader = null;
        String input = null;
        
        try {
            bReader = new BufferedReader(new FileReader("out.txt")); 
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
        try{
            input = bReader.readLine();
        } catch (IOException e){
            e.printStackTrace();
        }       
        
        System.out.println(input); 
    }
}
//swift의 옵셔널이 생각나는 코드..
 */
 
/* 예외책임 C에게 */
//예외에 대한 처리를 B.run의 사용자에게 위임하는 것
class Bb{
    void run() throws IOException, FileNotFoundException{
        BufferedReader bReader = null;
        String input = null;
        bReader = new BufferedReader(new FileReader("out.txt"));
        input = bReader.readLine();
        System.out.println(input); 
    }
}

/*
class Cc{
    void run(){
        Bb b = new Bb();
        try {
            b.run();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
*/

/* 예외책임 main에게 */
class Cc{
    void run() throws IOException, FileNotFoundException{
        Bb b = new Bb();
        b.run();
    }
}

public class ExceptionTwo {
	public static void main(String[] args) {
		 Cc c = new Cc();
//         c.run();
		 try {
	            c.run();
	        } catch (FileNotFoundException e) {
	            System.out.println("out.txt 파일은 설정 파일 입니다. 이 파일이 프로잭트 루트 디렉토리에 존재해야 합니다.");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	}
}
/// 엔드유저인 애플리케이션의 사용자가 out.txt 파일을 루트 디렉토리에 위치시켜야 하는 문제이기 때문에 
/// 애플리케이션의 진입점인 메소드 main으로 책임을 넘기고 있다.
