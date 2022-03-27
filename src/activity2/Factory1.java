package activity2;

public class Factory1 extends Factory {
	private static Factory1 instance = null;

	public static Factory1 getInstance() {
		if (instance == null) {
			instance = new Factory1();
		}
		return instance;
	}

	public Warrior create(int stage, String name) {
		if (stage >= 1 && stage <= 2) {
			return new Ninja(name);
		} else if (stage >= 3 && stage <= 4) {
			return new Samurai(name);
		} else {
			return new Barbarian(name);
		}
	}
}
