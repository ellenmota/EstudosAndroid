package com.ellenmota.heranca;

public class Animal {

	private String tamanho;
	private String cor;
	
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getTamanho() {
		return this.tamanho;
	}
	
	public String getCor() {
		return this.cor;
	}
	
	public void correr() {
		System.out.println("Correr como animal");
	}
}
