package objectjava;

//상위클래스가 Calculator2인 경우; 에러발생
	// Calculator2는 인자가있는 생성자존재(setOprands기능) & 기본생성자x이므로
	// **** 하위클래스를 인스턴스화시키면 하위클래스의 생성자 호출하기전에 *상위클래스의 기본생성자를 자동으로 호출*하기 때문 ****
//해결1: 상위클래스에 기본생성자 명시적으로 선언
//해결2: super
	//이경우, 상위클래스와 하위클래스에 중복이 발생 (setOprands기능)
	// ******두 클래스의 생성자역할이 같다면, 하위클래스에서 상위클래스의 생성자를 호출하도록*******

//class Substraction extends Cal { 
class Substraction extends Calculator2 { 
	
    public Substraction(int left, int right) { //인자가있는 생성자
    	super(left,right); //super();부모클래스의 생성자
    						//**하위클래스 생성자의 인자 int left가 super의 left로 들어간다는뜻**
    						//가장처음으로 선언
//      this.left = left;
//      this.right = right;
    }

    
    public void substract() {
        System.out.println(this.left - this.right);
    }
}

public class InheritConstructorDemo {

	public static void main(String[] args) {
	     Substraction c1 = new Substraction(10, 20); //10-> int left -> 우변left => this.left는 10이됨
	     //c1.setOprands(10,20);
	     c1.sum();
	     c1.avg();
	     c1.substract();
	
	}

}

//Cal(*inherit파트)
//Calculator2(*Constructor파트)


//결론: 부모클래스에 기본생성자가 없을 때 하위클래스의 생성자에 super를 사용하여 * 하위클래스에서 상위클래스의 생성자를 호출하도록 한다...re
//주의: 하위클래스의 생성자에서 super코드가 가장먼저 나타나야함; 부모가 먼저 초기화작업




	