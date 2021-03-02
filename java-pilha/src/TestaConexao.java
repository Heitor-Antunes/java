
public class TestaConexao {

	public static void main(String[] args) {
		
		try(Conexao con = new Conexao()) {
			con.leDados();
		} catch (IllegalStateException ex) {
			System.out.println("ERRO! Conexão interrompida!");
		}
		
//		Conexao con = null;
//		try {
//			con = new Conexao();
//			con.leDados();
//		} catch (IllegalStateException ex) {
//			System.out.println("ERRO! Conexão interrompida!");
//		} finally {
//			con.fecha();
//		}

	}

}
