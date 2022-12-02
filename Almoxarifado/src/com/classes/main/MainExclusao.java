package com.classes.main;

import com.classes.BO.PedidoBO;
import com.classes.DTO.Pedido;

public class MainExclusao {

	public static void main(String[] args) {

		// Teste Excluir
		PedidoBO pedidoBO = new PedidoBO();
		Pedido pedido = new Pedido(1);
		if (pedidoBO.excluir(pedido))
			System.out.println("Excluido com Sucesso");
		else
			System.out.println("Erro ao Excluir");

	}
}