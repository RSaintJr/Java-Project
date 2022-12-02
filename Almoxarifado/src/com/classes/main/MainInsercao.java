package com.classes.main;

import java.sql.Date;

import com.classes.BO.PedidoBO;
import com.classes.DTO.Pedido;

public class MainInsercao {
	public static void main(String[] args) {
		Date data = new Date(System.currentTimeMillis());
		// Teste Inserir
		PedidoBO pedidoBO = new PedidoBO();
		Pedido pedido = new Pedido("Fran Bow", "4 vassouras", data ,false,true);
		if (pedidoBO.inserir(pedido))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
		pedido = new Pedido("Selen", "7 fogões", data ,false,true);
		if (pedidoBO.inserir(pedido))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
		pedido = new Pedido("Apollo Creed", "15 pinos de máquina agricola", data ,true,false);
		if (pedidoBO.inserir(pedido))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
	}
}