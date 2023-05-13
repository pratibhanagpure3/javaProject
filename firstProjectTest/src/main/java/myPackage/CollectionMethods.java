package myPackage;

import java.util.ArrayList;

public class CollectionMethods {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();

		// add method to add element in list
		al.add(10);
		al.add(20);
		al.add(30);
		System.out.println(al);

		// add all method

		ArrayList al2 = new ArrayList();
		al2.add("bbb");
		al2.add("ccc");
		al2.add("aaa");
		al2.addAll(al);
		System.out.println(al2);

		// contains method
		System.out.println("contains  " + al.contains(20));
		System.out.println("contains  " + al.contains(60));

		// Isempty method

		System.out.println("isEmpty  " + al.isEmpty());

		// size methods

		System.out.println("size of collection object  " + al.size());

		// remove method

		System.out.println("remove element  " + al.remove(2));
		System.out.println(al);

		System.out.println("remove element  " + al2.remove("bbb"));
		System.out.println(al2);

		System.out.println("remove element  " + al2.remove(1));
		System.out.println(al2);

		// remove all metods used for remove all element

		al2.removeAll(al);
		System.out.println("al element   " + al);
		System.out.println("al2 element  " + al2);

		// clear method used for clear all element

		al.clear();
		System.out.println("clear all " + al);
	}

}
