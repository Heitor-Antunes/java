package br.com.alura.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {
	
	public static void main(String[] args) throws IOException {
	
//	OutputStream fos = new FileOutputStream("lorem2.txt");
//	Writer osw = new OutputStreamWriter(fos);
//	BufferedWriter br = new BufferedWriter(osw);
		
	BufferedWriter bf = new BufferedWriter(new FileWriter("lorem.txt"));
	
	
	bf.write("Inserindo caracteres");
	bf.write(System.lineSeparator());
	bf.write("Mais um teste");
	bf.write(System.lineSeparator());
	bf.write("Ok!");
	
	bf.close();

	
	}

}
