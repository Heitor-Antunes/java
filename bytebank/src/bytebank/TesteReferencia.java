package bytebank;

public class TesteReferencia {

	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("O saldo da Primeira Conta é: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		
		System.out.println("O saldo da Segunda Conta é: " + segundaConta.saldo);
		
		segundaConta.saldo += 100;
		
		System.out.println("O saldo da Segunda Conta é: " + segundaConta.saldo);
		System.out.println("O saldo da Primeira Conta é: " + primeiraConta.saldo);
		
		if(primeiraConta == segundaConta) {
			System.out.println("São as mesmas contas");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		
		Conta terceiraConta = new Conta();
		System.out.println(terceiraConta.agencia);
		System.out.println(terceiraConta.saldo);
		System.out.println(terceiraConta.numero);
		System.out.println(terceiraConta.titular);
		
	}
	
}
