package continantalEB;

public class Intest {

	public static void main(String[] args) {

		InnerClas i1=new InnerClas(10,"kumar");
		InnerClas.Inn in1=i1.new Inn();
		in1.display();
		
		InnerClas i2=new InnerClas(30,"jaffa");
		InnerClas.Inn in2=i2.new Inn();
		in2.display();
	}

}
