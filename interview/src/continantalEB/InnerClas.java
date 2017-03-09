package continantalEB;

public class InnerClas {

	private int i;
	private static String name;
	InnerClas(int i,String n){
		this.i=i;
		name=n;
	}
	class Inn{
		public void display(){
			System.out.println(i+" "+name);
		}
	}
}
