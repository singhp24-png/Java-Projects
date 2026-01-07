import java.util.Scanner;

// Prabhlean Singh
// 9/28/2023
// A program that lets the user enter a credit card number, validates it and gives the name of a company that is on the credit card
public class SinghPrabhleanCreditCardValidation {

	public static void main(String[] args) {
		// Variable declaration
		String creditCardNum; 
		char repeat = 'N'; 
		
		// Prepares the scanner
		Scanner input = new Scanner(System.in); 
		
		do{
			// Gets input
			System.out.print("Enter a credit card number as a long integer: ");
			creditCardNum = input.next(); 
			
			
			// Prints out the correct statement if the credit card is valid or not
			if(isValid(creditCardNum))
				System.out.printf("%s is a valid %s card\n", creditCardNum, getCreditCardCompany(creditCardNum)); 
	
			else
				System.out.printf("%s is invalid.\n", creditCardNum); 
			
			do{
				System.out.print("Again?  (Y/N) "); 
				repeat = Character.toUpperCase(input.next().charAt(0));
			} while(repeat != 'N' && repeat != 'Y'); 
		
		} while (repeat != 'N'); 
	}

	/**
	 * Function validates the credit card using the mod10 check and other limitations such as all digits, length, or invalid credit card company
	 * @param number
	 * @return
	 */
	public static boolean isValid(String number) {
		
		if (!(number.matches("[0-9]+")))
			return false;
		
		else if (number.length() < 13 && number.length() > 16)
			return false;
		
		else if ((sumOfDoubleEvenPlaces(number) + sumOfOddPlaces(number)) % 10 != 0)
			return false;
		
		else if (getCreditCardCompany(number).compareTo("NA") == 0)
		{
			return false;
		}
		
		else
			return true; 

}
	/**
	 * Function gets the sum of the double even places by using a for loop to skip odd numbers
	 * @param number
	 * @return
	 */
	public static int sumOfDoubleEvenPlaces(String number) {
		
		int sum = 0; 
		int digit; 
		
		// Starts at the even digit, skipping 2 to go to each even number
		for (int i = number.length() - 2; i >= 0; i-=2){
			
			// Converts character to the number and multiply by 2
			digit = (number.charAt(i) - '0') * 2;
			
			if (digit > 9)
				digit -= 9;
			
			sum += digit; 
		}
		return sum; 
		
	}
	
	/**
	 * Function gets the sum of the odd places by using a for loop to skip even numbers
	 * @param number
	 * @return
	 */
	public static int sumOfOddPlaces(String number)	{
		int sum = 0; 
		
		// Starts at the odd digit, skipping 2 to go to each odd number
		for (int i = number.length() - 1; i >= 0; i-=2){
			
			// Converts character to the number and adds it to sum
			sum += number.charAt(i) - '0'; 
		}
		return sum; 
		
	}
	
	/**
	 * Returns a string of the card company if the first digit corresponds with it. Else, it return NA 
	 * @param number
	 * @return
	 */
	public static String getCreditCardCompany(String number)
	{ 
		char firstDigit = number.charAt(0); 
		
		if (number.startsWith("37"))
		{
			return "America Express"; 
		}
		
		else
		{
			switch (firstDigit)
			{
			case '4': return "Visa";    
			
			case '5': return "MasterCard";
			
			case '6': return "Discover";
			
			default: return "NA"; 
			}
		}
	}
}
