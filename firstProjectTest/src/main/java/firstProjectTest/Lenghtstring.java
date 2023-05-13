package firstProjectTest;

public class Lenghtstring {

	public static void main(String[] args) {
		String a = "  this is the lot of text  ";
		System.out.println(a.length()); // 23
		System.out.println(a.charAt(1)); // h
		System.out.println(a.indexOf("lot")); // 12
		System.out.println(a.indexOf("o")); // 13
		System.out.println(a.indexOf("i")); // 2 pehle wala i
		System.out.println(a.lastIndexOf("i")); // 5 bad wala i
		System.out.println(a.startsWith("lot")); // false
		System.out.println(a.startsWith("this")); // true
		System.out.println(a.endsWith("text")); // true
		System.out.println(a.endsWith("xt")); // true
		System.out.println(a.isEmpty()); // false
		System.out.println(a.equals("value")); // false
		System.out.println(a.equalsIgnoreCase("VaLUe")); // false
		// System.out.println(a.toUpperCase("this is the lot of text"));
		// System.out.println(a.trim(" this is the lot of text ")); // remove space
		// ending n starting point
		System.out.println("123" + "123" + "123" + "1234");

	}

}
