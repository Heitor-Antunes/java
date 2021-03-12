package br.com.alura.java;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Exercicios {
	
	public static void main(String[] args) {
		
		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");
		
		Consumer<String> consumidor = new ImprimeNaLinha();			
		palavras.forEach(consumidor);
		
	}

}

class ImprimeNaLinha implements Consumer<String> {

	@Override
	public void accept(String s) {
		System.out.println(s);
	}
	
}
