package com.classes.DTO;

import java.util.Date;

public class Pedido {
	
	private int codigo;
    private String nome;
    private String descricao;
    private Date data;
    private boolean saida;
    private boolean entrada;

    public Pedido() {
        
    }
    
    public Pedido(int codigo ) {
    	setCodigo(codigo);
    }
    
    public Pedido(String nome) {
    	setNome(nome);
    }
    
    public Pedido(int codigo,String nome) {
    	setCodigo(codigo);
    	setNome(nome);
    }
    
    public Pedido(String nome, String descricao, Date data, boolean saida, boolean entrada) {
		this.nome = nome;
		this.descricao = descricao;
		this.data = data;
		this.saida = saida;
		this.entrada = entrada;
	}

    public Date getData() {
        return data;
    }

    public void setData(java.sql.Date date) {
        this.data = new Date();
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isSaida() {
        return saida;
    }

    public void setSaida(boolean saida) {
        this.saida = saida;
    }

    public boolean isEntrada() {
        return entrada;
    }

    public void setEntrada(boolean entrada) {
        this.entrada = entrada;
    }

  
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
		builder.append("Pedido [codigo=");
		builder.append(codigo);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", pedido=");
		builder.append(descricao);
		builder.append(", data=");
		builder.append(data);
		builder.append(", saida=");
		builder.append(saida);
		builder.append(", entrada=");
		builder.append(entrada);
		builder.append("]");
		return builder.toString();
	}
	
	
}