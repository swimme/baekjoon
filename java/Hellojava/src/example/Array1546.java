package example;
//1546. 평균조작 // int와 double 구별!
//4344. 평균은 넘겠지


import java.util.Scanner;
public class Array1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int C = sc.nextInt(); //테스트 케이스 갯수
		
		for (int i =0; i<C; i++) { //각테스트케이스
			int N = sc.nextInt(); //명수
			double scores[] = new double[N];
			double sum = 0; double avg = 0;
			double cnt = 0; 

			// 평균 구하기
			for (int j =0; j<N; j++) {
				scores[j] = sc.nextInt();
				sum = sum + scores[j];
			}
			avg = sum / N;
		
//			// 각 점수 검사
			for (int j =0; j<N; j++) {
				if (scores[j] > avg) cnt++;
			}
//			System.out.println(String.format("%.3f %",(cnt/(double)N)*100));
			
			System.out.printf( "%.3f", (cnt/N)*100 );
			System.out.println("%");
		}
//		sc.close();
	}
}
