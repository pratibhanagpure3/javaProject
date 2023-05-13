package myPackage;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListItratorDemo {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(20);
		al.add("khus");
		al.add(null);
		System.out.println(al);

		ListIterator li = al.listIterator();

		// li.set(200);
		// System.out.println(al);

		while (li.hasNext()) {
			System.out.println(li.next());
		}
		while (li.hasPrevious()) {
			System.out.println(li.previous());
		}

		li.set("deepak");
		System.out.println("set value " + al);
	}

}
