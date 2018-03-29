public class Lucas extends  Dragon{
	public Lucas () {
		setName ("Lucas");
		setHabitat ("Haunted Towers");
		setColor ("Black");
		setLength (240);
	}
	
	public void moveForward () {
		setLocation (getLocation() + 7);
	}
	
	public void moveBackward () {
		setLocation (getLocation() - 7);
	}
	
	public void attack () {
		setAttackIntensity (getAttackIntensity ()*getAttackIntensity ());
	}
}