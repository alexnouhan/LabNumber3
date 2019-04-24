import java.util.Scanner;

public class LabNumber3 {

	public static void main(String[] args) {

		// integer evaluator by Alex Nouhan
		// Grand Circus 2019

		// Create scanner and declare variables

		Scanner scan = new Scanner(System.in);
		String name = "";
		char userChar = 'y';
		int userInt = 1;
		boolean even = true;
		boolean range = true;
		int checkInt = 0;

		// Greet user

		System.out.print("Hi, what is your name?: ");
		name = scan.nextLine();

		// main loop body
		do {
			// reset even boolean
			even = true;

			// prompt user for integer
			System.out.print("Hello, " + name + ", " + "please enter an integer: ");

			// validate entry is an integer

			do {
				while (!scan.hasNextInt()) {
					System.out.print("Please enter an integer, 1-100, try again: ");
					scan.nextLine();
				}
				System.out.print("Please enter an integer, 1-100, try again: ");
				userInt = scan.nextInt();

			} while (userInt < 1 || userInt > 100);

			System.out.println();
			
			// Evaluate Integer

			// Odd check
			if (userInt % 2 != 0) {
				System.out.println(userInt + " is Odd...");
				even = false;
			}

			// Even conditions check
			if (even == true) {

				if (userInt >= 2 && userInt <= 25) {
					System.out.println("Even and less than 25.");

				} else if (userInt >= 26 && userInt <= 60) {
					System.out.println("Even");

				} else if (userInt > 60) {
					System.out.println(userInt + " Even");
				}

			} else if (even == false && userInt > 60) {
				System.out.println("Odd and over 60.");
			}

			// Ask to continue and validate entry
			System.out.println("Continue? (y/n): ");
			do {

				userChar = scan.next().charAt(0);
				userChar = Character.toLowerCase(userChar);

				if (userChar != 'y' && userChar != 'n') {
					System.out.println("Sorry, please try again! (y/n): ");
				}

			} while (userChar != 'y' && userChar != 'n');

			scan.nextLine();
			System.out.println("----------------");

		} while (userChar == 'y');

		// If userChar = 'n' end program

		System.out.println("Goodbye, " + name + "!");

		scan.close();
	}

}
