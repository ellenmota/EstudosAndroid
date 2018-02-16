package com.ellenmota;
import java.*;

public class helloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Revisão
		System.out.println("Primeira aplicação!");
		String nome = "Ellen Bianca Mota de Carvalho";
		int idade = 21;
		float peso = (float) 74.2;
		float peso2 = (float) 74.2;
		String nome2 = "hey";
		
		//Condições
		if(nome.equals(nome2)) {
			System.out.println("Nomes iguais");
		}
		if (peso==peso2) {
			System.out.println("Pesos iguais!");
		}
		
		
		//Repetições
		while (peso!=12){
			System.out.println("Diferentão!");
			peso = 12;
		};
		
		do {
			System.out.println("heyy!");
			peso = 11;
		}while(peso!=11);
		
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
		}
		
		
		System.out.println("Meu nome: "+nome+" idade: "+idade+" e peso: "+peso);
	}

}
