package firstProjectTest;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class WrapperRun {
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		System.out.println(LocalDate.now()); // date

		LocalDateTime now1 = LocalDateTime.now();
		System.out.println(now1); // time

		LocalDate today = LocalDate.now();
		System.out.println(today.getYear()); // year
		System.out.println(today.getDayOfWeek()); // day
		System.out.println(today.getDayOfMonth()); // month ka kon s no ka day h
		System.out.println(today.getDayOfYear()); // year ka kon s no ka day h
		System.out.println(today.getMonth()); // kon sa month h
		System.out.println(today.getMonthValue()); // kon s num ka month h
		System.out.println(today.isLeapYear()); // kya leapyear h
		System.out.println(today.lengthOfYear()); // current year m kitne day h
		System.out.println(today.lengthOfMonth()); // current month m kitne day h
		System.out.println(today.plusDays(100)); // 100 day bad ki date
		System.out.println(today.plusMonths(100)); // 100 month ki date
		System.out.println(today.plusYears(8));// 8 sal bad ki date
		System.out.println(today.minusYears(8));// 8 sal pehle ki date
	}
}
