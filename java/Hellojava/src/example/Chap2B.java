package example;
import java.util.Scanner;

public class Chap2B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double R = sc.nextDouble();
		double L = sc.nextDouble();
		
		double A = R * R * 3.14159;
		double V = A * L;
		
		//버림: Math.floor 
		System.out.println(Math.floor(5.5)); //5.0
		
		//소수점첫째자리 표현 
		System.out.printf("%.1f\n", 0.677); //반올림 0.7
		
		//차이
		System.out.printf("%.1f\n", Math.floor(V * 10)/10);
		System.out.println(Math.floor(V * 10)/10);
		System.out.println(V);

		sc.close();
		
	}
}
