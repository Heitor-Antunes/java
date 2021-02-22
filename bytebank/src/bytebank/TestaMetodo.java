package bytebank;

public class TestaMetodo {
	
	public static void main(String[] args) {
		
		Conta contaHeitor = new Conta();
		contaHeitor.titular = "Heitor";
		
		contaHeitor.saldo = 100;
		System.out.println(contaHeitor.saldo);
		
		contaHeitor.deposita(50);
		System.out.println("O saldo da conta de " + contaHeitor.titular + " é: " + contaHeitor.saldo);
		
		boolean naoSacou = contaHeitor.saca(200);
		System.out.println("O saldo da conta de " + contaHeitor.titular + " é: " + contaHeitor.saldo);
		System.out.println(naoSacou);
		
		boolean sacou = contaHeitor.saca(100);
		System.out.println("O saldo da conta de " + contaHeitor.titular + " é: " + contaHeitor.saldo);
		System.out.println(sacou);
		
		
	}

}
