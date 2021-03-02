
public class TestaContaComExeceptionChecked {
	
	public static void main(String[] args) {
		
		ContaException c = new ContaException();
		try {
			c.deposita();
		} catch(MinhaException ex) {
			System.out.println("Tratamento da Exception");
		}
	
	}

}
