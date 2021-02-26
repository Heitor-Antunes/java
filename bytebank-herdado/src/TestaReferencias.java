
public class TestaReferencias {

	public static void main(String[] args) {
		
//		Funcionario f = new Funcionario();
//		f.setNome("Funcionário Abstrato");
//		f.setSalario(1000);
		
		Gerente g = new Gerente();
		g.setNome("Heitor");
		g.setSalario(2000);
		
		Editor e = new Editor();
		e.setNome("Pedro");
		e.setSalario(5000);
		
		ControlaBonificacao controle = new ControlaBonificacao();
		controle.registra(g);
		controle.registra(e);
		
		System.out.println(g.getNome());
		System.out.println(e.getNome());
		System.out.println(controle.getSoma());

	}

}
