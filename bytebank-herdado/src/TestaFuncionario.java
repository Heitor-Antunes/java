
public class TestaFuncionario {
	
	public static void main(String[] args) {
		
		Funcionario funcionario = new Gerente();
		
		funcionario.setNome("Heitor Antunes");
		funcionario.setCpf("123.456.789.00");
		funcionario.setSalario(1000);
		
		System.out.println("O valor da bonificação é: " + funcionario.getBonificacao());
	
	}

}
