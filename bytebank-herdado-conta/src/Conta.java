public abstract class Conta {
	
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int totalContas;
	
	public Conta(int agencia, int numero) {
		
		if(agencia <= 0) {
			System.out.println("A Agência não pode ser menor ou igual a 0");
			return;
		} this.agencia = agencia;
		
		if (numero <= 0 ) {
			System.out.println("O Número não pode ser menor ou igual a 0");
			return;
		} this.numero = numero;
		System.out.println("Conta criada com sucesso!");
		Conta.totalContas++;
	}
	
	public void deposita(double valor) {
		
		this.saldo += valor;
	}
	
	public abstract boolean saca(double valor);
	
	public boolean transfere(double valor, Conta destino) {
		
				if(saca(valor)) {
				destino.deposita(valor);
				return true;
				} return false;
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

}
