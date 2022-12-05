package com.classes.DTO;

import java.util.Date;

public class Pedido {
	
	private int codigo;
    private int codProduto;
    private String descricao;
    private Date data;
    
    public Pedido() {
        
    }
    
    public Pedido(int codigo ) {
    	setCodigo(codigo);
    }
    
    public Pedido(String descricao) {
    	setDescricao(descricao);
    }
    
    public Pedido(int codigo,String descricao) {
    	setCodigo(codigo);
    	setDescricao(descricao);
    }
    
    public Pedido(int codProduto, String descricao, Date data) {
		this.codProduto = codProduto;
		this.descricao = descricao;
		this.data = data;
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

	public int getCodProduto() {
		return codProduto;
	}

	public void setCodProduto(int codProduto) {
		this.codProduto = codProduto;
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
		builder.append(", codProduto=");
		builder.append(codProduto);
		builder.append(", descricao=");
		builder.append(descricao);
		builder.append(", data=");
		builder.append(data);
		builder.append("]");
		return builder.toString();
	}
	
}