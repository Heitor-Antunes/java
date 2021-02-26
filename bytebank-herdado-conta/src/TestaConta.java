
public class TestaConta {
	
	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(1990, 12345);
		cc.deposita(100);
		
		System.out.println("Saldo CC: " + cc.getSaldo());
		
		ContaPoupanca cp = new ContaPoupanca(2020, 54321);
		cp.deposita(200);
		System.out.println("Saldo CP: " + cp.getSaldo());

		cp.saca(10);
		System.out.println("Saldo CP: " + cp.getSaldo());
		
//		cc.transfere(10, cp);
//		System.out.println("Saldo CC: " + cc.getSaldo());
//		System.out.println("Saldo CP: " + cp.getSaldo());
//		

	}

}
