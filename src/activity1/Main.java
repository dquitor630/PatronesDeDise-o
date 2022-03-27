package activity1;

public class Main {

	public static void main(String[] args) {
		SingletonDatabase database = SingletonDatabase.INSTANCE;
		System.out.println(database.queryAllNames());
		System.out.println(database.queryAllNumbers());
	}

}
