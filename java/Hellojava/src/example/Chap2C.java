package example;
import java.util.Scanner;

public class Chap2C {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double M = sc.nextDouble();
		
		double I = M * 39.3701;
		double F = I / 12;
		
		//F�� �������
		int i = (int)(F- F%1);
		System.out.println(i);
		
		//�Ҽ� feet> inch
		int Fi = (int)(12*(F%1));
		System.out.println(Fi);

		//�ڸ������
		System.out.printf("%.0f", Math.floor(1000.611));
		sc.close();	
	}
}
