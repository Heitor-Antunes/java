package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {
	
	public static void main(String[] args) {
	
		Integer refNumero = Integer.valueOf(10); //Autoboxing
		System.out.println(refNumero.intValue()); //Unboxing
		
		Double dRef = Double.valueOf(5.0);
		System.out.println(dRef.doubleValue());
		
		Number refNumber = Float.valueOf(10.2f);
		System.out.println(refNumber);
		
		List<Number> lista = new ArrayList<>();
		lista.add(10);
		lista.add(20.5);
		lista.add(15.5f);
		
		
	}

}
