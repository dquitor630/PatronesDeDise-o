package activity2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main();
	}

	Main() {
		Scanner keyboard = new Scanner(System.in);
		boolean exit = false;
		int fase;
		ConsoleInput consoleIn = new ConsoleInput(keyboard);
		System.out.print("¿Qué desea: la fábrica 1 ó la 2):");
		Factory warriorFactory = requestFactory(consoleIn.readIntInRange(1, 2));
		do {
			System.out.println("¿En qué fase del juego se encuentra?:");
			fase = consoleIn.readIntInRange(1, 6);
			System.out.println("Introduzca el nombre del guerrero:");
			Warrior warrior = warriorFactory.create(fase, consoleIn.readString());
			warrior.creationWarning();
			System.out.println("creado en la fase " + fase);
			System.out.println("¿Desea crear más guerreros? (s/n)");
			if (consoleIn.readBooleanUsingChar('s', 'n')) {

			} else {
				exit = true;
			}
		} while (!exit);
	}

	private Factory requestFactory(int election) {
		if (election == 1) {
			return Factory1.getInstance();
		} else {
			return Factory2.getInstance();
		}
	}

}
