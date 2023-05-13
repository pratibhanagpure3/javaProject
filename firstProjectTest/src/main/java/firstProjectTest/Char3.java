package firstProjectTest;

public class Char3 {
	char ch;

	public Char3(char ch) {
		this.ch = ch;
	}

	public boolean isVowel() {
		if (ch == 'a' || ch == 'e' || ch == 'o' || ch == 'i' || ch == 'u')
			return true;
		return false;
	}

	public boolean isNumber() {
		if (ch == '2' || ch == '3')
			return true;
		return false;
	}

}
