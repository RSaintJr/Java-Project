package com.classes.main;

import com.classes.BO.PedidoBO;
import com.classes.DTO.Pedido;

public class MainProcurarPorCodigo {

	public static void main(String[] args) {
			
		// Teste Procurar por Codigo
		PedidoBO pedidoBO = new PedidoBO();
		Pedido pedido = new Pedido(3);
		pedido = pedidoBO.procurarPorCodigo(pedido);
		System.out.println(pedido);
		
	}
}