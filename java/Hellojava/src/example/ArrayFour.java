package example;
import java.util.Scanner;

//2577. ������ ����
//�� ���ڰ� �� �� ���Դ��� �����ϱ� ���� ������ �迭�� ����� ����
public class ArrayFour {

	public static void main(String[] args) {
		//������ �ڿ��� a b c 
		// a*b*c ������� 0~9���� ���� ���ڰ� ����� ��������
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int mul = A * B * C;
		int length = (int)(Math.log10(mul)+1); //�ڸ������ϴ� �޼ҵ� or ������ ���� ���� 0�϶����� �迭�� �ֱ�
		int Arr[] = new int[10];

		//�����ڸ� 
		int one = mul%10;
		Arr[one]++;
		
		//�����ڸ�����: ���ڸ��� �� ��ĵ�ϰ� �ش��ϴ� �迭�� index++
		int n = (int)Math.pow(10, length-1);  //10�� ������ 
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
