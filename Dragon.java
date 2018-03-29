public abstract class Dragon implements Creature {
	private String name;
	private String habitat;
	private String color;
	private double length;
	private int current_location;
	private int attackIntensity;
	private int minAttackDamage;
	
	public Dragon () {
		name = "Spyro";
		habitat = "Dragon World";
		color = "White";
		length = 120;
		current_location = 0;
	}
	
	public void setName (String n) {
		name = n;
	}
	
	public void setHabitat (String h) {
		habitat = h;
	}
	
	public void setColor (String c) {
		color = c;
	}
	
	public void setLength (double l) {
		length = l;
	}
	
	public void setLocation (int loc) {
		current_location = loc;
	}
	
	public void setMinAttackDamage (int mad) {
		minAttackDamage = mad;
		setAttackIntensity (minAttackDamage);
	}
	
	public void setAttackIntensity (int ai) {
		attackIntensity = ai;
	}
	
	public String getName() {
		return name;
	}
	
	public String getHabitat() {
		return habitat;
	}
	
	public String getColor() {
		return color;
	}
	
	public double getLength () {
		return length;
	}
	
	public int getLocation() {
		return current_location;
	}
	
	public int getMinAttackDamage () {
		return minAttackDamage;
	}
	
	public abstract void moveForward ();
	
	public abstract void moveBackward ();
	
	public abstract void attack ();
	
	public int getAttackIntensity () {
		return attackIntensity;
	}
	
	public void sleep (int N) {
		length = length + N;
	}
	
    public void eat (String f) {
		if (f == "fish") { color = "Sparkly"; }
	}
}
