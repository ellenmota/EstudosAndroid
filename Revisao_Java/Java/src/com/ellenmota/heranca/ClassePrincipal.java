package com.ellenmota.heranca;

public class ClassePrincipal {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		animal.correr();
		
		Cao cao = new Cao();
		cao.correr();
		cao.latir();
		
		Passaro passaro = new Passaro();
		passaro.voar();
		
	}

}
