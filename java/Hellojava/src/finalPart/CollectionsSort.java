package finalPart;
//-5. ����
//�÷��� ������� �� �ϳ� 
//sort - List���ĸ޼ҵ� api
import java.util.*;

class Computer implements Comparable { //sort������� Comparable �������̽� �����ʿ�
	int serial;
	String owner;
	
	//������
	Computer(int serial, String owner) {
		this.serial = serial ;
		this.owner = owner;
	}
	
	//�����ؾ��ϴ� compareTo (�񱳴��)
	public int compareTo(Object o) {
		return this.serial - ((Computer)o).serial; //serial�� ��
		// a.compareTo(b)
		// ���簴ü.compareTo(�񱳴��)
		// ���簴ü - �񱳴��: ���, 0 , ����
	}
	
	//�� ��ȯ
	public String toString() {
		return serial + "" + owner;
	}
}

public class CollectionsSort {

	public static void main(String[] args) {
		//1. Computer���� ��� ArryList 
		List<Computer> computers = new ArrayList<Computer>();
		computers.add(new Computer(500,"egoing"));
		computers.add(new Computer(200,"sooyoung"));
		
		//2. ����
		Iterator i = computers.iterator();
		System.out.println("before");
		while(i.hasNext()) {
			System.out.println(i.next()); //�߰��� ������� 
		}
		
		//3. ���� sort - List���� ����
		// implements Comparable����
		Collections.sort(computers);
		
		System.out.println("\nafter");
		i = computers.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
