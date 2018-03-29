public class Asher extends  Dragon{
	public Asher () {
		setName ("Asher");
		setHabitat ("Ice Cavern");
		setColor ("Green");
		setLength (144);
	}
	
	public void moveForward () {
		setLocation (getLocation() + 2);
	}
	
	public void moveBackward () {
		setLocation (getLocation() - 2);
	}
	public void attack () {
		setAttackIntensity (getAttackIntensity ()*2);
	}
}