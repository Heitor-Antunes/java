package bytebank;

public class TestaValores {
	
	public static void main(String[] args) {
		
		// Precisa informar os parâmetros do construtor
		Conta conta = new Conta(5050, 1234);
		Conta conta2 = new Conta(7674, 9837);
		Conta conta3 = new Conta(5050, 4321);
		
		// Código inconsistente
//		conta.setAgencia(-5050);
//		conta.setNumero(-1234);
		
		System.out.println("Agência: " + conta.getAgencia());
		System.out.println("Número: " + conta.getNumero());
		System.out.println(Conta.getTotalContas());
	}

}
