package br.com.alura.bytebank;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TestaBiblioteca {

	public static void main(String[] args) {
		
		Conta cc = new ContaCorrente(1010, 1234);
		
		cc.deposita(4700);
		System.out.println(cc.getSaldo());
		

	}

}
