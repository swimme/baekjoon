package finalPart;

//[������] -�̾

/*
 abstract class AbsCalculator{
	int left, right;
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	int _sum() { //cf. ���������� default(������Ű��)
		return this.left + this.right;
	} 
	
	public abstract void sum();
	public abstract void avg();
	public void run() {
		sum(); //cf. �ڽ�Ŭ�������� ���ǵ� �޼ҵ� ȣ���ϴ°�
		avg();
	}
	
}

class CalculatorDecoPlus extends AbsCalculator{
	public void sum(){
		System.out.println("+ sum :"+ _sum() );
	}
	public void avg(){
		System.out.println("+ avg :"+(this.left+this.right)/2);
	}
}

class CalculatorDecoMinus extends AbsCalculator{
	public void sum(){
     System.out.println("- sum :"+ _sum() );
 }
 public void avg(){
     System.out.println("- avg :"+(this.left+this.right)/2);
 }
}

 */

public class PolymoDemo {

	//�߰�
	public static void execute(AbsCalculator cal) {
		System.out.println("������");
		cal.run();
	}
	
	public static void main(String[] args) {
//		CalculatorDecoPlus c1 = new CalculatorDecoPlus();
		AbsCalculator c1 = new CalculatorDecoPlus();
		AbsCalculator c2 = new CalculatorDecoMinus();
		//������Ÿ���� AbsCalculator
		
		execute(c1);
		execute(c2);
		//���� ���ǵ� �޼ҵ�� �� c1, c2�� ��� �����ų �� �ִ�.
		//��, ��������-���,abstract�� ��뿡�� ����ȭ -������Ÿ���� ���� �ν��Ͻ�ȭ�Ͽ� ó���� �� ����
		
		//�ϳ��� Ŭ����(AbsCalculator)�� �پ��� ���� ���(ClaculatorDecoPlus, ClaculatorDecoMinus)�� ������ �ִµ� 
		//�̰��� ������
	}
	

}
