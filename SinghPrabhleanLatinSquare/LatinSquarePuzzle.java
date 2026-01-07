import java.util.Arrays;
import java.util.Scanner;

public class LatinSquarePuzzle {
	private Scanner input;
	
	// I am assuming that the dimension of this latin square program does not change
	
	// Feel free to change the colors.
	private final int DIM = 4;	// 4x4 Latin Square
	private final String TEXTCOLOR = "\u001B[34m\u001B[49m";
	private final String VARCOLOR = "\u001B[31m\u001B[42m";  // Color code for the variables in the square.
	
	// The puzzle must be solved with only the digits in this string.
	private String legalDigits = "2 6 7 8";	 
	
	private char latinSquare[][] = {
			{'7', 'A', 'B', '2'},
			{'C', '2', '8', 'D'},
			{'E', '7', '2', 'F'},
			{'2', 'G', 'H', '8'}
			};
	
	private char operators[] = {'x','+','-', '='}; 
	
	private int rowAnswers[] = {60, 13, 52, 11};
	
	private int columnAnswers[] = {48, 17, 43, 12};
	

	/**
	 * Construct a LatinSquarePuzzle object
	 */
	public LatinSquarePuzzle() {
		input = new Scanner(System.in);
		
	}

	/**
	 * This method controls the game.
	 */
	public void go() {
		
		boolean win = false; 
		
		displayTheRules();
		displayTheSquare();
		inputTheSolution();
		win = checkTheSquare();

		

	}
	
	/**
	 * Display the rules and the legal digits.
	 */
	private void displayTheRules() {
		System.out.println(TEXTCOLOR + "Solve the Latin Square Puzzle!");
		System.out.print("The legal digits for this puzzle are: " + legalDigits);
		System.out.println("\nEach digit can be used only 1 time in each column and each row.\n");
	}
	
	/**
	 * Display the square
	 */
	private void displayTheSquare() {
		// TODO: Write the code that displays the square.
		//		This part is challenging.  It involves several loops and decisions.
		//		Don't try to solve it all at once.  Write - test - write - test - write ...
		
		// This for loop prints all of the latin square besides the column answer row
		for (int row = 0; row < DIM; row++) {
			for (int column = 0; column < DIM; column++) {
				if (Character.isLetter(latinSquare[row][column]))
					System.out.print(VARCOLOR + latinSquare[row][column] + TEXTCOLOR + " " + operators[column] + " ");
				else
					System.out.print(latinSquare[row][column] +" " + operators[column] + " ");
			}
			System.out.print(rowAnswers[row] + "\n\n"); 
			for (int occurance = 0; occurance < DIM; occurance++)
				System.out.print(operators[row]+ "   ");
			System.out.println("\n");
		}
		
		// This for loop prints the column answer row
		for (int columnAnswer = 0; columnAnswer < DIM; columnAnswer++)
			System.out.print(columnAnswers[columnAnswer] + "  ");
		System.out.println("\n");
		
	}
	
	/**
	 * Input the digits from the user to solve the puzzle.
	 */
	private void inputTheSolution() {
		
		System.out.print("Enter your solution for each variable.\n");
		for (int row = 0; row < DIM; row++) {
			for (int column = 0; column < DIM; column++) {
				if (Character.isLetter(latinSquare[row][column])) {
					System.out.print(latinSquare[row][column] + ": ");
					latinSquare[row][column] = (input.next()).charAt(0); 
				}
			}
		}
	}
	
	/**
	 * Copy the original square into a temporary work space so we can go back to the original.
	 */
	private void copySquare() {
		
		char[][] temp = new char[DIM][DIM]; 
		
		int row = 0; 
		for (char[] build : latinSquare) {
			temp[row] = build.clone();
			row++;
		}
		
    }
	
	/**
	 * See if the puzzle is solved.
	 * @return true if the solution is correct, otherwise false.
	 */
	private boolean checkTheSquare() {
		// Note:  This method returns false as soon as a wrong answer is discovered.
		
		boolean flag = true; 
		int rowAnsindex = 0; 
		// Checks the rows 
		for (char latinRow[] : latinSquare) {
			
			// Makes string for checking with .compare later
			String checkRow = new String();
			
			// Clones to not affect the latinSquare array
			char[] row1 = latinRow.clone(); 

			// Sorts array for row comparison 
			Arrays.sort(row1);

			
			for (int ch = 0; ch < DIM; ch++)
				checkRow += " " + row1[ch]; 

			if (!checkRow.contains(legalDigits) && (latinRow[0] - '0') * (latinRow[1] - '0') + (latinRow[2] - '0') - (latinRow[3] - '0') == rowAnswers[rowAnsindex]) {
				flag = false;
				break; 
			}
		}
			// Checks the columns 
		if (!flag) {
			char[] latinColumn = new char[DIM];
			
			
			for (int column = 0; column < DIM; column++) {
						
				for (int row = 0; row < DIM; row++) {
					}
				
				// Copy for calculations
				char [] copylatinColumn = latinColumn.clone(); 
				
				// Sort array for column comparison 
				Arrays.sort(copylatinColumn);
				
				String checkColumn = new String(); 
				
				for (char c : copylatinColumn)
						checkColumn += " " + c; 
				
				if (!checkColumn.contains(legalDigits) && (latinColumn[0] - '0') * (latinColumn[1] - '0') + (latinColumn[2] - '0') - (latinColumn[3] - '0') == rowAnswers[rowAnsindex]) {
					flag = false;
					break; 
				
				
				}
						
			}
		}
				
				

		return flag;  // Just to make the compiler happy.  Fix this later.
	}
}
