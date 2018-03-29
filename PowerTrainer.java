public class PowerTrainer extends DragonTrainer {
	public void increaseDragonAttack (int h) {
		trainerDragon.setMinAttackDamage (trainerDragon.getMinAttackDamage () +(h*2));
	}
}
