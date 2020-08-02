package example;
import java.util.Scanner;

public class Chap2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sec = sc.nextInt();
		int min = sec / 60 ;
		int hour = 0;

		if ( min >= 60 ) {
			hour = min / 60;
			sec = sec - min*60 ;
			min = min - hour*60;
		} else {
			sec = sec - min*60;
		}
		System.out.printf("%d %d %d", hour, min, sec);
		sc.close();
	}

}
