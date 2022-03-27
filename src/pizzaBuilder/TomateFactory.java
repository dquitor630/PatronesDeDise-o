package pizzaBuilder;

import pizzaBuilder.PizzaTomate.BuilderTomate;

public class TomateFactory implements Factory {
	private static TomateFactory instance = null;

	public static TomateFactory getInstance() {
		if (instance == null) {
			instance = new TomateFactory();
		}
		return instance;
	}

	@Override
	public Pizza create(boolean salsa, boolean carne, boolean masa) {
		Tomate tomate;
		if (salsa) {
			tomate = Tomate.CASERO;
		} else {
			tomate = Tomate.NORMAL;
		}
		if (carne) {
			return new BuilderTomate(tomate).addProteina(Proteina.CARNE).addProteina(Proteina.CHORIZO)
					.addProteina(Proteina.PEPPERONI).addVegetale(Vegetal.CEBOLLA).addVegetale(Vegetal.PIMIENTO)
					.setNombre("Carne").setMasa(masa).build();
		} else {
			return new BuilderTomate(tomate).addVegetale(Vegetal.CEBOLLA).addVegetale(Vegetal.PIMIENTO)
					.addVegetale(Vegetal.CHAMPIÑON).addVegetale(Vegetal.ACEITUNA).setNombre("Vegetal").setMasa(masa)
					.build();
		}
	}
}