
public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
//	public boolean transfere(double valor, Conta destino) {
//		
//		if(saca(valor + 10)) {
//			destino.deposita(valor);
//			return true;
//		} else {
//			return false;
//		}
//	}
	
	@Override
	public boolean transfere(double valor, Conta destino) {
		saca(10);
		return super.transfere(valor, destino);
	}

	@Override
	public boolean saca(double valor) {
			
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			System.out.println("Saldo insuficiente! Operação não realizada.");
			return false;
		}
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.10;
	}
	
	
}
