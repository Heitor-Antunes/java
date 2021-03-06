package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteHeitor {
		
	public static void main(String[] args) {
		
		
		ContaCorrente cc = new ContaCorrente(123, 321);
		
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		for(int i = 0; i < 15000; i++) {
			lista.add(cc);
			System.out.println(lista.size());
		}
	}

}
