package com.classes.main;

import java.sql.Date;

import com.classes.BO.PedidoBO;
import com.classes.DTO.Pedido;

public class MainInsercao {
	public static void main(String[] args) {
		Date data = new Date(System.currentTimeMillis());
		// Teste Inserir
		PedidoBO pedidoBO = new PedidoBO();
		Pedido pedido = new Pedido(4, "4 vassouras", data);
		if (pedidoBO.inserir(pedido))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
		pedido = new Pedido(7, "7 fogões", data);
		if (pedidoBO.inserir(pedido))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
		pedido = new Pedido(2, "15 pinos de máquina agricola", data);
		if (pedidoBO.inserir(pedido))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
	}
}