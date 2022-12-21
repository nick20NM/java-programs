package video5;

import java.util.Scanner;

public class LeapYearChecker {

	public static void main(String[] args) {
		System.out.println("Enter year:"); // 1900, 2100, 2000
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		if ((year%4 == 0 && year%100 != 0) || (year%400 == 0)) {
			System.out.println("Leap year");
		} else {
			System.out.println("Not leap year");
		}
		scanner.close();
	}

}
