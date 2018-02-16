package com.ellenmota.modificadoresdeacesso;

public class ClassePrincipal {

	public static void main(String[] args) {

		Conta conta = new Conta();
		conta.propriedade = "Ellen Mota";
		conta.depositar(200.00);//300
		conta.sacar(30.00);//270
		
		System.out.print(conta.meuSaldo());
	}

}
