package br.com.bytebank.banco.modelo;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void saca(double valor) throws SaldoInsuficienteException {
		if(this.saldo >= valor + 10) {
			super.saca(valor + 10);
		}
	}
	
	@Override
	public String toString() {
		return "Conta Poupança - " + super.toString();
	}
	
}
