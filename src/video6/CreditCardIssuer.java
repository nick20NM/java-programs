package video6;

import java.util.Scanner;

public class CreditCardIssuer {

	public static void main(String[] args) {
		System.out.println("Enter credit score:");
		Scanner scanner = new Scanner(System.in);
		int creditScore = scanner.nextInt();
		if (creditScore<400 || creditScore>850) {
			System.out.println("Invalid credit score");
		} else {
			if (creditScore>=400 && creditScore<600) {
				System.out.println("Silver card");
			} else if(creditScore>=600 && creditScore<800) {
				System.out.println("Gold card");
			} else {
				System.out.println("Platinum card");
			}
		}
		scanner.close();
	}

}
