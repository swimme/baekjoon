package example;
//1546. ������� // int�� double ����!
//4344. ����� �Ѱ���


import java.util.Scanner;
public class Array1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int C = sc.nextInt(); //�׽�Ʈ ���̽� ����
		
		for (int i =0; i<C; i++) { //���׽�Ʈ���̽�
			int N = sc.nextInt(); //���
			double scores[] = new double[N];
			double sum = 0; double avg = 0;
			double cnt = 0; 

			// ��� ���ϱ�
			for (int j =0; j<N; j++) {
				scores[j] = sc.nextInt();
				sum = sum + scores[j];
			}
			avg = sum / N;
		
//			// �� ���� �˻�
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
