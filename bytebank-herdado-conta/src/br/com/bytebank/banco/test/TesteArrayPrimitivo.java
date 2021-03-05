package br.com.bytebank.banco.test;

public class TesteArrayPrimitivo {

	public static void main(String[] args) {
		
		int[] idades = new int[5];
		
//		idades[0] = 10;
//		idades[1] = 20;
//		idades[2] = 30;
//		idades[3] = 40;
//		idades[4] = 50;
//		
//		System.out.println(idades[1]);
		
		for(int i = 0; i < idades.length; i++) {
			idades[i] = i * i;
			System.out.println(idades[i]);
		}

	}

}
