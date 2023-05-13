package firstProjectTest;

public class MyChar {
	char vowel;

	public MyChar(char vowel) {
		this.vowel = vowel;

	}

	public Boolean isVowel() {
		if (vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u')
			return true;

		return false;

		/*
		 * if (vowel == 'A') return true; if (vowel == 'E') return true; if (vowel ==
		 * 'I') return true; if (vowel == 'o') return true; if (vowel == 'u') return
		 * true; return false;
		 */

	}

	public boolean isNumber() {
		if (vowel == '1' || vowel == '2' || vowel == '3' || vowel == '4' || vowel == '5' || vowel == '6')
			return true;
		return false;
	}

	public boolean isAlphabate() {
		if (vowel >= (int) 'a' && vowel <= (int) 'z')
			return true;
		return false;
	}

	public boolean isConsonent() {
		if (vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u') {
			return false;
		}
		return true;
	}

}
