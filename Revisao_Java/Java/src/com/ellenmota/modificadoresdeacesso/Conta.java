package com.ellenmota.modificadoresdeacesso;

public class Conta {

	//Modificador default: Tem acesso dentro do pacote
	//Modificador public: Todas as terão acesso
	
	//Modificador private: Não tem acesso fora da classe
	private int numeroConta;
	private double saldo = 100;
	
	//Modificador protected: Tem aceso para classes derivadas
	protected String propriedade;
	
	//Os métodos não possui validações, apenas para revisar Java.
	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public void sacar(double valor) {
		this.saldo = this.saldo - valor;
	}
	
	public double meuSaldo() {
		return this.saldo;
	}
}
