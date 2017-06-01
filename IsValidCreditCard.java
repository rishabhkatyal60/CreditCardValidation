public class IsValidCreditCard {

	public boolean checkCountOfDigitsInCreditCard(String creditCardNumber) {

		if (creditCardNumber.length() == 16) {

			return true;

		} else {
			return false;
		}

	}

	public boolean checkCreditCardNumberIsValid(String creditCardNumber) {

		int sum = 0;

		boolean secondDigitStartingFromRight = false;
		for (int i = creditCardNumber.length() - 1; i >= 0; i--) {

			int number = Integer.parseInt(creditCardNumber.substring(i, i + 1));
			if (secondDigitStartingFromRight==true) {
				number =number* 2;
				if (number > 9) {
					number = (number % 10) + 1;
				}
			}
			sum += number;
			secondDigitStartingFromRight = !secondDigitStartingFromRight;
		}
		if (sum%10==0)
		{
			return true;
		}
		else {
			return false;
		}
		
	}

}
