package example;
import java.util.Scanner;

public class Chap2C {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double M = sc.nextDouble();
		
		double I = M * 39.3701;
		double F = I / 12;
		
		//F의 정수출력
		int i = (int)(F- F%1);
		System.out.println(i);
		
		//소수 feet> inch
		int Fi = (int)(12*(F%1));
		System.out.println(Fi);

		//자리수출력
		System.out.printf("%.0f", Math.floor(1000.611));
		sc.close();	
	}
}
