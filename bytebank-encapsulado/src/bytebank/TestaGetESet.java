package bytebank;

public class TestaGetESet {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta();
		
		conta.deposita(100);
		System.out.println(conta.getSaldo());
		
		conta.setNumero(123456);
		System.out.println("O Número da conta é: " +conta.getNumero());
		
		conta.setAgencia(1990);
		System.out.println("A Agência da conta é: " + conta.getAgencia());

		
		Cliente heitor = new Cliente();
		heitor.setNome("Heitor Antunes");
		heitor.setCpf("123.456.789.00");
		heitor.setProfissao("Desenvolvedor");
		
		conta.setTitular(heitor);
		
		System.out.println("O nome do titular desta conta é " + heitor.getNome());
		
	}
	
}

