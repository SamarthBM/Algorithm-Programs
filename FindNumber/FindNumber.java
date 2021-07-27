
/****************************************************************
 * Purpose : Takes a command-line argument N, asks you to think of a number between 0 and N-1, 
 * where N = 2^n, and always guesses the answer with n questions
 * 
 * @author Samarth BM
 * 
 ***************************************************************/
import java.util.Scanner;

public class FindNumber {
	static Scanner sc = new Scanner(System.in);
	
	/**
	 * Purpose: Method to guess till user gets mid value.
	 * 
	 * @param upperBound.
	 */
	public static void searchNumber(int upperBound) {
		int low = 0;
		int high = upperBound - 1;

		while (low <= high) {
			int midVal = (low + high) / 2;
			System.out.println("Press 0 if the number is " + midVal);
			System.out.println("Press 1 if the number is between " + low + " to " + midVal);
			System.out.println("Press 2 if the number is between " + (midVal + 1) + " to " + high);

			int choice = sc.nextInt();

			if (choice == 0) {
				System.out.println("Got the number " + midVal);
				break;
			} else if (choice == 1) {
				high = midVal;
			}

			else if (choice == 2) {
				low = midVal + 1;
			}
		}
	}

	public static void main(String[] args) {
		System.out.print("Enter the upper bound to determine the element: ");
		int n = sc.nextInt();

		int upperBound = (int) Math.pow(2, n);

		System.out.println("Think of a number between 0 to " + (upperBound - 1));
		int number = sc.nextInt();

		searchNumber(upperBound);

	}

}
