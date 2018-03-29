import java.util.*;

public class CreatureTester {
	public static void main (String [] args) {
		Scanner in = new Scanner (System.in);
		
		String answer = " ";
		char ans = ' ';
		
		Dragon a = new Asher ();
		a.setName ("Asher IV");
		a.setMinAttackDamage (100);
		a.attack ();
		a.setLocation (14);
		System.out.println ("Name: " + a.getName());
		System.out.println ("Habitat: " + a.getHabitat());
		System.out.println ("Color: " + a.getColor());
		System.out.println ("Length: " + a.getLength());
		System.out.println ("Location: " + a.getLocation());
		System.out.println ("Attack Intensity: " + a.getAttackIntensity());
		a.sleep (8);
		System.out.println ("Length after sleeping: " + a.getLength());
		a.eat ("horse");
		System.out.println ("Color after eating: " + a.getColor());
		
		System.out.print ("How would you like Asher to move (f [forward] or b [backward])? ");
		answer = in.nextLine ();
		ans = answer.charAt (0);
		if (ans == 'f') { a.moveForward (); }
		else if (ans == 'b') { a.moveBackward (); }
		System.out.println ("Location: " + a.getLocation() + "\n");
		
		Dragon c = new Carvin ();
		c.setName ("Carvin XVI");
		c.setMinAttackDamage (100);
		c.attack ();
		c.setLocation (55);
		System.out.println ("Name: " + c.getName());
		System.out.println ("Habitat: " + c.getHabitat());
		System.out.println ("Color: " + c.getColor());
		System.out.println ("Length: " + c.getLength());
		System.out.println ("Location: " + c.getLocation());
		System.out.println ("Attack Intensity: " + c.getAttackIntensity());
		c.sleep (8);
		System.out.println ("Length after sleeping: " + c.getLength());
		c.eat ("fish");
		System.out.println ("Color after eating: " + c.getColor());
		
		System.out.print ("How would you like Carvin to move (f [forward] or b [backward])? ");
		answer = in.nextLine ();
		ans = answer.charAt (0);
		if (ans == 'f') { c.moveForward (); }
		else if (ans == 'b') { c.moveBackward (); }
		System.out.println ("Location: " + c.getLocation() + "\n");
		
		Dragon l = new Lucas ();
		l.setName ("Lucas III");
		l.setMinAttackDamage (100);
		l.attack ();
		l.setLocation (33);
		System.out.println ("Name: " + l.getName());
		System.out.println ("Habitat: " + l.getHabitat());
		System.out.println ("Color: " + l.getColor());
		System.out.println ("Length: " + l.getLength());
		System.out.println ("Location: " + l.getLocation());
		System.out.println ("Attack Intensity: " + l.getAttackIntensity());
		l.sleep (8);
		System.out.println ("Length after sleeping: " + l.getLength());
		l.eat ("snake");
		System.out.println ("Color after eating: " + l.getColor());
		
		System.out.print ("How would you like Lucas to move (f [forward] or b [backward])? ");
		answer = in.nextLine ();
		ans = answer.charAt (0);
		if (ans == 'f') { l.moveForward (); }
		else if (ans == 'b') { l.moveBackward (); }
		System.out.println ("Location: " + l.getLocation() + "\n");
		
		System.out.println ("Eagle Info");
		Eagle newAnimal = new Eagle ();
		newAnimal.setWingspan (30);
		System.out.println ("Wingspan: " + newAnimal.getWingspan ());
		
		newAnimal.setTalonSharpness(5);
		System.out.println ("Talon sharpness: " + newAnimal.getTalonSharpness ());
		
		newAnimal.setPosition (2);
		System.out.println ("Position: " + newAnimal.getPosition ());
		
		newAnimal.fly (23);
		newAnimal.spy ();
		System.out.println ("Position after flying: " + newAnimal.getPosition ());
		
		System.out.println ("Message: " + newAnimal.sendMessage ("Reese"));
		
		newAnimal.sleep (12);
		System.out.println ("Wingspan after sleeping: " + newAnimal.getWingspan ());
		
		newAnimal.eat ("monkey");
		System.out.println ("Wingspan after eating: " + newAnimal.getWingspan ());
		
		String name, gender;
		int age;
		
		DragonTrainer pt = new PowerTrainer ();
		
		System.out.println ();
		System.out.println ("------------Account Registration--------------");
		System.out.print ("Enter name: ");
		name = in.nextLine ();
		pt.setName (name);
		System.out.print ("Enter gender: ");
		gender = in.nextLine ();
		pt.setGender (gender);
		System.out.print ("Enter age: ");
		age = in.nextInt ();
		pt.setAge (age);
		
		System.out.println ();
		System.out.println ("----------------Trainer Profile---------------");
		System.out.println ("Name: " + pt.getName ());
		System.out.println ("Gender: " + pt.getGender ());
		System.out.println ("Age: " + pt.getAge ());
		
		DragonTrainer be = new BuildEnhancer ();
	}
}
