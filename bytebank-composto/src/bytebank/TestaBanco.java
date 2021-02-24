package bytebank;

public class TestaBanco {
	
	public static void main(String[] args) {
		
		Cliente heitor = new Cliente();
		heitor.nome = "Heitor Antunes";
		heitor.cpf = "123.456.789.00";
		heitor.profissao = "Desenvolvedor";
		
		Conta contaHeitor = new Conta();
		contaHeitor.titular = heitor;
		contaHeitor.deposita(100);
		
		System.out.println("O saldo da conta de " + contaHeitor.titular.nome + " é: " + contaHeitor.getSaldo());
		
	}

}
