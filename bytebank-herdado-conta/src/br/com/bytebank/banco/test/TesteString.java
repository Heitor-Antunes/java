package br.com.bytebank.banco.test;

public class TesteString {

	public static void main(String[] args) {

		String nome = "Alura";
		System.out.println(nome);
		
		String vazio = " ";
		System.out.println(vazio.isEmpty());
		
		String outroVazio = vazio.trim();
		System.out.println(outroVazio.isEmpty());
		
		int tam = nome.length();
		System.out.println(tam);
		
		for(int i = 0; i < nome.length(); i++) {
//			System.out.println(i);
			System.out.println(nome.charAt(i));
		}
		
		String sub = nome.substring(2);
		System.out.println(sub);
		
//		int ra = nome.indexOf("ra");
//		System.out.println(ra);
//		
//		char u = nome.charAt(2);
//		System.out.println(u);
		
		//Imutabilidade, uma String nunca muda, será a mesma de quando implementada
		//Por isso, é necessário criar outra string
		String outra = nome.replace("A", "a");
		System.out.println(outra);
		
		// É apenas uma forma de mostrar ("system.out") no console, porém o valor
		// da string permanece igual
		System.out.println(nome.toUpperCase());
		System.out.println(nome.toLowerCase());
		System.out.println(nome);
		
		
		
	}

}
