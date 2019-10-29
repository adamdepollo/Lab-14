package co.grandcircus;

public enum Roshambo {
	ROCK, PAPER, SCISSORS;
	@Override
	public String toString() {
		switch (this) {
		case ROCK:
			return "rock";
		case PAPER:
			return "paper";
		case SCISSORS:
			return "scissors";
		default:
			return null;
		}
	}
}
