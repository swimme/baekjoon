package example;

//[2741. N찍기]
import java.util.Scanner;

public class ForB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int N = sc.nextInt();
		
		//for중첩문: i번째줄에 i개별! + 오른쪽 정렬 = indent
		for(int i=1; i<=N; i++) { 
			for(int j=1;j<=N-i; j++) { // N에서 i만큼뺀거 ; 3이면 3-1
				System.out.print(" ");
			} for(int k=1; k<=i; k++) {  //i번째줄만큼
				System.out.print("*"); 
			} System.out.println ("");   //엔터  
		}
		sc.close();
	}
}
