package myPackage;

import java.util.Enumeration;
import java.util.Vector;

public class EnumeratorVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector v = new Vector();
		v.add(10);
		v.add("deepak");
		v.add(15.8);
		System.out.println(v);

		Enumeration e = v.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

	}

}
