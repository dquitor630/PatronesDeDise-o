package activity2;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Factory2 extends Factory {

	private static final Factory2 instance = new Factory2();
	private final static LocalDate currentDate = LocalDate.now();

	public static Factory2 getInstance() {
		return instance;
	}

	public Warrior create(int stage, String name) {
		if (stage >= 1 && stage <= 2 && currentDate.getDayOfWeek() == DayOfWeek.SUNDAY) {
			return new Ninja(name);
		} else if (stage >= 3 && stage <= 4) {
			return new Samurai(name);
		} else if (stage >= 1 && stage <= 2 && currentDate.getDayOfWeek() == DayOfWeek.SUNDAY) {
			return new Ninja(name);
		} else {
			return new Barbarian(name);
		}
	}

}
