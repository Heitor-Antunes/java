package bytebank;

public class CriaConta {

	public static void main(String[] args) {
		
	Conta conta = new Conta();
	conta.saldo = 200;
	conta.agencia = 001;
	conta.numero = 123;
	conta.titular = "Heitor";
	
	System.out.println(conta.saldo);
	

	}

}
