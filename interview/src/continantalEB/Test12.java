package continantalEB;

public class Test12 {

	public static void main(String[] args) {
		Test12 p=new Test12();
		p.start();
		
	}

	 void start() {
	boolean b1=false;
	boolean b2=fix(b1);
	System.out.println(b1+" "+b2);
		
	}

	private boolean fix(boolean b1) {
		b1=true;
		return b1;
	}

}
