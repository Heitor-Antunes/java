package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencia {
	
	public static void main(String[] args) {
		
		Conta[] contas = new Conta[5];
		ContaCorrente cc1 = new ContaCorrente(123, 321);
		ContaCorrente cc2 = new ContaCorrente(321, 123);
		ContaPoupanca cp1 = new ContaPoupanca(456, 654);
		
		contas[0] = cc1;
		contas[1] = cc2;
		contas[2] = cp1;

		for(int i = 0; i < contas.length; i++) {
			
			if(contas[i] != null) {
				System.out.println(contas[i]);
			}
		
//		Conta[] contas = new Conta[3];
//		Object[] contas = {cc1, cc2, cp1};
		
		
		//				  Cast
//		Conta ref0 =(ContaCorrente) contas[0];
//		Conta ref1 = contas[1];
//		Conta ref2 = contas[2];
		
//		System.out.println(ref0.getNumero());
//		System.out.println(ref1);
//		System.out.println(ref2);
		
		
		Object[] objs = {"Heitor", 1, true};
//		
		Object ref0 = objs[0];
		Object ref1 = objs[1];
		Object ref2 = objs[2];
		
		System.out.println(ref0);
		System.out.println(ref1);
		System.out.println(ref2);

	}

}}
