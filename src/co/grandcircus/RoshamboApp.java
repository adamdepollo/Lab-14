package co.grandcircus;

import java.util.Scanner;

public class RoshamboApp {
	public static Scanner scnr = new Scanner(System.in);

	public static void main(String[] args) {
		// Declare variables
		String cont = "yes";
		int wins = 0;
		int losses = 0;
		int ties = 0;
		Player opponent = null;

		System.out.println("WELCOME TO ROSHAMBO ...");

		// Get the user's name as input and create a Player object using their name
		System.out.println("Enter your name:");
		Player user = new User(scnr.nextLine());

		// Use Validator to get user's choice of opponent and assign the opponent object
		// based on their choice
		String prompt = "Alright " + user.getName()
				+ ", pick your challenger (enter the number):\n1. Rocky\n2. Rando\n";
		switch (Validator.getInt(scnr, prompt, 1, 2)) {
		case 1:
			opponent = new Rocky();
			break;
		case 2:
			opponent = new Rando();
			break;
		}

		// Loop program until user doesn't want to play anymore
		while (cont.equalsIgnoreCase("yes")) {

			// Call methods to get result of roshambo and increment win/loss/tie amounts
			// based on outcome. getResult() returns an int based on who lost or won.
			switch (getResult(user.generateRoshambo(), opponent.generateRoshambo(), user.getName(),
					opponent.getName())) {
			case 0:
				ties++;
				break;
			case 1:
				losses++;
				break;
			case 2:
				wins++;
				break;
			}

			// Call method to display a tally of wins, losses, and ties
			tallyResults(ties, losses, wins);
			
			//Ask user if they want to contineu and use Validator.getCont to validate input
			System.out.println("Do you want to continue? (yes/no)");
			cont = Validator.getCont(scnr);
		}

		//Say bye and close scanner
		System.out.println("Bye!");
		scnr.close();
	}

	//This method prints the results of the roshambo round and returns an int based on the results
	public static int getResult(Roshambo userThrow, Roshambo opponentThrow, String userName, String opponentName) {
		System.out.println(userName + " threw: " + userThrow + "\n" + opponentName + " threw: " + opponentThrow);
		if (userThrow == opponentThrow) {
			System.out.println("It's a tie!");
			return 0;
		} else if (userThrow.equals(Roshambo.ROCK) && opponentThrow.equals(Roshambo.PAPER)) {
			System.out.println("You lose!");
			return 1;
		} else if (userThrow.equals(Roshambo.ROCK) && opponentThrow.equals(Roshambo.SCISSORS)) {
			System.out.println("You win!");
			return 2;
		} else if (userThrow.equals(Roshambo.PAPER) && opponentThrow.equals(Roshambo.ROCK)) {
			System.out.println("You win!");
			return 2;
		} else if (userThrow.equals(Roshambo.PAPER) && opponentThrow.equals(Roshambo.SCISSORS)) {
			System.out.println("You lose!");
			return 1;
		} else if (userThrow.equals(Roshambo.SCISSORS) && opponentThrow.equals(Roshambo.ROCK)) {
			System.out.println("You lose!");
			return 1;
		} else if (userThrow.equals(Roshambo.SCISSORS) && opponentThrow.equals(Roshambo.PAPER)) {
			System.out.println("You win!");
			return 1;
		}
		return 0;
	}

	//This method prints a formatted tally of wins/losses/ties
	public static void tallyResults(int ties, int losses, int wins) {
		System.out.println("Wins   | " + wins + "\nLosses | " + losses + "\nTies   | " + ties + "\n");
	}

}
