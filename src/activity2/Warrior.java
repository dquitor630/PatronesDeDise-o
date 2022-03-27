package activity2;

public abstract class Warrior {
	private final String warriorFaction;
	private final String warriorName;
	
	protected Warrior(String warriorFaction, String warriorName) {
		this.warriorFaction= warriorFaction;
		this.warriorName = warriorName;
	}
	
	public void creationWarning(){
		System.out.print(warriorFaction + " " + warriorName + " ");
	}
}
