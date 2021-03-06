package br.com.bytebank.banco.modelo;

/**
 * Classe representa a moldura de uma Conta.
 * 
 * 
 * @author heitorantunes
 * @version 0.1
 *
 */

public abstract class Conta {
	
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int totalContas;
	
	
	/**
	 * Construtor para incializar o objeto Conta a partir da agência e numero
	 * 
	 * @param agencia
	 * @param numero
	 */
	public Conta(int agencia, int numero) {
		
		if(agencia <= 0) {
			System.out.println("A Agência não pode ser menor ou igual a 0");
			return;
		} this.agencia = agencia;
		
		if (numero <= 0 ) {
			System.out.println("O Número não pode ser menor ou igual a 0");
			return;
		} this.numero = numero;
		Conta.totalContas++;
	}
	
	public void deposita(double valor) {
		
		this.saldo += valor;
	}
	
	public void saca(double valor) throws SaldoInsuficienteException {
		if(this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo insuficiente! Operação não realizada. " + 
		"Saldo: " + this.saldo + ", " + "Valor: " + valor);
		}
		this.saldo -= valor;
	}
	
	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
			this.saca(valor);
			destino.deposita(valor);
	}
		
	
	public double getSaldo() {
		return this.saldo;
		
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotalContas() {
		return Conta.totalContas;
	}
	
	@Override
	public String toString() {
		return "Agência: " + this.agencia + " e " + "Número: " + this.numero;
	}

}
