package com.classes.main;

import com.classes.BO.PedidoBO;
import com.classes.DTO.Pedido;

public class MainExiste {

	public static void main(String[] args) {

		// Teste Existe
		// Verifica se existe outra pessoa com o mesmo nome
		PedidoBO pedidoBO = new PedidoBO();
		Pedido pedido = new Pedido("Fran Bow");
		if (pedidoBO.existe(pedido))
			System.out.println("Pessoa Encontrada");
		else
			System.out.println("Nao Encontrada");

	}
}