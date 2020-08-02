package example;
import java.util.Scanner;
//2577. 숫자의 개수 sol2
//각 숫자가 몇 번 나왔는지 저장하기 위해 일차원 배열을 만드는 문제

public class ArrayTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numA = sc.nextInt();
		int numB = sc.nextInt();
		int numC = sc.nextInt();
		int mul = numA*numB*numC;
		int ans = mul; //
		int arr[] = new int[9];
		int cnt[] = new int[10]; //10
		System.out.println(mul);

		//구한 수 한자리씩 배열에 넣기 
		for (int i = 0; i < 9; i++) {
			arr[i] = mul%10;
			mul /= 10; //==남은수!!오
		}

		for(int i = 0; i< 9; i++) {
			switch (arr[i]) {
			case 0: cnt[0]++;
			break;
			case 1: cnt[1]++;
			break;
			case 2: cnt[2]++;
			break;
			case 3: cnt[3]++;
			break;
			case 4: cnt[4]++;
			break;
			case 5: cnt[5]++;
			break;
			case 6: cnt[6]++;
			break;
			case 7: cnt[7]++;
			break;
			case 8: cnt[8]++;
			break;
			case 9: cnt[9]++;
			break;
			}
		}

		//자릿수 예외처리
		if (ans>999999) cnt[0] -= 2;
		if (ans>9999999) cnt[0] -= 1;

		for(int i = 0; i<10; i++)
			System.out.println(cnt[i]);
	}
}
