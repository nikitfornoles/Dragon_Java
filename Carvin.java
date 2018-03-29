public class Carvin extends  Dragon{
	public Carvin () {
		setName ("Carvin");
		setHabitat ("Twilight Harbor");
		setColor ("Blue");
		setLength (192);
	}
	
	public void moveForward () {
		setLocation (getLocation() + 4);
	}
	
	public void moveBackward () {
		setLocation (getLocation() - 4);
	}
	
	public void attack () {
		setAttackIntensity (getAttackIntensity ()*3);
	}
}