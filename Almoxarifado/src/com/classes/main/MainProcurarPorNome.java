package com.classes.main;

import com.classes.BO.PedidoBO;
import com.classes.DTO.Pedido;

public class MainProcurarPorNome {

	public static void main(String[] args) {

		// Teste Procurar por Nome
		// retorna o primeiro encontrado
		PedidoBO pedidoBO = new PedidoBO();
		Pedido pedido = new Pedido("Apollo Creed");
		pedido = pedidoBO.procurarPorNome(pedido);
		System.out.println(pedido);

	}
}