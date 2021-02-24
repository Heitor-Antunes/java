
public class TesteReferencias {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Heitor");
		g1.setSalario(2000);
		
		Funcionario f1 = new Funcionario();
		f1.setNome("Juliana");
		f1.setSalario(3000);
		
		Editor e1 = new Editor();
		e1.setNome("Pedro");
		e1.setSalario(5000);
		
		ControlaBonificacao controle = new ControlaBonificacao();
		controle.registra(g1);
		controle.registra(f1);
		controle.registra(e1);
		
		System.out.println(g1.getNome());
		System.out.println(f1.getNome());
		System.out.println(e1.getNome());
		System.out.println(controle.getSoma());

	}

}
