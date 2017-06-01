import java.util.Scanner;

public class CreditCardCheckProgram {

	public static void main(String args[]) {
		System.out.println("Please Enter Your Credit Card Number");

		Scanner in = new Scanner(System.in); // Read Input From the KeyBoard

		String creditCardNumber = in.next();
		System.out.println();
		System.out.println("Your Credit Card Number is " + creditCardNumber);

		IsValidCreditCard isValid = new IsValidCreditCard();

		boolean valid = isValid
				.checkCountOfDigitsInCreditCard(creditCardNumber); // To Check
																	// if the
																	// Credit
																	// Card is
																	// of 16
																	// Digits or
																	// not

		System.out
				.println("*********************************************************************************");
		System.out.println("Credit Card Number Digit Count Check");

		if (valid == false) {

			System.out
					.println("Credit Card is not of 16 digits: It is an invalid Credit Card");

			System.out.println();
			System.out
					.println("*********************************************************************************");

		} else {

			System.out.println("Credit Card is of 16 Digits");
			System.out.println();
			System.out
					.println("*********************************************************************************");

			boolean validCard = isValid
					.checkCreditCardNumberIsValid(creditCardNumber); // To Check
																		// if
																		// the
																		// Number
																		// is
																		// Valid
																		// or
																		// not

			System.out.println();
			System.out.println("Credit Card Number Validation");

			if (validCard == true) {

				System.out.println("Card is Valid");

			} else {

				System.out.println("Card is not valid");
			}

			System.out.println();
			System.out
					.println("*********************************************************************************");
		}

	}

}
