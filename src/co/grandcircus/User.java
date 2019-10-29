package co.grandcircus;

import java.util.Scanner;

public class User extends Player {
	public Scanner scnr = new Scanner(System.in);

	public User(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public User() {
		// TODO Auto-generated constructor stub
	}

	// For user, generateRoshambo uses the Validator.getInt to gather input for what
	// throw they want and return the appropriate Roshambo value.
	@Override
	public Roshambo generateRoshambo() {
		int userChoice = Validator.getInt(scnr,
				"Choose your throw (enter the number): \n1. Rock\n2. Paper\n3. Scissors\n", 1, 3);
		switch (userChoice) {
		case 1:
			return Roshambo.ROCK;
		case 2:
			return Roshambo.PAPER;
		case 3:
			return Roshambo.SCISSORS;
		}
		return null;
	}

}
