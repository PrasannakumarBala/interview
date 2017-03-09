package hcl;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Setdemo {

	public static void main(String[] args) {

		Set<String> s1 = new HashSet<String>();
		s1.add("kumar");
		s1.add("nani");
		s1.add("chinni");
		s1.add("pavan");
		System.out.println(s1.add("kumar"));

		System.out.println("-----------hashset--------------");
		System.out.println(s1);

		System.out.println("----------linkedhashSet--------------");
		Set<String> s2 = new LinkedHashSet<String>();
		s2.addAll(s1);

		System.out.println(s2);
		System.out.println("-----------TreeSet--------------");

		Set<String> s3 = new TreeSet<String>(new nameComprator());
		s3.addAll(s1);
		s3.add("kumar");

		System.out.println(s3);

		/*
		 * Iterator<Integer> i1=s1.iterator(); while(i1.hasNext()){
		 * System.out.println(i1.next()); }
		 * 
		 * for(int i:s1){ System.out.println(i); }
		 */
	}

}
