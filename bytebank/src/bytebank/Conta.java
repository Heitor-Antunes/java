package bytebank;

public class Conta {
	
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	public void deposita(double valor) {
		
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		
		if(this.saldo >= valor) {
			this.saldo -= valor;	
			return true;
		} else {
			System.out.println("Saldo insuficiente! Operação não realizada.");
			return false;
		}
	}
	
	public void transfere(double valor, Conta conta) {

	}

}
