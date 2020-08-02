package finalPart;

//[abstract - PART2]
//Part2. �߻�Ŭ���� �������
//- ū�Ը��� ������Ʈ���� ���
//- Ŭ������ ��������ɰ� �ƶ��� ���� �޶����� ����� �����ϴ� ���

//���� -  
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

//���� - run�޼ҵ�; �����ڰ� ����� , ��쿡 ���� - ��¸���޸�; �޼ҵ����ڿ��� ����
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

//////

public class AbstractCalculator {

	public static void main(String[] args) {
		CalculatorDecoPlus c1 = new CalculatorDecoPlus();
		c1.setOprands(10,20); 
		c1.run();
		
		CalculatorDecoMinus c2 = new CalculatorDecoMinus();
		c2.setOprands(10, 20);
		c2.run();
	}
}

//"��쿡 ��Ȳ�� ���� ���� ����� �޶����� �޼ҵ�(sum, avg)�� �߻� �޼ҵ�� ���� ���� Ŭ�������� �����ϵ��� �ϰ� "
// + _sum()�Լ� ����ٽ� ����
//"��� Ŭ������ ����и�(setOprands, run)�� ��쿡�� ���� Ŭ������ �ξ �ڵ��� �ߺ�, ���������� ���Ǽ� ���� ���� �� �ִ�."


// cf. �÷������� - ����������:  template method pattern