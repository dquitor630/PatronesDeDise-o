package activity3;

import java.util.ArrayList;

public class Ninja {
	private final String nombre;
	private final int fuerza;
	private final int valentia;
	private final String vestimenta;
	private final ArrayList<String> armas;
	
	
	private Ninja(Builder builder) {
		nombre = builder.nombre;
		fuerza = builder.fuerza;
		valentia = builder.valentia;
		vestimenta = builder.vestimenta;
		armas = new ArrayList<>(builder.armas);
	}
	
	
	
	@Override
	public String toString() {
		return "Ninja [nombre=" + nombre + ", fuerza=" + fuerza + ", valentia=" + valentia + ", vestimenta="
				+ vestimenta + ", armas=" + armas + "]";
	}



	public static class Builder{
		public String nombre;
		public  int fuerza;
		public  int valentia;
		public  String vestimenta;
		public  ArrayList<String> armas = new ArrayList();
		
		
		public Builder setName(String nombre) {
			this.nombre = nombre;
			return this;
		}
		
		public Builder setFuerza(int fuerza) {
			this.fuerza = fuerza;
			return this;
		}
		
		public Builder setValentia(int valentia) {
			this.valentia = valentia;
			return this;
		}
		
		public Builder setVestimenta(String vestimenta) {
			this.vestimenta = vestimenta;
			return this;
		}
		
		public Builder addArma(String arma) {
			armas.add(arma);
			return this;
		}
		
		@SuppressWarnings("unused")
		private void validateMandatoryFields() {
			if(nombre == null || nombre.isEmpty()) {
				throw new IllegalStateException("Nombre es obligatorio");
			}
		}
		
		public Ninja build() {
			validateMandatoryFields();
			Ninja ninja = new Ninja(this);
			reset();
			return ninja;
		}
		
		public void reset() {
			nombre = null;
			fuerza = 0;
			valentia = 0;
			vestimenta = null;
			armas.clear();
		}
	}
}
