package objectjava;

class Multiple extends Cal{
	public void multiple() {
		System.out.println(this.left* this.right);
	}
}

class Division extends Multiple {
	public void div() {
		System.out.println(this.left/this.right);
	}
}

public class Inherit2 {
	public static void main(String[] args) {
		Multiple c1 = new Multiple();
		c1.setOprands(10, 20);
		c1.multiple();
		
		Division c2 = new Division();
		c2.setOprands(10, 5);
		c2.multiple();
		c2.div();
	}
}


//상속단계: Cal <- Multiple <- Division

