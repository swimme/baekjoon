package example;
import java.util.Scanner;

//8958. OX����
//���ڿ��� �迭�� split�޼ҵ�
//���ڿ�String �񱳴� equals�޼ҵ� ����
//nextLine ���� ���� �ٽ�
//�ٸ�Ǯ�� ã�ƺ��� - for each�� ����غ��� ��case�� �迭�δ�� / ��������? ++score 
// - / charAt���� �迭�ξȸ����ȴ�, ���ڿ����� .length() / ������ǥscore (if-else��)�� ���հ���ǥresult

public class Array8958 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine(); //for ����
		

		//N���� �׽�Ʈ���̽�
		for (int n=0; n<N; n++) { 
			//���׽�Ʈ ���̽�
			String str = sc.nextLine(); 
			String[] arr = str.split(""); //�迭�� �ѱ��ھ� ���

			//�� 'O'�� ������ cnt+=1
			//���� ������ 'O'�̸� cnt+=1
			int score = 0;
			
			// 'O'�ΰ�� �ڿ� ���  'O'�� �ִ��� �߿� 
//			for (int i=0; i<arr.length; i++) {
//				if ( arr[i].equals("O")) {
//					score += 1;
//					for (int j=i-1; j>=0; j-- ) { //���� ���� �˻� 
//						if ( arr[j].equals("O")) score += 1;
//						else if ( arr[j].equals("X")) break;
//					}
//				} 
//			}

			//sol2.. - ������ǥ�� ���հ���ǥ ���εθ� - ���� ���� �˻�ݺ��� �ȵξ �ȴ�. 
			int cnt = 0;
			for (int i=0; i<str.length();i++) {
				if (str.charAt(i) == 'O') {
					cnt++;
					score += cnt;
				} else cnt = 0;
			}
			System.out.println(score);
		
			
		}
		
		
	}
}
