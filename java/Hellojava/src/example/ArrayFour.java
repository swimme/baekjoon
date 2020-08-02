package example;
import java.util.Scanner;

//2577. 숫자의 개수
//각 숫자가 몇 번 나왔는지 저장하기 위해 일차원 배열을 만드는 문제
public class ArrayFour {

	public static void main(String[] args) {
		//세개의 자연수 a b c 
		// a*b*c 계산결과에 0~9까지 각각 숫자가 몇번씩 쓰엿는지
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int mul = A * B * C;
		int length = (int)(Math.log10(mul)+1); //자릿수구하는 메소드 or 십으로 나눈 몫이 0일때까지 배열에 넣기
		int Arr[] = new int[10];

		//일의자리 
		int one = mul%10;
		Arr[one]++;
		
		//십의자리부터: 한자리수 씩 스캔하고 해당하는 배열의 index++
		int n = (int)Math.pow(10, length-1);  //10의 제곱수 
		for (int i=1;i<length;i++) { 
			int index = mul/n;
			Arr[index]++;
			mul /= 10;  //mul = mul - (n*index);
			System.out.println(mul);
			n = n / 10; 
		}
		
		for(int i=0;i<10;i++) {System.out.println(Arr[i]);}
	}
}
