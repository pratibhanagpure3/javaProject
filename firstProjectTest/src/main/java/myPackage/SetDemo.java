package myPackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {

		// hashset ka object bnakr set k reference m add kr diya
		Set s = new HashSet();

		// add element in hashset code
		s.add(100);
		s.add(200);
		s.add(300);
		System.out.println(s);

		// doesn't allow duplicate value

		s.add(100);
		s.add(500);
		System.out.println(s);

		// it doesn't allow to store multiple null value

		s.add(null);
		s.add(null);
		System.out.println(s);

		// iterator
		Iterator itr = s.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
