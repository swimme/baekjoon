package example;
import java.util.Scanner;
//3052. ������
public class ArrayEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[42];
		int cnt = 0;
		
		//42¥�� �迭�� ���� �� �������� �ش��ϴ� index�� �߰�
		for (int i=0;i<10;i++) {
			int n = sc.nextInt();
			int mul = n%42;
			
			// ������ �߰����� ���ٸ� count
			if ( arr[mul] == 0) { //boolean ���� �� ���� �ִ�
				arr[mul] += 1;
				cnt += 1; 
			}
		}
		System.out.println(cnt);
		sc.close();
	}

}
