package myPackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {

	public static void main(String[] args) {

		// list ka ek reference create kiya and arraylist ka object bnaya
		List l = new ArrayList();
		// (1) add element on index based
		l.add(10);
		l.add(20);
		l.add(2, 30);
		System.out.println(l);

		// (2) duplicate element add kar sakte h

		l.add(10);
		l.add(20);
		System.out.println(l);

		// list allow to store any no of null value

		l.add(null);
		l.add(null);
		System.out.println(l);

		// ek ek krke element retrive krane k liye iterator method use

		Iterator itr = l.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

			// listiterator method
			ListIterator lit = l.listIterator();

			while (lit.hasNext()) {
				System.out.println(lit.next());

			}
		}

	}

}
