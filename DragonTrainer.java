public abstract class DragonTrainer {
	private String name;
	private String gender;
	private int age;
	private int energy;
	private int trainingExperience;
	protected Dragon trainerDragon;
	
	public DragonTrainer () {
		energy = 100;
		trainingExperience = 0;
	}
	
	public void setName (String n) {
		name = n;
	}
	
	public void setGender (String g) {
		gender = g;
	}
	
	public void setAge (int a) {
		age = a;
	}
	
	public String getName () {
		return name;
	}
	
	public String getGender () {
		return gender;
	}
	
	public int getAge () {
		return age;
	}
	
	private void trainDragon (int h) {
		energy = energy - (h*10);
		trainingExperience = trainingExperience + (h*10);
	}
	
	private void sleep (int N) {
		energy = energy + (N+20);
	}
	
	private void eat (String f) {
		if (f == "meat") { energy = energy + 20; }
		else if (f == "vegetable") { energy = energy + 30; }
		else { energy = energy - 5; }
	}
}
