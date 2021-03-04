package br.com.bytebank.banco.modelo.especial;

import br.com.bytebank.banco.modelo.Conta;

public class ContaEspecial extends Conta {
	
	public ContaEspecial(int agencia, int numero) {
		super(agencia, numero);
	}
	
	//Só é possível usar o atributo "saldo" da classe mãe Conta, por ser um atributo com
	//a visibilidade "protected". Pois ContaEspecial e Conta possuem pacotes diferentes 
	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}
	
}
