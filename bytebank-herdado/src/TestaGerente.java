
public class TestaGerente {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Heitor");
		g1.setCpf("123.456.789-00");
		g1.setSalario(1000);
		g1.setSenha(1234);
		
		boolean autenticou = g1.autentica(1234);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		System.out.println(autenticou);
		System.out.println(g1.getBonificacao());
		
		
	}

}
