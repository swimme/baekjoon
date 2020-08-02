package finalPart;

//[����� enum]

//-2. ����׷� ->�������̽�Ȱ�밡��
//�������̽����� ����� ������ ������ public static final�� �Ӽ��� ����!
/*
interface FRUIT {
	int APPLE = 1, PEACH = 2, BANANA = 3;
}
interface COMPANY {
	int GOOGLE = 1, APPLE = 2, ORACLE = 3;
}
*/

//-3. �� ��� ������ �������߿� �߰��Ҽ�x ; �Ѵ� ���� int ���
// class������ �ν��Ͻ��λ��
//  ������ ������ final�̱� ������ �Һ��̰�, Static�̹Ƿ� �ν��Ͻ��� ������ �ʾƵ� �ȴ�. rere
/*
class Fruit {
	public static final Fruit APPLE = new Fruit();
}
class Company {
	public static final Company APPLE = new Company();
}
*/

//-4. enum ������: ������ ������� ���� ( �װ��� ��������ʵ��� ���� )
// �ڵ尡 �ܼ�������, �ν��Ͻ� ������ ����� �����ϸ�?, �������� �����ǵ��� �巯��
// ��ǻ� class �Ʒ� �ڵ�� ���� (�����ڿ� �޼ҵ尡�� ������)
/* 
 class Fruit{
    public static final Fruit APPLE  = new Fruit();
    public static final Fruit PEACH  = new Fruit();
    public static final Fruit BANANA = new Fruit();
    private Fruit(){} 
    //�������� ���������ڰ� private : Ŭ������ �ν��Ͻ��� ���� �� ���ٴ� ��...?
}
 */

enum Fruit {
	/*
	APPLE, PEACH, BANANA;
	//enum�� �����ڴ� ������ private ; ���� ������ �� ����..(?)
	Fruit() {
		System.out.println("Constructor" + this); 
	}
	*/
	
	//��� �����ϸ鼭 ���ÿ� ������ ȣ��
	/*
	APPLE("red"), PEACH("pink"), BANANA("yellow");
	
	public String color;
	Fruit ( String color ) {
		System.out.println("Constructor" + this);  //apple������ this��apple�̵ǰ�
		this.color = color; //red(�캯)�� this.color�� �Ǿ� �ν��Ͻ��� color�� �ȴ�
	}
	*/
	
	//�޼ҵ� ����
	APPLE("red"), PEACH("pink"), BANANA("yellow");
	
	private String color;
	Fruit ( String color ) {
		System.out.println("Constructor" + this);  
		this.color = color; 
	}
	
	String getColor() {
		return this.color;
	}
}

public class ConstantAndEnum {
//-1. ������ final�� ó���ϸ� �ѹ� ������ ������ ���� �� �̻� �ٲ��� ����
//���� �ٲ��� �ʴ� ���̶�� �ν��Ͻ� ������ �ƴ϶� Ŭ���� ����(static)�� �����ϴ� ���� �� ���� ��
	/*
	private final static int FRUIT_APPLE = 1;
	private final static int PEACH = 2;
	private final static int BANANA = 3;

	private final static int GOOGLE = 1;
	private final static int COMPANY_APPLE = 2;
	private final static int ORACLE = 3;
 	*/	
	public static void main(String[] args) {
		/*
		 * 1. ���
		 * 2. ������
		 * 3. �ٳ���
		 */
//		int type = FRUIT.APPLE; //1 //FRUIT_APPLE
		Fruit type = Fruit.APPLE;
		
		switch(type) {
//			case FRUIT.APPLE: //1 //(interface)
			case APPLE:
//				System.out.println(57 + Fruit.APPLE.color);
				System.out.println(57 + Fruit.APPLE.getColor() );
				break;
			case PEACH: //2
				System.out.println(34);
				break;
			case BANANA: //3
				System.out.println(93);
				break;
		}
		
		//-3, -4
		/*
		if (Fruit.APPLE == Company.APPLE) { //���� �ٸ� ī�װ��� ����� �񱳱����̹Ƿ�
			System.out.println("");
		}
		*/
	}

}
