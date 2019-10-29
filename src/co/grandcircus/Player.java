package co.grandcircus;

public abstract class Player {

	private String name;
	
	public Player(String name) {
		this.name = name;
	}
	public Player() {
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public abstract Roshambo generateRoshambo();
}
