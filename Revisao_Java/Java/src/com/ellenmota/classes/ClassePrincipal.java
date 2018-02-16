package com.ellenmota.classes;

public class ClassePrincipal {

	public static void main(String[] args) {
		Casa casaSimples = new Casa();
		casaSimples.cor = "Amarelo";
		casaSimples.comodos = 8;
		casaSimples.quantidadeJanela = 10;
		casaSimples.portaoAberto = false;
		
		System.out.println("Casa simples: \n\tCor: "+casaSimples.cor+
				"\n\tComodos: "+casaSimples.comodos+"\n\tJanelas: "+casaSimples.quantidadeJanela);
		casaSimples.abrirPortao();

	}

}
