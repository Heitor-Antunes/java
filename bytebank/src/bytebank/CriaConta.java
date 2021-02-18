package bytebank;

public class CriaConta {

	public static void main(String[] args) {
		
	Conta primeiraConta = new Conta();
	primeiraConta.saldo = 200;
	primeiraConta.agencia = 001;
	primeiraConta.numero = 123;
	primeiraConta.titular = "Heitor";
	
	System.out.println(primeiraConta.saldo);
	
	primeiraConta.saldo += 100;
	
	System.out.println("O saldo da Primeira Conta é: " + primeiraConta.saldo);
	
	Conta segundaConta = new Conta();
	segundaConta.saldo = 50;
	
	System.out.println("O saldo da Segunda Conta é: " + segundaConta.saldo);
	
	System.out.println("A soma dos saldos da Primeira Conta e Segunda Conta é: " + (primeiraConta.saldo + segundaConta.saldo));
	
	
	
	}

}
