package hellojava;

public class Loop {

	public static void main(String[] args) {
		//while(){}
		int a = 0; //initial ���� ���� 
		while (a<10) {
			System.out.println("while"+ a);
			a++;
		}
		
		//for(�ʱ�ȭ; ��������; �ݺ�����)
		for (int i =0 ; i<10; i++) {
			if (i==5)
				break; // 5�϶� (�� ��ġ����) �ݺ�����ü�� �ߴ� 
			System.out.println("for"+i); //for4���� ��� cf.break���������� for5����
		}
		
		//continue ����
		for (int i =0 ; i<10; i++) {		
			if (i==5)
				continue;  // 5�϶� (�� ��ġ����) �����ߴ� ���� i�� �Ѿ
			System.out.println("forc"+i);
		}
		
		//��øloop ����
		for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(i + "" + j); //
            }
        }
		
		

	}

}
