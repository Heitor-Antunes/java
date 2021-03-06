package br.com.bytebank.banco.modelo;

public class GuardadorDeContas {

	private Conta[] referencias;
	private int posicaoLivre = 0;
	
	public GuardadorDeContas() {
		this.referencias = new Conta[10];
		
	}

	public void adiciona(Conta ref) {
		this.referencias[posicaoLivre] = ref;
		this.posicaoLivre++;
	}

	public int getQuantidadeElementos() {
		return this.posicaoLivre;
	}

	public Conta getReferencia(int pos) {
		return referencias[pos];
	}
	
	
}
