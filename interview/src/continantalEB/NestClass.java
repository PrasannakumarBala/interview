package continantalEB;

public class NestClass {

	private static String name;
	NestClass(String n){
		name=n;
	}
	 static class StaticInn{
	 void display(){
		 System.out.println(name);
	 }
	 }
}
