
public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public boolean saca(double valor) {
		
		if(this.saldo >= valor + 0.2) {
			this.saldo -= valor + 0.2;
			return true;
		} else {
			System.out.println("Saldo insuficiente! Operação cancelada.");
			return false;			
		}
	}
	
	

}
