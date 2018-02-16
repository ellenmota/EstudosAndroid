package com.ellenmota.metodos;

public class Metodos {

	public static void main(String[] args) {

		meuMetodo();
		float retorno = somar();
		System.out.println("Retorno da soma: "+retorno);
		System.out.println("Retorno da subtração: "+subtrair(1,9));
	}
	
	//Método - Mostrar Mensagem
	public static void meuMetodo() {
		System.out.print("Meu método!\n");
	}
	
	//Método - Faz a soma sem recebimento de numeros
	public static float somar() {
		return 2+2;
	}
	
	//Método - Faz a subtração com recebimento de numeros
	public static float subtrair(float numero1, float numero2) {
		return numero1-numero2;
	}

}
