package br.com.alura.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenaStrings {

	public static void main(String[] args) {

		List<String> nomes = new ArrayList<>();

		System.out.println("Adicionando nomes a lista:");
		nomes.add("Heitor");
		nomes.add("Juliana");
		nomes.add("Alvaro");
		nomes.add("Ana Cláudia");
		nomes.add("Heloísa");
		nomes.add("Chad");

		for (String nome : nomes) {
			System.out.println(nome);
		}
		System.out.println("\n");

		Collections.sort(nomes);
		System.out.println("Lista ordenada de forma lexicográfica:");
		//Method Reference
		nomes.forEach(System.out::println);
		System.out.println("\n");

		System.out.println("Lista ordenada por tamanho do String:");
		nomes.sort((n1, n2) -> Integer.compare(n1.length(), n2.length()));
		nomes.forEach( nome -> System.out.println(nome));
		System.out.println("\n");
	}
}

class ComparadorPorTamanho implements Comparator<String> {

	@Override
	public int compare(String n1, String n2) {
		if (n1.length() < n2.length()) {
			return -1;
		}
		if (n1.length() > n2.length()) {
			return 1;
		}
		return 0;
	}

}
