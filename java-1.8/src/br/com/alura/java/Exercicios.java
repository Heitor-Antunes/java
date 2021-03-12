package br.com.alura.java;

import java.util.ArrayList;
import java.util.List;

public class Exercicios {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();
		palavras.add("Alura Online");
		palavras.add("Casa Do Código");
		palavras.add("caelum");

//		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
//		palavras.sort((s1, s2) -> s1.length() - s2.length());
		palavras.sort(String.CASE_INSENSITIVE_ORDER);
		palavras.forEach(palavra -> System.out.println(palavra));
		
		
//		Function<Usuario, String> funcao = Usuario::getNome;
		
		new Thread(() -> System.out.println("Iniciando Runnable...")).start();;
		
		
	}
}

//class Usuario {
//	private String nome;
//	
//	public String getNome() {
//		return this.nome;
//	}
//}
