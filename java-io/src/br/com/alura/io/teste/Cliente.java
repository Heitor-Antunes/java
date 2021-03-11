package br.com.alura.io.teste;

import java.io.Serializable;

public class Cliente implements Serializable{
	
	private static final long serialVersionUID = -468092198300702405L;

	private String nome;
	private String cpf;
	private String profissao;
	
	public String getNomeCpf() {
		return this.nome + this.cpf;
	}
	
	public String getNomeCpfProfissao() {
		return this.nome + this.cpf + this.profissao;
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return this.cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getProfissao() {
		return this.profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	@Override
	public String toString() {
		return "Cliente: " + this.nome;
	}

	
	
}
