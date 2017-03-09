package hcl;

import java.util.Comparator;

public class nameComprator implements Comparator<String> {

	@Override
	public int compare(String s1, String s21) {
		return s1.compareTo(s21);
	}
	

}
