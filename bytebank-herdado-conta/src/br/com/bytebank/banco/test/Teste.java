package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.GuardadorDeReferencias;

public class Teste {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente(123, 456);
		ContaPoupanca cp = new ContaPoupanca(123, 654);
		Cliente cliente = new Cliente();
		cliente.setNome("Heitor");
		
		GuardadorDeReferencias guardador = new GuardadorDeReferencias();
		
		guardador.adiciona(cc);
		guardador.adiciona(cp);
		guardador.adiciona(cliente);
		
		int tamanho = guardador.getQuantidadeElementos();
		
		System.out.println(tamanho);
		
		Cliente ref = (Cliente) guardador.getReferencia(2);
		System.out.println(ref.getNome());
		
		
	}

}
