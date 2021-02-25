
public class TesteReferencias {

	public static void main(String[] args) {
		
		Gerente g = new Gerente();
		g.setNome("Heitor");
		g.setSalario(2000);
		
		Funcionario f = new Funcionario();
		f.setNome("Juliana");
		f.setSalario(3000);
		
		Editor e = new Editor();
		e.setNome("Pedro");
		e.setSalario(5000);
		
		ControlaBonificacao controle = new ControlaBonificacao();
		controle.registra(g);
		controle.registra(f);
		controle.registra(e);
		
		System.out.println(g.getNome());
		System.out.println(f.getNome());
		System.out.println(e.getNome());
		System.out.println(controle.getSoma());

	}

}
