package bytebank;

public class TesteSacaNegativo {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.deposita(100);
		conta.saca(200);
		System.out.println(conta.getSaldo());
		
		// Proibido
//		conta.saldo -= 150;
//		System.out.println(conta.saldo);
	}

}
