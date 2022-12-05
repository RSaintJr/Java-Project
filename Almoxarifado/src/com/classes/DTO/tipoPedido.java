package com.classes.DTO;

public class tipoPedido {
	
	public enum tipo{
		ENTRADA,
		SAIDA
	}
	
	tipo pedido;

	public String setar() {
		
		switch(pedido) {
			case ENTRADA:
				return "Entrada";
			case SAIDA:
				return "Saida";
			default: 
				return " ";
		}
	}
	
	
}
