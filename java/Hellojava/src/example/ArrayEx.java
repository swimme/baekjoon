package example;
import java.util.Scanner;
//3052. 나머지
public class ArrayEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[42];
		int cnt = 0;
		
		//42짜리 배열을 만들어서 각 나머지에 해당하는 index에 추가
		for (int i=0;i<10;i++) {
			int n = sc.nextInt();
			int mul = n%42;
			
			// 이전에 추가된적 없다면 count
			if ( arr[mul] == 0) { //boolean 으로 할 수도 있다
				arr[mul] += 1;
				cnt += 1; 
			}
		}
		System.out.println(cnt);
		sc.close();
	}

}
