package br.com.alura.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;



public class TesteEscritaLeitura {

	public static void main(String[] args) throws IOException {

		OutputStream fos = new FileOutputStream("testando-escrita-leitura.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("Testando criação de escrita em documentos");
		bw.newLine();
		bw.write("Até aqui, bem sucedida!");
		
		bw.close();
		
		InputStream fis = new FileInputStream("testando-escrita-leitura.txt");
		Reader isr = new InputStreamReader(fis);
		BufferedReader bf = new BufferedReader(isr);
		
		String linha = bf.readLine();
		
		while(linha != null) {
			System.out.println(linha);
			linha = bf.readLine();
		}
		
		bf.close();
		
		
	}

}
