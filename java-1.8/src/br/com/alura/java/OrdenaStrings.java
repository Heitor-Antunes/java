package br.com.alura.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenaStrings {
	
	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<>();
		
		nomes.add("Heitor");
		nomes.add("Juliana");
		nomes.add("Aslvaro");
		nomes.add("Ana Cláudia");
		nomes.add("Heloísa");
		nomes.add("Chad");
		
		for(String nome : nomes) {
			System.out.println(nome);
		}
		
		Collections.sort(nomes);
		System.out.println("Lista ordenada de forma lexicográfica");
		nomes.forEach(nome -> System.out.println(nome));
	
		System.out.println("Lista ordenada por tamanho do String");
		Comparator comparador = new ComparadorPorTamanho();
		Collections.sort(nomes, comparador);
		nomes.forEach(nome -> System.out.println(nome));

	}
}

class ComparadorPorTamanho implements Comparator<String> {

	@Override
	public int compare(String n1, String n2) {
		if(n1.length() < n2.length()) {
			return -1;
		}
		if(n1.length() > n2.length()) {
			return 1;
		} return 0;
	}

	
	
}

