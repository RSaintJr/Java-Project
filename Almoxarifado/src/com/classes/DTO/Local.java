package com.classes.DTO;

public class Local {
		
       private int codigo;
	   private String setor;

	    public String getSetor() {
	        return setor;
	    }

	    public void setSetor(String setor) {
	        this.setor = setor;
	    }

	    @Override
	    public String toString() {
	        final StringBuilder sb = new StringBuilder("Local{");
	        sb.append("codigo=").append(codigo);
	        sb.append(", setor='").append(setor).append('\'');
	        sb.append('}');
	        return sb.toString();
	    }

		public int getCodigo() {
			return codigo;
		}

		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}
}
