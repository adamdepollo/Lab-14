package co.grandcircus;

public class Rando extends Player {

	public Rando(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public Rando() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getName() {
		return "Rando";
	}

	// For Rando, the generateRoshambo method generates a random number 1-3 and
	// returns a Roshambo based on the randomly generated number
	@Override
	public Roshambo generateRoshambo() {
		double pick = (Math.random() * ((3 - 1) + 1)) + 1;
		switch ((int) pick) {
		case 1:
			return Roshambo.ROCK;
		case 2:
			return Roshambo.PAPER;
		case 3:
			return Roshambo.SCISSORS;
		default:
			return null;
		}
	}

}
