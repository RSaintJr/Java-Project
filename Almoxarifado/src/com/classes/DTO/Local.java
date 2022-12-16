package com.classes.DTO;

public class Local {
		
	 	
		private int codigo;
		private	String setor;
	 	
		public Local(int codigo,String setor) {
			this.codigo = codigo;
			this.setor = setor;
		}
		
		public Local(int codigo) {
			this.codigo = codigo;
		}
		
		public Local(String setor) {
			this.setor = setor;
		}
		
		public Local() {
			
		}

		public String getSetor() {
	        return setor;
	    }

	    public void setSetor(String setor) {
	        this.setor = setor;
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
			builder.append("Local [codigo=");
			builder.append(codigo);
			builder.append(", setor=");
			builder.append(setor);
			builder.append("]");
			return builder.toString();
		}

}
