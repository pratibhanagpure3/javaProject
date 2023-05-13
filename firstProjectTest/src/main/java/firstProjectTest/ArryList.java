package firstProjectTest;

import java.util.ArrayList;
import java.util.Collections;

public class ArryList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> var = new ArrayList<Integer>();
		var.add(0);
		var.add(1);
		var.add(4);
		var.add(8);
		System.out.println(var);

		int element = var.get(2);
		System.out.println(element);

		var.set(2, 6);
		System.out.println(var);

		var.add(3);
		System.out.println(var);

		Collections.sort(var);
		System.out.println(var);

		int s = var.size();
		System.out.println(s);

	}

}
