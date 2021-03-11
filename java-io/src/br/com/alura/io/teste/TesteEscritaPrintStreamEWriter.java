package br.com.alura.io.teste;

import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscritaPrintStreamEWriter {
	
	public static void main(String[] args) throws IOException {
	
//	OutputStream fos = new FileOutputStream("lorem2.txt");
//	Writer osw = new OutputStreamWriter(fos);
//	BufferedWriter br = new BufferedWriter(osw);
		
//	BufferedWriter bf = new BufferedWriter(new FileWriter("lorem.txt"));
//	PrintStream ps = new PrintStream(new File("lorem.txt"));	
	PrintWriter ps = new PrintWriter("lorem.txt");
	
	
	ps.println("Testando println do PrintStream");
	ps.println();
	ps.println("Testando println do PrintStream");
	ps.println("Testando println do PrintStream");
	
	ps.close();

	
	}

}
