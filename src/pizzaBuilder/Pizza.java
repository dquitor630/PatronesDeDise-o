package pizzaBuilder;

import java.util.ArrayList;

public abstract class Pizza {
	private final String salsa;
	private final String nombre;
	private final String masa;
	private ArrayList<Proteina> proteinas;
	private ArrayList<Vegetal> vegetales;

	protected Pizza(Builder builder) {
		this.salsa = builder.salsa;
		this.nombre = builder.nombre;
		this.masa = builder.masa;
		this.proteinas = builder.proteinas;
		this.vegetales = builder.vegetales;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + "\n" + "Masa: " + masa + "\n" + "ingredientes: " + proteinas.toString()
				+ vegetales.toString() + "\n";
	}

	public abstract static class Builder {
		protected final String salsa;
		protected String nombre;
		protected String masa;
		protected ArrayList<Proteina> proteinas = new ArrayList<>();
		protected ArrayList<Vegetal> vegetales = new ArrayList<>();

		public Builder(String salsa) {
			this.salsa = salsa;
		}

		public abstract Builder setNombre(String nombre);

		public abstract Builder setMasa(boolean bol);

		public abstract Builder addProteina(Proteina proteina);

		public abstract Builder addVegetale(Vegetal vegetal);

		public abstract Pizza build();

		public void reset() {
			nombre = null;
			masa = null;
			proteinas.clear();
			vegetales.clear();
		}

		protected void validateMandatoryFields() {
			if (nombre == null || nombre.isEmpty()) {
				throw new IllegalStateException("Nombre is mandatory");
			}
			if (masa == null) {
				throw new IllegalStateException("masa is mandatory");
			}
		}

	}
}
