package firstProjectTest;

import java.math.BigDecimal;

public class SimpleIntrest {
	BigDecimal str;
	BigDecimal str2;

	public SimpleIntrest(String str, String str2) {
		this.str = new BigDecimal(str);
		this.str2 = new BigDecimal(str2);
	}

	public BigDecimal CalculateValue(int noOfYear) {
		// total= principal(str) + principal*intrest(str2)*noOfyear
		BigDecimal years = new BigDecimal(noOfYear);
		BigDecimal total = str.add(str.multiply(str2).multiply(years));
		return total;
	}

}
