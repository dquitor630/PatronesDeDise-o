package pizzaBuilder;

public enum MasaTomate {
	CLASICA("Masa clasica con mozzarella"), CRUJIENTE("Masa crujiente con gorgonzola");

	private final String descripcion;

	private MasaTomate(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}
}
