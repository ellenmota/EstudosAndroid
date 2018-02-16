package com.ellenmota.construtores;

public class ClassePrincipal {

	public static void main(String[] args) {

		//Conta Top
		Conta contaTop = new Conta(777777);
		System.out.println(contaTop.verRelatorioConta());
		contaTop.depositar(5000);
		contaTop.depositar(3000);
		System.out.println(contaTop.verRelatorioConta());
		
		//Conta Estudante
		Conta contaEstudante = new Conta(666666);
		System.out.println(contaEstudante.verRelatorioConta());
		contaEstudante.depositar(1000);
		System.out.println(contaEstudante.verRelatorioConta());
		contaEstudante.sacar(460);
		System.out.println(contaEstudante.verRelatorioConta());
	}

}
