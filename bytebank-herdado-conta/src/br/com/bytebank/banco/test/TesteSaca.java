package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteSaca {
	
	public static void main(String[] args) {
		
		Conta conta = new ContaCorrente(9090, 1234);
		
		conta.deposita(250);
		
		try {
			conta.saca(280);
		} catch(SaldoInsuficienteException ex) {
			System.out.println(ex.getMessage());	
		}
		
		System.out.println(conta.getSaldo());
	}

}
