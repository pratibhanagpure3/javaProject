package firstProjectTest;

public class MyCharR {

	public static void main(String[] args) {
		MyChar chr = new MyChar('1');
		System.out.println("vowel " + chr.isVowel());
		System.out.println("consonent " + chr.isConsonent());
		System.out.println("number " + chr.isNumber());
		System.out.println("alphabate " + chr.isAlphabate());

	}

}
