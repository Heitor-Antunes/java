package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class Teste {

	public static void main(String[] args) {

		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		ContaCorrente cc1 = new ContaCorrente(123, 321);
		ContaCorrente cc2 = new ContaCorrente(321, 123);
		ContaPoupanca cp1 = new ContaPoupanca(456, 654);
		Cliente cliente = new Cliente();
		cliente.setNome("Juliana");
		
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cp1);
		
		System.out.println("Tamanho do Array: " + lista.size());
		
		//Cast não é necessário, pois foi definido que o Array armazena ref tipo Contas
		Conta ref = lista.get(2);
		
		System.out.println(ref);
		
		lista.remove(1);
		
		System.out.println("Tamanho do Array: " + lista.size());
		
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		System.out.println("-----------");
		
		for (Object oRef : lista) {
			System.out.println(oRef);
		}
	}

}
