package myPackage;

import java.util.ArrayList;
import java.util.Iterator;

public class ItratorDemo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();

		al.add(10);
		al.add("deepak");
		al.add(null);

		System.out.println(al);

		// to print the element one by one
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		al.remove(1);
		System.out.println(al);
		System.out.println(al.get(0));
	}

}
