package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteObject {
	
	public static void main(String[] args) {
		
//		System.out.println();
//		System.out.println("X");
//		System.out.println(2);
//		System.out.println(true);
		
		println();
		println("Olá");
		println(1);
		println(false);
		
		Conta cc = new ContaCorrente(123, 321);
		Object cp = new ContaPoupanca(321, 123);
		
		System.out.println(cc.toString());
		System.out.println(cp);
		
		println(cc);
		println(cp);
		
	}
	
	static void println() {}
	static void println(String s) {}
	static void println(int a) {}
	static void println(boolean bool) {}
	static void println(Object conta) {}


}
