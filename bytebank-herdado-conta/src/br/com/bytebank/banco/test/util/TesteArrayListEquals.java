package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayListEquals {

	public static void main(String[] args) {

		ArrayList<Conta> lista = new ArrayList<Conta>();
				
		ContaCorrente cc1 = new ContaCorrente(123, 321);
		ContaPoupanca cp1 = new ContaPoupanca(321, 123);
								//Possui os mesmos valores de cc1
		ContaCorrente cc2 = new ContaCorrente(123, 321);
		
		lista.add(cc1);
		lista.add(cp1);
		
		boolean existe = lista.contains(cc2);
		System.out.println("Já existe? " + existe);
		
		for(Conta conta : lista) {
			System.out.println(conta);
		}
	
	}
}