package bytebank;

public class TestaContaSemCliente {
	
	public static void main(String[] args) {
		
		Conta contaHeitor = new Conta();
		
		System.out.println(contaHeitor.getSaldo());
		System.out.println(contaHeitor.titular);
		
		contaHeitor.titular = new Cliente();
		System.out.println(contaHeitor.titular);
				
		contaHeitor.titular.nome = "Heitor";
		System.out.println("O nome do titular da conta é: " + contaHeitor.titular.nome);
		
	}

}
