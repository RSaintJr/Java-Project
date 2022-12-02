package com.classes.DTO;

public class Estoque {
		
		private int codigo;
		private int produto;
	    private int ferramentas;
	    private int componentes;

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
	    
	    public int getCodigo() {
			return codigo;
		}

		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}

	    @Override
	    public String toString() {
	        final StringBuilder sb = new StringBuilder("Estoque{");
	        sb.append("codigo=").append(codigo);
	        sb.append(", produto=").append(produto);
	        sb.append(", ferramentas=").append(ferramentas);
	        sb.append(", componentes=").append(componentes);
	        sb.append('}');
	        return sb.toString();
	    }

}
