package com.ellenmota.heranca;

public class Cao extends Animal{

	//Metodo especifico desta classe
	public void latir() {
		System.out.println("O cão late!");
	}
	
	//Quando existir o mesmo método da classe pai, é modificada
	public void correr() {
		//Chama o metodo da classe pai
		super.correr();
		System.out.println("O cão corre!");
	}
}
