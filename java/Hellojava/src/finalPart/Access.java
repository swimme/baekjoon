package finalPart;

//[1. 접근제어자]
// - 클래스의 멤버(변수,메소드)에 접근권한을 지정하는 것: 
//public, protected, default, private
//protected: 같은패키지 or 다른패키지에서 상속한 클래스에서만(import pac2.xxx.java)
//default: 같은 패키지에서만
//private: 같은 클래스에서만

// - 클래스 접근권한: public, default

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
		System.out.println(a.x()); //이건 가능!
	}

}
