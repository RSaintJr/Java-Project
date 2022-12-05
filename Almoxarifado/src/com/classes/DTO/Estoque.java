package com.classes.DTO;

public class Estoque extends Local{
		
            private int produto;
	    private int ferramentas;
	    private int componentes;
	    
	    public Estoque() {
	    	
	    }
	    
	    public Estoque(String setor,int produto, int ferramentas, int componentes) {
	    	super(setor);
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
	    
	    
	    @Override
	    public String toString() {
	        final StringBuilder sb = new StringBuilder("Estoque{");
	        sb.append(", produto=").append(produto);
	        sb.append(", ferramentas=").append(ferramentas);
	        sb.append(", componentes=").append(componentes);
	        sb.append('}');
	        return sb.toString();
	    }

}
