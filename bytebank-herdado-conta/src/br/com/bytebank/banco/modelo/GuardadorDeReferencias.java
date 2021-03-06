package br.com.bytebank.banco.modelo;

public class GuardadorDeReferencias {
	
	private Object[] referencias;
	private int posicaoLivre = 0;
	
	public GuardadorDeReferencias() {
		this.referencias = new Object[5];
	}

	public void adiciona(Object ref) {
		this.referencias[posicaoLivre] = ref;
		posicaoLivre++;
	}

	public int getQuantidadeElementos() {
		return posicaoLivre;
	}

	public Object getReferencia(int pos) {
		return this.referencias[pos];
	}
	
	

}
