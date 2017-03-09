package continantalEB;

public class Test extends Base {

	public void foo(){
		System.out.println("test foo");
	}

	public void goo(){
		System.out.println("test...go");
	}
	public static void main(String[] args) {
		 Base b=new Test();
		 b.foo();
		 b.goo();
		
	}

}
