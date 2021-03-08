package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

	public static void main(String[] args) {

		//Array de primitivos
		int[] idades = new int[5];
		//Array de referências
		String[] nomes = new String[5];
		
		int idade = 10;
		
		List<Integer> numeros = new ArrayList<Integer>();
		//Autoboxing - guarda o valor de um primitivo dentro de um objeto/referência
		numeros.add(20);
		
		//Deprecado
//		Integer idadeRef = new Integer(10);
		Integer idadeRef = Integer.valueOf(10); //Autoboxing
		int valor = idadeRef.intValue(); //Unboxing
		System.out.println(valor);
		
		//Recebe argumento in RunConfigurations
		String s = args[0];
//		Integer numero = Integer.valueOf(s);
		int numero = Integer.parseInt(s);
		System.out.println(numero);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
	}

}
