package br.com.alura.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {
	
	public static void main(String[] args) throws IOException {
	
	OutputStream fos = new FileOutputStream("lorem2.txt");
	Writer osw = new OutputStreamWriter(fos);
	BufferedWriter br = new BufferedWriter(osw);
	
	br.write("Teste");
	br.newLine();
	br.write("Mais um teste");
	
	
	br.close();

	
	}

}
