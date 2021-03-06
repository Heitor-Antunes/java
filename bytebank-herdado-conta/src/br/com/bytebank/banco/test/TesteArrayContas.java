package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

public class TesteArrayContas {
	
	public static void main(String[] args) {
			
	GuardadorDeContas guardador = new GuardadorDeContas();
	
	ContaCorrente cc = new ContaCorrente(123, 321);
	ContaPoupanca cp = new ContaPoupanca(123, 432);
	
	guardador.adiciona(cc);
	guardador.adiciona(cp);
	
	int tamanho = guardador.getQuantidadeElementos();
	System.out.println(tamanho);
	
	Conta ref = guardador.getReferencia(0);
	System.out.println(ref);
	

	}
}
