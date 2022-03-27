package pizzaBuilder;

public class PizzaTomate extends Pizza {
	private Tomate tomate;

	private PizzaTomate(Builder builder, Tomate tomate) {
		super(builder);
		this.tomate = tomate;
	}

	@Override
	public String toString() {
		return super.toString() + "Tipo de tomate:" + tomate;
	}

	public static class BuilderTomate extends Pizza.Builder {
		private static final String salsa = "Tomate";
		private Tomate tomate;

		public BuilderTomate(Tomate tomate) {
			super(salsa);
			this.tomate = tomate;
		}

		@Override
		public Builder setNombre(String nombre) {
			this.nombre = nombre;
			return this;
		}

		@Override
		public Builder setMasa(boolean bol) {
			if (bol == true) {
				masa = MasaTomate.CLASICA.getDescripcion();
			} else {
				masa = MasaTomate.CRUJIENTE.getDescripcion();
			}
			return this;
		}

		@Override
		public Builder addProteina(Proteina proteina) {
			proteinas.add(proteina);
			return this;
		}

		@Override
		public Builder addVegetale(Vegetal vegetal) {
			vegetales.add(vegetal);
			vegetales.add(vegetal);
			return this;
		}

		@Override
		public Pizza build() {
			validateMandatoryFields();
			PizzaTomate pizza = new PizzaTomate(this, tomate);
			reset();
			return pizza;
		}

	}
}