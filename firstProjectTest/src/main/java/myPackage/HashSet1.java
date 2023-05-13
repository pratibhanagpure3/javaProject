package myPackage;

import java.util.HashSet;

public class HashSet1 {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();

		// heterogeneous object and null value are allowed duplicate value are not
		// allowed
		// hs.add(10);
		// hs.add(10);
		hs.add("deepak");
		// hs.add('t');
		System.out.println(hs);

	}

}
