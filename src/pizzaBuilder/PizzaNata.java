package pizzaBuilder;

public class PizzaNata extends Pizza {
	private Nata nata;

	private PizzaNata(Builder builder, Nata nata) {
		super(builder);
		this.nata = nata;
	}

	@Override
	public String toString() {
		return super.toString() + "Tipo de nata:" + nata;
	}

	public static class BuilderNata extends Pizza.Builder {
		private static final String salsa = "Nata";
		private Nata nata;

		public BuilderNata(Nata nata) {
			super(salsa);
			this.nata = nata;
		}

		@Override
		public Builder setNombre(String nombre) {
			this.nombre = nombre;
			return this;
		}

		@Override
		public Builder setMasa(boolean bol) {
			if (bol == true) {
				masa = MasaNata.FINA.getDescripcion();
			} else {
				masa = MasaNata.GRUESA.getDescripcion();
			}
			return this;
		}

		@Override
		public Builder addProteina(Proteina proteina) {
			proteinas.add(proteina);
			proteinas.add(proteina);
			return this;
		}

		@Override
		public Builder addVegetale(Vegetal vegetal) {
			vegetales.add(vegetal);
			return this;
		}

		@Override
		public Pizza build() {
			validateMandatoryFields();
			PizzaNata pizza = new PizzaNata(this, nata);
			reset();
			return pizza;
		}

	}
}
