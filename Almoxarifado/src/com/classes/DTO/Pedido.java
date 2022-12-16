package com.classes.DTO;

import java.util.Date;

public class Pedido {
	
	private int codigo;
	private int pessoaCod;
    private int codProduto;
    private boolean entrada;
    private Date data;
    
    public Pedido() {
        
    }
    
    public Pedido(int codigo ) {
    	setCodigo(codigo);
    }
    
    public Pedido(int codigo,int codProduto,boolean entrada) {
    	setCodigo(codigo);
    	setCodProduto(codProduto);
    	setEntrada(entrada);
    }
    
    public Pedido(int pessoaCod,int codProduto,boolean opcao,Date data) {
    	this.pessoaCod = pessoaCod;
		this.codProduto = codProduto;
		this.entrada = opcao;
		this.data = data;
	}

    public Date getData() {
        return data;
    }

    public void setData(java.sql.Date date) {
        this.data = date;
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
	
	public int getPessoaCod() {
		return pessoaCod;
	}

	public void setPessoaCod(int pessoaCod) {
		this.pessoaCod = pessoaCod;
	}
	
	public boolean isEntrada() {
		return entrada;
	}

	public void setEntrada(boolean entrada) {
		this.entrada = entrada;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pedido [codigo=");
		builder.append(codigo);
		builder.append(", pessoaCod=");
		builder.append(pessoaCod);
		builder.append(", codProduto=");
		builder.append(codProduto);
		builder.append(", entrada=");
		builder.append(entrada);
		builder.append(", data=");
		builder.append(data);
		builder.append("]");
		return builder.toString();
	}

}