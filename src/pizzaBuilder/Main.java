package pizzaBuilder;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main();
	}

	Main() {
		Scanner keyboard = new Scanner(System.in);
		ConsoleInput in = new ConsoleInput(keyboard);
		boolean salsa = false;
		boolean carne = false;
		boolean clasico = false;

		System.out.println("Bienvenido a la pizzería del IES Saladillo");
		do {
			System.out.println("¿La prefiere con la base de nata?: (s/n)");
			if (in.readBooleanUsingChar('s', 'n')) {
				System.out.println("¿La nata le gusta espesa?: (s/n)");
				salsa = in.readBooleanUsingChar('s', 'n');
			} else {
				System.out.println("¿El tomate le gusta casero?: (s/n)");
				salsa = in.readBooleanUsingChar('s', 'n');
			}
			System.out.println("¿La quiere con carne?: (s/n)");
			carne = in.readBooleanUsingChar('s', 'n');
			System.out.println("¿Es usted clásico para la masa?: (s/n)");
			clasico = in.readBooleanUsingChar('s', 'n');
			System.out.println("nAquí tiene su pizza, espero que le guste:");
			if (salsa) {
				NataFactory factory = new NataFactory();
				factory.getInstance();
				Pizza p = factory.create(salsa, carne, clasico);
				System.out.println(p.toString());
			} else {
				TomateFactory factory = new TomateFactory();
				factory.getInstance();
				Pizza p = factory.create(salsa, carne, clasico);
				System.out.println(p.toString());
			}

			System.out.println("¿Desea pedir otra pizza?: (s/n)");
		} while (in.readBooleanUsingChar('s', 'n'));
	}

}
