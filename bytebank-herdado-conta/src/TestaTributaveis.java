
public class TestaTributaveis {
	
	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(7777, 1234);
		cc.deposita(1000);
		
		SeguroDeVida sv = new SeguroDeVida();
		
		ContaPoupanca cp = new ContaPoupanca(1111, 1234);
		
		CalculadorImposto ci = new CalculadorImposto();
		ci.calculaImposto(cc);
		ci.calculaImposto(sv);
		
//		Conta poupança não assinou o  contrato Tributável
//		ci.calculaImposto(cp);
		
		System.out.println(ci.getTotalImposto());
	}

}
