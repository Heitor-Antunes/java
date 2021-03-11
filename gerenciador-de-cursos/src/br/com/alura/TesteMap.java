package br.com.alura;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TesteMap {
	
	public static void main(String[] args) {
		
	    Map<String, Integer> nomesParaIdade = new HashMap<>();
        nomesParaIdade.put("Paulo", 31);
        nomesParaIdade.put("Adriano", 25);
        nomesParaIdade.put("Alberto", 33);
        nomesParaIdade.put("Guilherme", 26);
        
        Set<String> chave = nomesParaIdade.keySet();
        for (String chaves : chave) {
        	System.out.println(chaves);
		}
        
        Collection numero = nomesParaIdade.values();
        for (Object numeros : numero) {
			System.out.println(numeros);
		}
        
        
	}

}
