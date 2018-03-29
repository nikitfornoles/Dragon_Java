public class Eagle implements Creature {
	private double wingspan;
	private int talonSharpness;
	private int position;
	private int flyingRange;
	
	public void setWingspan (double w) {
		wingspan = w;
	}
	
	public void setTalonSharpness (int t) {
		talonSharpness = t;
	}
	
	public void setPosition (int p) {
		position = p;
	}
	
	public double getWingspan () {
		return wingspan;
	}
	
	public double getTalonSharpness () {
		return talonSharpness;
	}
	
	public int getPosition () {
		return position;
	}
	
	public int getFlyingRange () {
		return flyingRange;
	}
	
	public void fly (int r) {
		flyingRange = r;
	}
	
	public void spy () {
		position = position + getFlyingRange ();
	}
	
	public String sendMessage (String recipientName) {
		return (recipientName + ", I'm at position " + position + ". Send some backup.");
	}
	
	public void sleep (int N) {
		wingspan = wingspan + N;
	}
	
    public void eat (String f) {
		if (f == "fish") { wingspan = wingspan + 5; }
		else if (f == "monkey") { wingspan = wingspan + 10; }
	}
}