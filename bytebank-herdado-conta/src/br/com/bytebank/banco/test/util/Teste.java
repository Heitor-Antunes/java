package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class Teste {

    public static void main(String[] args) {

    	Conta cc1 = new ContaCorrente(22, 33);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNome("Heitor");
        cc1.setTitular(clienteCC1);
        cc1.deposita(222.0);

        Conta cc2 = new ContaPoupanca(22, 44);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNome("Heloisa");
        cc2.setTitular(clienteCC2);
        cc2.deposita(333.0);

        Conta cc3 = new ContaCorrente(22, 11);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNome("Chad");
        cc3.setTitular(clienteCC3);
        cc3.deposita(444.0);

        Conta cc4 = new ContaPoupanca(22, 22);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNome("Juliana");
        cc4.setTitular(clienteCC4);
        cc4.deposita(111.0);

            List<Conta> lista = new ArrayList<>();
            lista.add(cc1);
            lista.add(cc2);
            lista.add(cc3);
            lista.add(cc4);
            
            for (Conta conta : lista) {
				System.out.println(conta);
			}
            
//            SaldoDaContaComparator comparator = new SaldoDaContaComparator();
            TitularDaContaComparator titularComparator = new TitularDaContaComparator();
            lista.sort(titularComparator);
            System.out.println();
            
            System.out.print("Lista de Contas ordena por Titular: " + '\n' + '\n');

            //Retorna a mesma coisa que forEach
            for(int i = 0; i < lista.size(); i++) {
            	System.out.println(lista.get(i) + ", Titular: " + lista.get(i).getTitular().getNome());
            }
            
    }

}

class TitularDaContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {
		
		String nomeC1 = c1.getTitular().getNome();
		String nomeC2 = c2.getTitular().getNome();
		
		//Retorna um int
		return nomeC1.compareTo(nomeC2);
	}
	
}

class SaldoDaContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {
		if(c1.getSaldo() < c2.getSaldo()) {
			return -1;			
		} if(c1.getSaldo() > c2.getSaldo()) {
			return 1;
		} return 0;
	}
	
}
