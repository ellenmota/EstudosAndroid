package com.ellenmota.construtores;

public class Conta {

	private int numeroConta;
	private double saldo;
	
	//Construtor: Facilidade em inicializar o objeto instanciado.
	public Conta(int conta) {
		this.numeroConta = conta;
		this.saldo = 0;
	}
	
	public int getNumeroConta() {
		return this.numeroConta;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public void sacar(double valor) {
		this.saldo -= valor;
	}
	
	public String verRelatorioConta() {
		return "\nConta: \n\tNumero da conta: "+this.getNumeroConta()+"\n\tSaldo: "+this.getSaldo();
	}
}
