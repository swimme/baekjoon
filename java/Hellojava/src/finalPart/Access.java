package finalPart;

//[1. ����������]
// - Ŭ������ ���(����,�޼ҵ�)�� ���ٱ����� �����ϴ� ��: 
//public, protected, default, private
//protected: ������Ű�� or �ٸ���Ű������ ����� Ŭ����������(import pac2.xxx.java)
//default: ���� ��Ű��������
//private: ���� Ŭ����������

// - Ŭ���� ���ٱ���: public, default

class Accessing {
	public String y() {
		return "public void y()";
	}
	
	private String z() {
		return "public void z()";
	}
	
	public String x(){
        return z(); //
    }
}

public class Access {
	public static void main(String[] args) {
		Accessing a = new Accessing();
//		System.out.println(a.z());
		System.out.println(a.x()); //�̰� ����!
	}

}
