package pizzaBuilder;

public enum MasaNata {
	FINA("Masa fina con parmesano"), GRUESA("Masa gruesa con cheddar");
	private final String descripcion;
	private MasaNata(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
}
