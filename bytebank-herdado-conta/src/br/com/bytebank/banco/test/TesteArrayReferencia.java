package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencia {
	
	public static void main(String[] args) {
		
//		double[] contas = new double[3];
		ContaCorrente cc1 = new ContaCorrente(123, 321);
		ContaCorrente cc2 = new ContaCorrente(321, 123);
		ContaPoupanca cp1 = new ContaPoupanca(456, 654);
		
//		Conta[] contas = new Conta[3];
		Conta[] contas = {cc1, cc2, cp1};
		
		contas[0] = cc1;
		contas[1] = cc2;
		contas[2] = cp1;
		
		Conta ref = contas[0];
		
		System.out.println(ref.getNumero());
		System.out.println(contas[1]);
		System.out.println(contas[2]);

	}

}
