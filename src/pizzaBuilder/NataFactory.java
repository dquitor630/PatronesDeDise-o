package pizzaBuilder;

import pizzaBuilder.PizzaNata.BuilderNata;

public class NataFactory implements Factory {
	private static NataFactory instance = null;

	public static NataFactory getInstance() {
		if (instance == null) {
			instance = new NataFactory();
		}
		return instance;
	}

	@Override
	public Pizza create(boolean salsa, boolean carne, boolean masa) {
		Nata nata;
		if (salsa) {
			nata = Nata.NORMAL;
		} else {
			nata = Nata.ESPESA;
		}
		if (carne) {
			return new BuilderNata(nata).addProteina(Proteina.BACON).addVegetale(Vegetal.CEBOLLA)
					.addVegetale(Vegetal.CHAMPIÑON).setNombre("Carbonara").setMasa(masa).build();
		} else {
			return new BuilderNata(nata).addProteina(Proteina.ATUN).addProteina(Proteina.HUEVO)
					.addVegetale(Vegetal.CEBOLLA).setNombre("Vegetal").setMasa(masa).build();
		}
	}
}