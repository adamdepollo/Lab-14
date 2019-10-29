package co.grandcircus;

public class Rocky extends Player {

	public Rocky(String name) {
		super(name);
	}

	public Rocky() {
	}

	@Override
	public String getName() {
		return "Rocky";
	}

	//For Rocky, generateRoshambo always returns ROCK
	@Override
	public Roshambo generateRoshambo() {
		return Roshambo.ROCK;
	}

}
