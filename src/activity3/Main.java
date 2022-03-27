package activity3;

import java.util.Scanner;

import activity2.ConsoleInput;

public class Main {
	public static void main(String[] args) {
		new Main();
	}
	
	
	Main(){
		 final Ninja.Builder builder = new Ninja.Builder();
		Ninja ninja = builder.setName("Diego").setFuerza(199).setValentia(20).setVestimenta("Vestimenta Ninja").addArma("Kunai").build();
		System.out.println(ninja.toString());
	}
}
