package com.classes.DTO;

public class Pessoa {
	
	private int codigo;	
	private String nome;
	private String cpf;
	private int telefone;
	
	public Pessoa(){
		
	}
	
	public Pessoa(String nome) {
		setNome(nome);
	}
	
	public Pessoa(String nome,String cpf, int telefone) {
		setCpf(cpf);
		setNome(nome);
		setTelefone(telefone);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [codigo=");
		builder.append(codigo);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", cpf=");
		builder.append(cpf);
		builder.append(", telefone=");
		builder.append(telefone);
		builder.append("]");
		return builder.toString();
	}
	
}
