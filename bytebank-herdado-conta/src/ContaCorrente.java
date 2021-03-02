
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
	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		saca(10);
		super.transfere(valor, destino);
	}

	@Override
	public void saca(double valor) throws SaldoInsuficienteException {
		double valorComTaxa = valor + 10;
		super.saca(valorComTaxa);

	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.10;
	}
	
	
}
