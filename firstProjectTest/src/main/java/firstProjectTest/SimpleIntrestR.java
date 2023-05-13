package firstProjectTest;

import java.math.BigDecimal;

public class SimpleIntrestR {

	public static void main(String[] args) {

		SimpleIntrest clc = new SimpleIntrest("4700", "7.5");
		// BigDecimal total = new BigDecimal(5);
		BigDecimal total = clc.CalculateValue(5);
		System.out.println(total);
	}

}
