package com.classes.DTO;

public class Estoque extends Local{
		
	private int codSetor;
        private int produto;
	private int ferramentas;
	private int componentes;
	    
	    public Estoque() {
	    	
	    }
	    
	    public Estoque(String setor) {
	    	super(setor);
		}
	    
	    public Estoque(int codSetor) {
	    	this.codSetor = codSetor;
	    }
	    
	    public Estoque(int codSetor,int produto,int ferramentas,int componentes) {
	    	this.codSetor = codSetor;
	    	this.produto = produto;
	    	this.ferramentas = ferramentas;
	    	this.componentes = componentes;
	    }

		public int getProduto() {
	        return produto;
	    }

	    public void setProduto(int produto) {
	        this.produto = produto;
	    }

	    public int getFerramentas() {
	        return ferramentas;
	    }

	    public void setFerramentas(int ferramentas) {
	        this.ferramentas = ferramentas;
	    }

	    public int getComponentes() {
	        return componentes;
	    }

	    public void setComponentes(int componentes) {
	        this.componentes = componentes;
	    }
	    
	    
	    public int getCodSetor() {
			return codSetor;
		}

		public void setCodSetor(int codSetor) {
			this.codSetor = codSetor;
		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Estoque [codSetor=");
			builder.append(codSetor);
			builder.append(", produto=");
			builder.append(produto);
			builder.append(", ferramentas=");
			builder.append(ferramentas);
			builder.append(", componentes=");
			builder.append(componentes);
			builder.append("]");
			return builder.toString();
		}

}
