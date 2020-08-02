package objectjava;

//[4. ��ȿ���� ] - �����̸� �浹��������
public class ScopeClass {
	
	/* Ver1. �������� ��ȿ���� 
	static void a() {
		int i = 0;  //��������'����' //�� i��  �� �޼ҵ峻������ ��ȿ��(����) 
	}
		
	public static void main(String[] args) {
		//#1.
		for (int i=0; i<5; i++) //for���� �������� '����'
		{ 
			a(); //a�� i=0 
			// for���� i++ -> i=1, i++ ->...
			System.out.println(i); //0->1->..->4
		}
		
	}
	*/
	
	/* Ver2. �������� ��ȿ����
	 static int i; //class���Ӻ��� 
	 static void a() {	
	 	i = 0;  // ��������'�Ҵ�'
	   } 
	  
	 public static void main(String[] args) {
		for( i=0; i<5; i++ ) // �������� �Ҵ�
		{
			a(); //���� i=0 
		  	//���� i++ -> 1 -> a�Լ��� ���� �ٽ� 0�� �ȴ�
			System.out.println(i); 
		} 
		//���ѷ����߻�
	 } // a()�� for�������� i�ϳ����̶� ���������� �����ϸ� �����۵� 
	*/
	
	//Ver3. ��ø
	 static int i= 5;  
	 static void a() {	
	 	int i = 10; 
		b();
	   } 
	     
	 static void b(){
	  	System.out.println(i); //����i 
	 }
	  
	 public static void main(String[] args) {
		a(); //5 
		//a�Լ��� b()�� a��i���ƴ� ����i�� �̿� 
		//b�� ���ǵɶ��� i�� ����Ѵ�; ���� �����¿��� �����������ǵǾ����������� ����
		//��, �޼ҵ带 ���� ȣ���ϳĿ� ������� �ڱ��ڽ��� i(����) or ������ ���
		// => ������ ��ȿ����
		
		//�޼ҵ带 ȣ���� �ٸ� �޼ҵ��� �������� ������ ��ȿ������� �ϴµ�... �ڹٴ� not
	 } 
	 
}
