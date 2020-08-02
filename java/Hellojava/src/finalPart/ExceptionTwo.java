package finalPart;

//[����2. ���ܴ�����_ ����ó���� ���� ����ڿ��� �ѱ�� ��]
import java.io.*;
/* ������ å�� Bb���� 
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
//swift�� �ɼų��� �������� �ڵ�..
 */
 
/* ����å�� C���� */
//���ܿ� ���� ó���� B.run�� ����ڿ��� �����ϴ� ��
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

/* ����å�� main���� */
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
	            System.out.println("out.txt ������ ���� ���� �Դϴ�. �� ������ ������Ʈ ��Ʈ ���丮�� �����ؾ� �մϴ�.");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	}
}
/// ���������� ���ø����̼��� ����ڰ� out.txt ������ ��Ʈ ���丮�� ��ġ���Ѿ� �ϴ� �����̱� ������ 
/// ���ø����̼��� �������� �޼ҵ� main���� å���� �ѱ�� �ִ�.
