
public class TestaSistema {
	
	public static void main(String[] args) {
		
		Gerente g = new Gerente();
		g.setSenha(1234);
		
		Administrador adm = new Administrador();
		adm.setSenha(4321);
		
		Cliente c = new Cliente();
		c.setSenha(1234);

		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		si.autentica(adm);
		si.autentica(c);
		
	}

}
