package com.classes.main;

import com.classes.BO.PedidoBO;
import com.classes.DTO.Pedido;

public class MainAlteracao {

	public static void main(String[] args) {
			
		// Teste Alterar	
		PedidoBO pedidoBO = new PedidoBO();
		Pedido pedido = new Pedido(1,"Fran Bow");
		pedidoBO.alterar(pedido);
		pedido = pedidoBO.procurarPorCodigo(pedido);
		System.out.println(pedido);
		
	}
}